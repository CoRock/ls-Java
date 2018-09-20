package ch12_inner;

public class InnerFinal {

	int x = 10;
	
	void print() {
		final int y = 20;
		
		// inner class that was declared inside a method
		class Inner {
			void test() {
				System.out.println(x);
				System.out.println(y);
			}
		}
	}
	
	public static void main(String[] args) {
		InnerFinal fi = new InnerFinal();
	}
	
}
