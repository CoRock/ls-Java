package ch17_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.border.EmptyBorder;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 * ScrollPane을 Center에 배치
 * Tree를 ScrollPane의 Viewport 영역에 배치
 */
public class TreeExam extends JFrame {

	// 멤버 변수
	private JPanel contentPane;
	
	// 코드 추가
	private Object[] obj = { "프로그램", "시스템", "디자인" };		// Object 배열
	
	/**
	 * 먼저 Object 배열을 작업한 후 벡터를 이용하여 수정
	 * Object 클래스의 toString() method를 오버라이딩
	 * toString() method는 나중에 오버라이딩할 것
	 */
	private Vector<Vector> node1 = new Vector<Vector>() {
		@Override
		public String toString() {
			return "Lesson";
		}
	};
	
	private Vector<String> node2 = new Vector<String>() {
		@Override
		public String toString() {
			return "Java";
		}
	};
	private Vector<String> node3 = new Vector<String>() {
		@Override
		public String toString() {
			return "XML";
		}
	};
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TreeExam frame = new TreeExam();
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
	public TreeExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
//		JTree tree = new JTree();
//		tree.setModel(new DefaultTreeModel(
//			new DefaultMutableTreeNode("과일") {
//				{
//					DefaultMutableTreeNode node_1;
//					DefaultMutableTreeNode node_2;
//					node_1 = new DefaultMutableTreeNode("여름과일");
//						node_2 = new DefaultMutableTreeNode("수박");
//							node_2.add(new DefaultMutableTreeNode("씨 없는 수박"));
//						node_1.add(node_2);
//						node_1.add(new DefaultMutableTreeNode("참와"));
//					add(node_1);
//					node_1 = new DefaultMutableTreeNode("가을과일");
//						node_2 = new DefaultMutableTreeNode("사과");
//							node_2.add(new DefaultMutableTreeNode("대구사과"));
//							node_2.add(new DefaultMutableTreeNode("청주사과"));
//						node_1.add(node_2);
//					add(node_1);
//					add(new DefaultMutableTreeNode("겨울과일"));
//				}
//			}
//		));
		node1.add(node2);		// node1에 node2를 붙임
		node1.add(node3);		// node1에 node3를 붙임
		node2.add("C++");		// node2에 아이템 추가
		node2.add("Java");
		node2.add("JSP");
		node3.add("XSLT");
		node3.add("DOM");
		obj[0] = node1;			// node1을 root node로 설정
		
		JTree tree = new JTree(obj);		// 트리 인스턴스 생성
		tree.setRootVisible(true);			// root node 표시
		scrollPane.setViewportView(tree);
	}

}
