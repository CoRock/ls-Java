package ch10;

public class StaticMethod {

	static int a = 10;
	int b = 20;

	public static void printA() {
		System.out.println(a);
		
		// error(cannot make a static to the non-static)
		// System.out.println(b);
	}

	public void printB() {
		// can refer from non-static to static
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		StaticMethod sm = new StaticMethod();
		// sm.printA();
		StaticMethod.printA();	// access to class name(recommended)
		sm.printB();
	}
	
}
