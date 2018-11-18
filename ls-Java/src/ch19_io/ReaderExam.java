package ch19_io;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Reader - 2byte ������ �Է�
 * ��ȯ ���: new InputStreamReader(InputStream ��ü)
 * 
 * InputStream: ����Ʈ ������ ����
 * InputStreamReader: ���� ������ ����
 */
public class ReaderExam {
	
	public static void main(String[] args) {
		int var = 0;
		Reader input = new InputStreamReader(System.in);
		System.out.println("�Է��ϼ���: ");
		try {
			var = input.read();	// 1���ڸ� �о����
			
			while (true) {
				System.out.println(var + " ==> " + (char) var);
				// �����ڵ� 13��: ���͹���
				if (var == 13) break;	// ���͹��ڸ� ������ ����
				var = input.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
