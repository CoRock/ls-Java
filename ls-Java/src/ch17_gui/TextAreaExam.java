package ch17_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * North에 Panel, Panel 내부에 텍스트필드, 버튼
 * Center에 ScrollPane
 * TextArea를 ScrollPane의 Viewport 영역에 배치
 * TextArea를 field 변수로 변환
 * 이벤트 처리 - 개별로 하고, 전체를 묶어서 하려면 코드를 직접 수정, AbstractAction으로 해도 코드를 수정해야 함
 */
public class TextAreaExam extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextAreaExam frame = new TextAreaExam();
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
	public TextAreaExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		tf = new JTextField();
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
			}
		});
		panel.add(tf);
		tf.setColumns(10);
		
		JButton btnAdd = new JButton("확인");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
			}
		});
		panel.add(btnAdd);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		ta = new JTextArea();
		scrollPane.setViewportView(ta);
	}
	
	/**
	 * append(): 텍스트 덧붙임
	 * setText(): 텍스트 새로 입력
	 */
	void input() {
		ta.append(tf.getText() + "\n");	// 줄바꿈 문자 포함
		tf.setText("");			// 텍스트 필드 초기화
		tf.requestFocus();	// 입력 커서 설정
	}

}
