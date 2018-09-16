package ch09_inherit;

/**
 * Sale Infomation Class
 * 
 * Input: 제품코드, 품명, 제조사, 제조일자, 단가, 수량
 * Calc: 판매금액(단가x수량)
 * Output: 제품코드, 품명, 제조사, 제조일자, 단가, 수량, 판매금액
 * 
 * Requirement : input method 또는 constructor 사용
 */
public class Sale extends Product {

	private int price;
	private int amount;
	private int money;
	
	public void input(int code, String name,
						String company, String date, int price, int amount) {
		
		// members of parent class
		// (methods processing because member variable is private)
		setCode(code);
		setName(name);
		setCompany(company);
		setDate(date);
		
		// members of current class
		this.price = price;
		this.amount = amount;
	}
	
	public void calc() {
		money = price * amount;
	}
	
	public void print() {
		System.out.println("코드\t품명\t제조사\t제조일자\t단가\t수량\t금액");
		System.out.println(getCode() + "\t" + getName() + "\t"
				 			+ getCompany() + "\t" + getDate() + "\t" + price + "\t"
				 			+ amount + "\t" + money);
	}
	
}
