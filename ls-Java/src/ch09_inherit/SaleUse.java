package ch09_inherit;

public class SaleUse {

	public static void main(String[] args) {
		Sale s1 = new Sale();
		
		s1.input(1, "�����", "LG", "2018-09-15", 1000000, 10);
		s1.calc();
		s1.print();
	}
	
}
