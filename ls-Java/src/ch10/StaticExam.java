package ch10;

/**
 * nonstatic: use individual values
 * static: common value
 * @author CoRock
 */
public class StaticExam {

	public static void main(String[] args) {
		int a = 40, b = 30, result;
		
		result = Math.max(a, b);
		System.out.println(result);
		result = Math.min(a, b);
		System.out.println(result);
		
		System.out.println(Math.sqrt(100));
		
		double r = 15.3;
		System.out.println("circumference: " + Math.PI * 2 * r);
		System.out.println("area of a circle: " + Math.PI * r * r);
	}
	
}
