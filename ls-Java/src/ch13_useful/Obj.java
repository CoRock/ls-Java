package ch13_useful;

// import java.lang.*;	// �⺻������ ���ԵǴ� ��Ű��

/**
 * Object class: �ڹ��� �ֻ��� Ŭ����(��� Ŭ�������� �⺻������ ��� ó����)
 */
public class Obj {	// extends Object		// Object Ŭ������ �⺻������ ��ӵ�

	public static void main(String[] args) {
		Obj e1 = new Obj();
		
		System.out.println("getClass(): " + e1.getClass());		// Ŭ������ ����
		System.out.println("a Reference Variable: " + e1);		// ��ü�� �ּҰ�
		// toString(): Object�� ���ڿ��� ��ȯ
		System.out.println("toString(): " + e1.toString());		// �ؽ��ڵ� ���
	}
	
}
