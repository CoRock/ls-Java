package ch17_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * 화면 배치
 * 리스트 모델은 디자이너로 하지 말고 코드로 작성
 * 멤버변수에 model 추가
 * 엔터키 입력 가능하도록 TextField에 ActionEvent 추가
 */
public class ListExam extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	
	// 추가
	private DefaultListModel model;
	private JList list;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListExam frame = new ListExam();
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
	public ListExam() {
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
				model.addElement(tf.getText());
				
				list.setModel(model);
				
				tf.setText("");
				tf.requestFocus();
			}
		});
		panel.add(tf);
		tf.setColumns(10);
		
		JButton btnAdd = new JButton("추가");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				/**
				 * 텍스트필드.getText(): 입력된 내용 꺼내기
				 * 텍스트필드.setText("입력할 내용")
				 */
				model.addElement(tf.getText());
				
				// 데이터 모델 갱신
				list.setModel(model);
				
				// 입력포커스 설정
				tf.setText("");
				tf.requestFocus();
			}
		});
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int selectedIntex = list.getSelectedIndex();
				if (selectedIntex != -1) {					
					System.out.println(selectedIntex);
					model.remove(selectedIntex);
				}
			}
		});
		panel.add(btnDelete);
		
		// 데이터 모델 생성
		model = new DefaultListModel<>();
		model.addElement("서울");
		model.addElement("인천");
		model.addElement("부산");
		model.addElement("대전");
		model.addElement("춘천");

		// JList에 모델을 입력
		list = new JList(model);
		contentPane.add(list, BorderLayout.CENTER);
	}

}
