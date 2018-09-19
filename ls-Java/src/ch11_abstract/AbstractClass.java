package ch11_abstract;

/**
 * an abstract class may or may not include abstract methods.
 * an abstract method is a method that is declared header without a body.
 * an abstract class can't create object.
 * (it can be use overriding abstract method when sub class is inherited)
 * 
 * @author CoRock
 */
public abstract class AbstractClass {
	
	abstract void method1();	// no body and ending semicolon
	void method2() { 
		System.out.println("complete method");
	}
	
}
