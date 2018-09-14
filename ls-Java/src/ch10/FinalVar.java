package ch10;

/** 
 * final variable : 값을 수정할 수 없음(상수)
 * @author CoRock
 * 
 * 대문자로 작성, 2단어 이상일 경우 _로 연결
 * 초기값이 반드시 필요함	ex. final int MAX; (x)
 * 값을 변경할 수 없음(final variable once assigned a value can never be changed.)
 */
public class FinalVar {

	final static int MAX_NUM = 100;
	
	public static void main(String[] args) {
	/*
		int max = 100;
		System.out.println(max);
	*/
		System.out.println(MAX_NUM);
	}
	
}