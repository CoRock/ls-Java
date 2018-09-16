package ch10;

class Test1 {
	public void print() {
		System.out.println("print method of Test1 class");
	}		
}

class Test2 extends Test1 {
	@Override
	public void print() {
		System.out.println("print method of Test2 class");
	}
}

public class OverrideExam {
	
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.print();
	}
	
}