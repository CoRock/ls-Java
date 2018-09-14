package ch09_inherit;

// class 자식클래스 extends 부모클래스
public class Scholar extends Student {
	
	private String category;	// 장학금 종류
	private int money;			// 장학금액
	
	public void input(String name, String num, String major, int year, String category, int money) {
		// super.부모클래스의 멤버
		// super 상위클래스(부모클래스)
		super.input(name, num, major, year);
		this.category = category;
		this.money = money;
	}

	// name, num, major, year 변수는 부모클래스의 변수지만
	// protected의 경우 자식클래스의 멤버처럼 사용 가능
	public void print() {
		// super.print();		// 부모클래스의 print method
		System.out.println("이름\t학번\t전공\t학년\t구분\t장학금액");
		System.out.println(name + "\t" + num + "\t" + major + "\t" + year + "\t"
									+ category + "\t" + money);
	}
	
}
