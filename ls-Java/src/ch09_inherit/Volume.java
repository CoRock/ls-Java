package ch09_inherit;

// extends parent class
public class Volume extends Area {

	private int height;
	
	/**
	 * super()	is constructor of parent class
	 * super. 	is variable of parent class, method
	 * 
	 * this()	is call constructor
	 * this.	is variable of current class, method
	 */	 
	public Volume() { }			// default constructor
	public Volume(int width, int length, int height) {
		super(width, length);	// call constructor of parent class
		this.height = height;
	}
	
	public int getVolume() {
		// getArea() is method of parent class 
		return getArea() * height;
	}
	
}
