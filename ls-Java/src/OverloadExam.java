
// Overload: method 중복
public class OverloadExam {
	
	static void print() {
		System.out.println("hello");
	}
	static void print(int a) {
		System.out.println(a);
	}
	static void print(String a) {
		System.out.println(a);
	}
//	static void print(String b) {
//		System.out.println(b);
//	}
//	static int print(String a) {
//		return 100;
//	}
	
	public static void main(String[] args) {
		print();
		print(100);
		print("java");
	}
	
}
