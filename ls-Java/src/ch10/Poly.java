package ch10;

class Mother {
	int a = 10;
	public void print() {
		System.out.println(a);
	}
}

class Child extends Mother {
	int a = 20;
	@Override
	public void print() {
		System.out.println(a);
	}
}

/**
 * Polymorphism: call method of child data type
 * @author CoRock
 * 
 * left-hand side: parent data type
 * right-hand side: child data type
 */
public class Poly {

	public static void main(String[] args) {
		Child c = new Child();
		c.print();
		
		Mother m = new Mother();
		m.print();
		
		Mother p = new Child();
		p.print();
	}
	
}
