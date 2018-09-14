package ch09_inherit;

public class ScholarUse {
	
	public static void main(String[] args) {
		/* 
		 * 자식클래스의 객체를 생성하면 부모클래스의 객체도 생성됨
		 * 
		 * Step 1. Student 객체가 생성
		 * Step 2. Student 생성자 호출
		 * Step 3. Scholar 객체가 생성
		 * Step 4. Scholar 생성자 호출
		 */
		Scholar s1 = new Scholar();
		
		// s1.input("이도훈", "180914", "컴공", 4, "성적", 3880000);
		s1.input("이도훈", "180914", "컴공", 4);
		s1.print();
	}
	
}
