package ch13_useful;

// import java.lang.*;	// 기본적으로 포함되는 패키지

/**
 * Object class: 자바의 최상위 클래스(모든 클래스에서 기본적으로 상속 처리됨)
 */
public class Obj {	// extends Object		// Object 클래스가 기본적으로 상속됨

	public static void main(String[] args) {
		Obj e1 = new Obj();
		
		System.out.println("getClass(): " + e1.getClass());		// 클래스의 정보
		System.out.println("a Reference Variable: " + e1);		// 객체의 주소값
		// toString(): Object를 문자열로 변환
		System.out.println("toString(): " + e1.toString());		// 해쉬코드 출력
	}
	
}
