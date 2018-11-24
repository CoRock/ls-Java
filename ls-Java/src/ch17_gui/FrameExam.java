package ch17_gui;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * AWT: java + c 개발
 * Swing: AWT를 향상시킨 버전, java로만 개발
 */
public class FrameExam {

	public static void main(String[] args) {
		Frame f = new Frame();		// 프레임 생성(윈도우를 띄우는 클래스)
		f.setTitle("프레임 테스트");		// 프레임의 타이틀 설정
		// JFrame f = new JFrame("프레임 테스트");
		
		f.setSize(200, 300);				// 프레임의 가로, 세로 길이 설정
		f.setVisible(true);					// 프레임을 화면에 표시
		
		/**
		 * addWindowListener(): 프레임에 윈도우 이벤트 기능을 추가
		 * 이벤트소스.이벤트리스너(이벤트핸들러)
		 * addOOOListener => addMouseListener, addKeyListener
		 * 
		 * windowClosing(): 프로그램을 종료시킴
		 * 	정상종료: 0, 비정상종료: -1
		 */
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		/*
		f.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) { }
			
			@Override
			public void windowIconified(WindowEvent e) { }
			
			@Override
			public void windowDeiconified(WindowEvent e) { }
			
			@Override
			public void windowDeactivated(WindowEvent e) { }
			
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			@Override
			public void windowClosed(WindowEvent e) { }
			
			@Override
			public void windowActivated(WindowEvent e) { }
		});
		*/
	}
	
}
