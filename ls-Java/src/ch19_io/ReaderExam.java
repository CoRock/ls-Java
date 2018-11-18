package ch19_io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Reader - 2byte 단위로 입력
 * 변환 방법: new InputStreamReader(InputStream 객체)
 * 
 * InputStream: 바이트 단위로 읽음
 * InputStreamReader: 문자 단위로 읽음
 */
public class ReaderExam {
	
	public static void main(String[] args) {
		int var = 0;
		Reader input = new InputStreamReader(System.in);
		System.out.println("입력하세요: ");
		try {
			var = input.read();	// 1문자를 읽어들임
			
			while (true) {
				System.out.println(var + " ==> " + (char) var);
				// 문자코드 13번: 엔터문자
				if (var == 13) break;	// 엔터문자를 읽으면 종료
				var = input.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
