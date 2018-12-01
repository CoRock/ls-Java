package ch17_gui;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// 이벤트 처리하는 방법(1. 익명내부클래스로 구현)
public class EventExam1 extends Frame {

	public EventExam1() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		/** 이벤트소스.이벤트리스너(이벤트핸들러)
		this.addWindowListener(new WindowListener() {
			
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
				System.exit(0);	// 프로그램 종료, 0: 정상종료
			}
			
			@Override
			public void windowClosed(WindowEvent e) { }
			
			@Override
			public void windowActivated(WindowEvent e) { }
		});
		*/
		
		setSize(300, 300);		// 프레임의 가로, 세로 길이 설정
		setVisible(true);		// 프레임을 화면에 표시
	}
	
	public static void main(String[] args) {
		new EventExam1();	// 생성자 호출
	}
	
}
