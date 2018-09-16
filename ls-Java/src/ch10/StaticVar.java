package ch10;

public class StaticVar {

	static int a = 10;		// static member
	int b = 20;				// nonstatic member
	
	public static void main(String[] args) {
		System.out.println(a);
		
		// System.out.println(b);
		StaticVar s = new StaticVar();
		System.out.println(s.b);
	}
	
}
