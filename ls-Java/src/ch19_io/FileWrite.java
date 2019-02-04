package ch19_io;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * OutputStream: 1 byte 출력
 * OutputStreamWriter: 1 char 출력
 */
public class FileWrite {

	public static void main(String[] args) {
		// 프로그램 ===> 파일 (출력스트림이 필요함)
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("D:\\foo.txt");
			
			System.out.println("입력하세요: ");
			while (true) {
				int ch = System.in.read();		// 1byte 읽음
				System.out.println(ch + " ==> "+ (char) ch);
				if (ch == 13) break;				// 엔터키를 만나면 종료
				os.write(ch);						// 파일에 1byte 저장
			}
			System.out.println("저장되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
