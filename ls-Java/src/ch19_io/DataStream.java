package ch19_io;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * DataInputStream: 텍스트 파일이 아닌 이진 파일을 읽는 방법
 */
public class DataStream {

	public static void main(String[] args) {
		try {
			// 좌변도 동일한 자료형으로 해야 함
			/**
			 * 텍스트 파일이 아닌 binary file(이진 파일)로 저장
			 * 
			 * 윈도우즈 : \
			 * 리눅스 : / , 드라이브가 없음
			 */
			DataOutputStream dataout = new DataOutputStream(new FileOutputStream("D:\\bar.dat")); 
			dataout.writeInt(123);			// 숫자 형식의 자료를 파일에 저장
			dataout.writeChar('A');			// 문자 형식의 자료를 파일에 저장
			dataout.writeDouble(3.5);		// 실수 형식의 자료를 파일에 저장
			dataout.close();					// 스트림 닫기(파일이 완성됨)
			System.out.println("저장되었습니다.");
			
			// 이진 파일을 읽기 위한 객체 생성
			DataInputStream datain = new DataInputStream(new FileInputStream("D\\bar.dat"));
			System.out.println(datain.readInt());
			System.out.println(datain.readChar());
			System.out.println(datain.readDouble());
			datain.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
