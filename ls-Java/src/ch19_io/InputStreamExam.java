package ch19_io;

import java.io.IOException;

/**
 * 스트림: 데이터의 논리적인 통로
 * 	1byte 단위로 처리됨
 * InputStream(입력스트림)
 * OutputStream(출력스트림)
 * 
 * 프로그램 <= 키보드
 */
public class InputStreamExam {

	public static void main(String[] args) {
		int var = 0;

		try {
			System.out.println("내용을 입력하세요: ");

			// System.in => InputStream (1byte 단위 입력)
			var = System.in.read();		// 키보드로 1byte를 입력받음
			
			while (var != 13) {			// 13: 엔터키가 아니면
				System.out.println(var + " ==> " + (char) var);
				var = System.in.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		System.out.printf("입력한 문자: %c, 문자코드: %d", var, var);
		var = '가';
		System.out.printf("입력한 문자: %c, 문자코드: %d", var, var);
		*/
	}
	
}
