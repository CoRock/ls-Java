package ch17_gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.metal.MetalSliderUI;

/**
 * 슬라이더, 라벨, 패널 배치
 * 슬라이더는 전역변수로
 * 슬라이더의 max 값 변경
 * 전역변수 추가
 * change 이벤트 구현
 * 슬라이더의 세부 옵션 - 눈금, 숫자 표시 majorTick, minorTick, paintLabels, paintTicks
 */
public class SliderExam extends JFrame {

	private JPanel contentPane;
	
	// convert local to field
	private JSlider sliderR;
	private JSlider sliderG;
	private JSlider sliderB;
	private JPanel panel;
	
	// 추가
	private int red, green, blue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SliderExam frame = new SliderExam();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SliderExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		// 절대좌표 레이아웃(null layout)
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBounds(14, 250, 404, 191);
		contentPane.add(panel);
		
		sliderR = new JSlider();
		
		sliderR.setMajorTickSpacing(40);	// 큰 눈금
		sliderR.setMinorTickSpacing(10);	// 작은 눈금
		sliderR.setPaintTicks(true);			// 눈금 표시
		sliderR.setPaintLabels(true);			// 숫자 표시
		
		// 슬라이더의 값이 바뀔 때 호출
		sliderR.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				red = sliderR.getValue();	// 슬라이더의 설정값
				panel.setBackground(new Color(red, green, blue));	// 패널의 배경색상 변경
			}
		});
		sliderR.setValue(0);
		sliderR.setMaximum(255);
		// setBounds(x, y, width, height)
		sliderR.setBounds(14, 42, 404, 60);
		contentPane.add(sliderR);
		
		JLabel lblNewLabel = new JLabel("Red");
		lblNewLabel.setBounds(14, 12, 62, 18);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Green");
		lblNewLabel_1.setBounds(14, 114, 62, 18);
		contentPane.add(lblNewLabel_1);
		
		sliderG = new JSlider();
		sliderG.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				green = sliderG.getValue();
				panel.setBackground(new Color(red, green, blue));
			}
		});
		sliderG.setUI(new MetalSliderUI() {
			@Override
			protected void scrollDueToClickInTrack(int dir) {
				green = sliderG.getValue();
				
				// 마우스 좌표값을 슬라이더의 value로 환산
				green = valueForXPosition(sliderG.getMousePosition().x);
				
				// 슬라이더 value 변경
				sliderG.setValue(green);
				panel.setBackground(new Color(red, green, blue));
			}
		});
		sliderG.setValue(0);
		sliderG.setMaximum(255);
		sliderG.setBounds(14, 144, 404, 26);
		contentPane.add(sliderG);
		
		JLabel lblNewLabel_2 = new JLabel("Blue");
		lblNewLabel_2.setBounds(14, 182, 62, 18);
		contentPane.add(lblNewLabel_2);
		
		sliderB = new JSlider();
		sliderB.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				blue = sliderB.getValue();
				panel.setBackground(new Color(red, green, blue));
			}
		});
		sliderB.setValue(0);
		sliderB.setMaximum(255);
		sliderB.setBounds(14, 212, 404, 26);
		contentPane.add(sliderB);
	}
}
