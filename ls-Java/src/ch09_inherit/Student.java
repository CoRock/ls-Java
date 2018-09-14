package ch09_inherit;

public class Student {
	
	// protected : �ڽ�Ŭ�������� ���� ����
	protected String name;
	protected String num;
	protected String major;
	protected int year;
	
	// constructors
	public Student() { }
	public Student(String name, String num, String major, int year) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}
	
	public void input(String name, String num, String major, int year) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}
	
	public void print() {
		System.out.println("�̸�\t�й�\t����\t�г�");
		System.out.println(name + "\t" + num + "\t" + major + "\t" + year);
	}
	
}
