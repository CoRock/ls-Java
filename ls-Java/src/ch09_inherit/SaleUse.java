package ch09_inherit;

public class SaleUse {

	public static void main(String[] args) {
		Sale s1 = new Sale();	// create instance
		
		s1.input(1, "≥√¿Â∞Ì", "LG", "2018-09-15", 1000000, 10);
		s1.calc();		// calculation
		s1.print();		// output
	}
	
}
