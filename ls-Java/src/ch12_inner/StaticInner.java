package ch12_inner;

/**
 * static inner class can create despite reference of outer class
 * @author CoRock
 */
public class StaticInner {

	static int x = 10;
	
	static class Inner {
		int getX() {
			return x;
		}
	}
	
	public static void main(String[] args) {
		// OUTER_CLASS.INNER.CLASS; coding more easier below the line
		StaticInner.Inner si = new StaticInner.Inner();
		System.out.println(si.getX());
	}
	
}
