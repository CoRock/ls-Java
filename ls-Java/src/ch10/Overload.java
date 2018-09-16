package ch10;

public class Overload {

	public void putData(String a) {
		System.out.println(a);
	}
	public void putData(int a) {
		System.out.println(a);
	}
	public void putData(double a) {
		System.out.println(a);
	}

	public static void main(String[] args) {
		Overload e = new Overload();
		e.putData("hello");
		e.putData(10);
		e.putData(10.5);
	}
	
}