package ch09_inherit;

public class BookSale extends Book {

	private int amount;
	private int rank;
	// if price exceeds 100,000 won, give discount of 10 percent.
	private int money;
	
	// getters and setters
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	
	public void setMoney() {
		money = price * amount;
		if (money > 100000)	money = (int) (money * 0.9);
	}
	
	public void print() {
		System.out.println("도서명\t출판사\t저자\t출판연도 "
							+ "단가\t수량\t금액\t판매순위");
		
		/**
		 * bookName, press, author, year variables are private members,
		 * so you can't accessible to the child class.
		 * if you set access permission to "protected", can directly accessible.
		 */
		System.out.println(bookName + "\t" + press + "\t" + author + "\t" + year + "\t"
							+ " " + price + "\t" + amount + "\t" + money + "\t" + rank);
	}
	
}
