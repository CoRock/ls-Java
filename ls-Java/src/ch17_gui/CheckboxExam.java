package ch17_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

/**
 * North에 Panel, Panel 내부에 JCheckBox
 * South에 Button
 * Center에 ScrollPane
 * TextArea를 ScrollPane의 Viewport 영역에 배치
 * TextArea를 field 변수로 변환
 * 이벤트 처리 - 개별로 하고, 전체를 묶어서 하려면 코드를 직접 수정, AbstractAction으로 해도 코드를 수정해야 함
 */
public class CheckboxExam extends JFrame {

	private JPanel contentPane;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckboxExam frame = new CheckboxExam();
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
	public CheckboxExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JCheckBox ckJava = new JCheckBox("Java");
		ckJava.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				// TextArea.setText(): 변경 | append(): 덧붙임
				// ta.setText("Java를 신청했습니다.");
				// getStateChange(): 체크박스의 체크상태를 가져옴
				System.out.println(e.getStateChange());
				
				if (e.getStateChange() == ItemEvent.SELECTED) {					
					ta.append("Java를 신청했습니다.\n");
				} else {
					ta.append("Java를 취소했습니다.\n");				
				}
			}
		});
		panel.add(ckJava);
		
		JCheckBox ckC = new JCheckBox("C");
		ckC.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {					
					ta.append("C를 신청했습니다.\n");
				} else {
					ta.append("C를 취소했습니다.\n");					
				}
			}
		});
		panel.add(ckC);
		
		JCheckBox ckIoT = new JCheckBox("IoT");
		ckIoT.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {					
					ta.append("IoT를 신청했습니다.\n");
				} else {
					ta.append("IoT를 취소했습니다.\n");					
				}
			}
		});
		panel.add(ckIoT);
		
		JCheckBox ckDb = new JCheckBox("DB");
		ckDb.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {					
					ta.append("DB를 신청했습니다.\n");
				} else {
					ta.append("DB를 취소했습니다.\n");					
				}
			}
		});
		panel.add(ckDb);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
			}
		});
		panel.add(btnClear);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		ta = new JTextArea();
		scrollPane.setViewportView(ta);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnExit, BorderLayout.SOUTH);
	}

}
