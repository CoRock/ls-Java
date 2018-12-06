package ch17_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

/**
 * FlowLayout으로 변경
 * JRadio 버튼 추가
 * 라디오버튼 모두 선택 => 우클릭 => Set ButtonGroup => New standard
 * 라디오버튼 우클릭 => Add event handler => item => itemStateChanged
 */
public class RadioExam extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioExam frame = new RadioExam();
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
	public RadioExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JRadioButton rdoRed = new JRadioButton("Red");
		rdoRed.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				contentPane.setBackground(Color.RED);
			}
		});
		buttonGroup.add(rdoRed);
		contentPane.add(rdoRed);
		
		JRadioButton rdoGreen = new JRadioButton("Green");
		rdoGreen.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				contentPane.setBackground(Color.GREEN);
			}
		});
		buttonGroup.add(rdoGreen);
		contentPane.add(rdoGreen);
		
		JRadioButton rdoBlue = new JRadioButton("Blue");
		rdoBlue.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				contentPane.setBackground(Color.BLUE);
			}
		});
		buttonGroup.add(rdoBlue);
		contentPane.add(rdoBlue);
		
		JRadioButton rdoCyan = new JRadioButton("Cyan");
		rdoCyan.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				contentPane.setBackground(Color.CYAN);
			}
		});
		buttonGroup.add(rdoCyan);
		contentPane.add(rdoCyan);
	}

}
