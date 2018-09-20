package ch12_inner;

/**
 * inner class, nested class: a class within another class
 * InnerClass.class		InnerClass$Inner.class
 * @author CoRock
 */
public class InnerClass {
	
	private static int x = 10;
	
	// inner class is freely accessible to members of outer class
	class Inner {
		int getX() {
			return x;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(x);		// static member
		
		InnerClass ic = new InnerClass();
		// OUTER_CLASS.INNER.CLASS
		InnerClass.Inner in = ic.new Inner();
		System.out.println(in.getX());
	}
	
}
