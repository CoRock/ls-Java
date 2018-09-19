package ch11_abstract;

/**
 * all abstract classes are implemented by the parent class
 * using when to inherit an abstract class
 * @author CoRock
 */
public class AbstractExtends extends AbstractClass {

	@Override
	void method1() {
		System.out.println("implementation of method");
	}
	
	public static void main(String[] args) {
		AbstractExtends ae = new AbstractExtends();
		ae.method1();
		ae.method2();
	}

}
