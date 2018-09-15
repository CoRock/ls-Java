package ch09_inherit;

public class BookSaleUse {

	public static void main(String[] args) {
		// call members of parent class
		BookSale b1 = new BookSale();
		b1.setBookName("Java");
		b1.setAuthor("ÀÌµµÈÆ");
		b1.setPress("±æ¹þ");
		b1.setYear(2018);
		b1.setPrice(30000);
		
		// members of child class
		b1.setAmount(500);
		b1.setRank(1);
		b1.setMoney();
		b1.print();
	}
	
}
