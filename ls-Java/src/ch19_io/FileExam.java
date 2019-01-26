package ch19_io;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FileExam extends JFrame {

	private JPanel contentPane;
	private JTextField tfFileName;
	private JTextArea ta;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileExam frame = new FileExam();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FileExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("파일이름");
		lblNewLabel.setBounds(14, 12, 62, 18);
		contentPane.add(lblNewLabel);
		
		tfFileName = new JTextField();
		tfFileName.setBounds(90, 9, 209, 24);
		contentPane.add(tfFileName);
		tfFileName.setColumns(10);
		
		JButton button1 = new JButton("확인");
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// File: 파일의 정보를 카리키는 클래스
				File file = new File(tfFileName.getText());
				
				// 파일이 존재하지 않으면
				if (!file.exists()) {
					try {
						file.createNewFile();		// 빈 파일 생성
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				String str = "파일이름: " + file.getName() + "\n" +
								"파일크기: " + file.length() + "\n" +
								"상위폴더: " + file.getParent();
				ta.setText(str);
			}
		});
		button1.setBounds(313, 8, 105, 27);
		contentPane.add(button1);
		
		ta = new JTextArea();
		ta.setBounds(14, 42, 404, 199);
		contentPane.add(ta);
	}
}
