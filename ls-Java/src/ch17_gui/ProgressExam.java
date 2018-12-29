package ch17_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 프로그레스, 버튼 배치
 * 프로그레스를 field로
 * 버튼 클릭 이벤트 처리
 */
public class ProgressExam extends JFrame {

	private JPanel contentPane;
	private JProgressBar progress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgressExam frame = new ProgressExam();
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
	public ProgressExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		progress = new JProgressBar();
		progress.setStringPainted(true);
		contentPane.add(progress);
		
		JButton btnStart = new JButton("시작");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 멀티스레드를 익명내부클래스 방식으로 구현
				Thread th = new Thread(new Runnable() {
					@Override
					public void run() {
						for (int i = 1; i <= 100; i++) {
							// 진행률 값 변경
							progress.setValue(i);

							try {
								Thread.sleep(10);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
						}
						// 대화상자 띄우기
						// showMessageDialog(parent, "메시지")
						JOptionPane.showMessageDialog(ProgressExam.this, "완료되었습니다.");
					}
				});
				th.start();
			}
		});
		contentPane.add(btnStart);
	}

}
