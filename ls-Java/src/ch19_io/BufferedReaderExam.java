package ch19_io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * BufferedReader: 버퍼를 이용한 입력(속도 개선)
 * 	new BufferedReader(Reader 객체(InputStream 객체))
 */
public class BufferedReaderExam {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("입력하세요: ");
		String str;

		try {
			// 한 라인을 읽어들임
			str = reader.readLine();
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
