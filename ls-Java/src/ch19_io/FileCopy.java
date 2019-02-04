package ch19_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// 버퍼입출력을 이용한 파일 내용 복사
public class FileCopy {

	public static void main(String[] args) {
		// 복사본 <=== 프로그램 <=== 원본
		String str = "";
		BufferedReader reader = null;
		BufferedWriter writer = null;
		String file1 = "D:\\a.txt";		// 원본 파일이름
		String file2 = "D:\\b.txt";		// 복사할 파일이름
		
		try {
			// reader = new BufferedReader(new InputStreamReader(new FileInputStream(file1)));
			// writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file2)));
			
			reader = new BufferedReader(new FileReader(new File(file1)));
			writer = new BufferedWriter(new FileWriter(new File(file2)));
			
			while (true) {
				str = reader.readLine();	// 한 라인을 읽음
				if (str == null) break;		// 내용이 없으면 종료
				/**
				 * \r : carriage return(캐리지 리턴)
				 * \n : new line(줄바꿈)
				 */
				writer.write(str + "\r\n");	// 파일에 기록할 때는 \r\n을 써주어야 줄바꿈 처리가 됨
			}
			System.out.println("파일 복사가 완료되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (reader != null) reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			try {
				if (writer != null) writer.close();		// 버퍼를 닫지 않으면 저장이 안됨
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
