package ch11_abstract;

import java.awt.Graphics;

public class DrawCircle extends Point implements Draw {

	private int width, height;
	
	public DrawCircle() {
		this(0, 0, 0, 0);	// call the second constructor
	}
	public DrawCircle(int a, int b, int w, int h) {
		super(a, b);		// call a constructor of parent class
		width = w;
		height = h;
	}
	
	/**
	 * Graphics: graphic processing class
	 */
	@Override
	public void paint(Graphics g) {
		// draw circle(x, y, width, height);
		g.drawOval(a, b, width, height);
	}

}
