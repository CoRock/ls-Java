package ch09_inherit;

/**
 * Sale Infomation Class
 * 
 * Input: ��ǰ�ڵ�, ǰ��, ������, ��������, �ܰ�, ����
 * Calc: �Ǹűݾ�(�ܰ�x����)
 * Output: ��ǰ�ڵ�, ǰ��, ������, ��������, �ܰ�, ����, �Ǹűݾ�
 * 
 * Requirement : input method �Ǵ� constructor ���
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
		System.out.println("�ڵ�\tǰ��\t������\t��������\t�ܰ�\t����\t�ݾ�");
		System.out.println(getCode() + "\t" + getName() + "\t"
				 			+ getCompany() + "\t" + getDate() + "\t" + price + "\t"
				 			+ amount + "\t" + money);
	}
	
}
