package ch09_inherit;

public class Area {
	
	// member variables
	private int width;
	private int length;
	
	// constructors
	public Area() { }
	public Area(int width, int length) {
		this.width = width;
		this.length = length;
	}
	
	public int getArea() {
		return width * length;
	}
	
}
