package ch17_gui;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridExam extends JFrame {

	public GridExam() {
		/**
		 * JFrame의 기본 레이아웃은 BorderLayout
		 * 기본 레이아웃을 쓰지 않고 GridLayout으로 변경
		 * 	new GridLayout(rows, cols)
		 * 
		 * cf. FlowLayout: 순서대로 배치(왼쪽에서 오른쪽으로, 위에서 아래로)
		 * 	setLayout(new FlowLayout());
		 */
		setLayout(new GridLayout(2, 3));
		for (int i = 1; i <= 6; i++) {
			JButton button = new JButton("button" + i);
			add(button);		// 프레임에 버튼 추가
		}		
		setSize(300, 300);		// 화면 사이즈 설정
		setVisible(true);		// 프레임을 화면에 표시
		
		// 윈도우 닫기 버튼 동작 정의
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new GridExam();
	}
	
}
