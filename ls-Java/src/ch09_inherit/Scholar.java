package ch09_inherit;

// class �ڽ�Ŭ���� extends �θ�Ŭ����
public class Scholar extends Student {
	
	private String category;	// ���б� ����
	private int money;			// ���бݾ�
	
	public void input(String name, String num, String major, int year, String category, int money) {
		// super.�θ�Ŭ������ ���
		// super ����Ŭ����(�θ�Ŭ����)
		super.input(name, num, major, year);
		this.category = category;
		this.money = money;
	}

	// name, num, major, year ������ �θ�Ŭ������ ��������
	// protected�� ��� �ڽ�Ŭ������ ���ó�� ��� ����
	public void print() {
		// super.print();		// �θ�Ŭ������ print method
		System.out.println("�̸�\t�й�\t����\t�г�\t����\t���бݾ�");
		System.out.println(name + "\t" + num + "\t" + major + "\t" + year + "\t"
									+ category + "\t" + money);
	}
	
}
