package ch09_inherit;

public class ScholarUse {
	
	public static void main(String[] args) {
		/* 
		 * �ڽ�Ŭ������ ��ü�� �����ϸ� �θ�Ŭ������ ��ü�� ������
		 * 
		 * Step 1. Student ��ü�� ����
		 * Step 2. Student ������ ȣ��
		 * Step 3. Scholar ��ü�� ����
		 * Step 4. Scholar ������ ȣ��
		 */
		Scholar s1 = new Scholar();
		
		// s1.input("�̵���", "180914", "�İ�", 4, "����", 3880000);
		s1.input("�̵���", "180914", "�İ�", 4);
		s1.print();
	}
	
}
