package ch12_inner;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// Frame: a class that pop up window
public class InnerExam extends Frame {

	public InnerExam() {
		super("test inner class");	// constructor of frame class
		setSize(300, 400);			// set size width, height
		setVisible(true);			// display frame to window
	}
	
	public static void main(String[] args) {
		InnerExam ie = new InnerExam();
		ie.addWindowListener(new WindowListener() {
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO: when window is opened
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO: when u minimized window
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO: adversely windowIconified()
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO: when window deactivated
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO: windowClosing: when window is closing(when u clicked x button)
				System.exit(0);		// program termination
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO: what you will do after window was completely closed
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
			}
		});
	}
	
}
