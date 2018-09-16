package ch10;

class ParentFinalMethod {
	
	private int num = 100;
	
	// final method isn't overriding a method
	public final void print() {
		System.out.println(num);
	}
	
}

/**
 * final method doesn't allow overriding
 * @author CoRock
 */
public class FinalMethod extends ParentFinalMethod {

	int num = 10;
	
/*
	@Override
	public void print() {	// redefined method
		System.out.println("print method of child class");
	}
*/
	
	public static void main(String[] args) { 
		FinalMethod fm = new FinalMethod();
		fm.print();
	}
	
}