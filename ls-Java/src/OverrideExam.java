/*
interface A {
	public void print();
}
*/

class A {
	void print() {
		System.out.println("a");
	}
}

// class B implements A {
class B extends A {
	// override: method 재정의
	public void print() {
		System.out.println("a");
		System.out.println("b");
	}
}

public class OverrideExam {

	public static void main(String[] args) {
		B b = new B();
		b.print();

		// polymorphism
		A a = new B();
		a.print();
		
		A aa = new A();
		aa.print();
	}
	
}
