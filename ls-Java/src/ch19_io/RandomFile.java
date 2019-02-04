package ch19_io;

import java.io.RandomAccessFile;

/**
 * 비순차적 파일(RandomAccessFile)
 */
public class RandomFile {

	public static void main(String[] args) {
		// String output = "";
		StringBuilder output = new StringBuilder();
		String str = null;
		try {
			// r: 읽기 전용 | w: 쓰기 전용 | rw: 읽기, 쓰기 모드
			RandomAccessFile file = new RandomAccessFile("D:\\test.txt", "rw");

			// 파일 포인터를 이동시킴
			file.seek(89);
			file.write("추가한 내용".getBytes());		// write(바이트 배열)
			file.seek(0);
			
			// 파일 포인터(파일을 어디까지 읽었는지 가리킴)
			while (file.getFilePointer() < file.length()) {
				output.append(file.getFilePointer() + ": ");
				str = file.readLine();	
				
				/**
				 * 한글 처리
				 * 스트링.getBytes(): 스트링을 바이트 배열로 변환
				 * new String(문자열, 캐릭터셋): 인코딩 방식 변환
				 * iso-8859-1, 8859_1: 서유럽언어 인코딩방식
				 */
				str = new String(str.getBytes("8859_1"), "utf-8");
				
				// output = output + str + "\r\n";
				output.append(str + "\r\n");
			}
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
