package ch10;

/** 
 * final variable : ���� ������ �� ����(���)
 * @author CoRock
 * 
 * �빮�ڷ� �ۼ�, 2�ܾ� �̻��� ��� _�� ����
 * �ʱⰪ�� �ݵ�� �ʿ���	ex. final int MAX; (x)
 * ���� ������ �� ����(final variable once assigned a value can never be changed.)
 */
public class FinalVar {

	final static int MAX_NUM = 100;
	
	public static void main(String[] args) {
	/*
		int max = 100;
		System.out.println(max);
	*/
		System.out.println(MAX_NUM);
	}
	
}