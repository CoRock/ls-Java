package ch09_inherit;

public class Student {
	
	// protected : 자식클래스에서 접근 가능
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
		System.out.println("이름\t학번\t전공\t학년");
		System.out.println(name + "\t" + num + "\t" + major + "\t" + year);
	}
	
}
