package ch17_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class ComboExam extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboExam frame = new ComboExam();
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
	public ComboExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTextArea ta = new JTextArea();
		contentPane.add(ta, BorderLayout.CENTER);
		
		JComboBox cboDan = new JComboBox();
		cboDan.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == ItemEvent.SELECTED) {
					ta.setText("");
					int dan = cboDan.getSelectedIndex() + 2;
					for (int i = 1; i <=9; i++) {
						ta.append(String.format("%2d x %2d = %2d\n", dan, i, dan * i));
					}
					
				}
				/**
				 * getSelectedItem(): 선택한 아이템의 값
				 * getSelectedIndex(): 선택한 아이템의 인덱스(0부터)
				 * 
				 * ItemEvent.SELECTED
				 * ItemEvent.DESELECTED
				 */
				// System.out.println("getSelectedItem(): " + cboDan.getSelectedItem());
				// System.out.println("getSelectedIndex(): " + cboDan.getSelectedIndex());
			}
		});
		
		cboDan.setModel(new DefaultComboBoxModel(new String[] {"2단", "3단", "4단", "5단", "6단", "7단", "8단", "9단"}));
		contentPane.add(cboDan, BorderLayout.NORTH);
	}

}
