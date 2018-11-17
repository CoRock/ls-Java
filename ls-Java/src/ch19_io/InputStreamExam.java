package ch19_io;

import java.io.IOException;

/**
 * ��Ʈ��: �������� ������ ���
 * 	1byte ������ ó����
 * InputStream(�Է½�Ʈ��)
 * OutputStream(��½�Ʈ��)
 * 
 * ���α׷� <= Ű����
 */
public class InputStreamExam {

	public static void main(String[] args) {
		int var = 0;

		try {
			System.out.println("������ �Է��ϼ���: ");

			// System.in => InputStream (1byte ���� �Է�)
			var = System.in.read();		// Ű����� 1byte�� �Է¹���
			
			while (var != 13) {			// 13: ����Ű�� �ƴϸ�
				System.out.println(var + " ==> " + (char) var);
				var = System.in.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		/*
		System.out.printf("�Է��� ����: %c, �����ڵ�: %d", var, var);
		var = '��';
		System.out.printf("�Է��� ����: %c, �����ڵ�: %d", var, var);
		*/
	}
	
}
