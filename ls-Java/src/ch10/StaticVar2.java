package ch10;

/**
 * static member made once only
 * @author CoRock
 */
public class StaticVar2 {

	// int total;
	static int total;		// created class segment
	private String model;	// created heap segment
	
	public StaticVar2(String model) {
		this.model = model;
		total++;
	}
	
	public static void main(String[] args) {
		StaticVar2 car1 = new StaticVar2("Sonata");
		StaticVar2 car2 = new StaticVar2("Morning");
		StaticVar2 car3 = new StaticVar2("Avante");
		
		System.out.println(total);
		System.out.println(StaticVar2.total);
		
		System.out.println(car1.total);
		System.out.println(car2.total);
		System.out.println(car3.total);
		
		System.out.println(car1.model);
		System.out.println(car2.model);
		System.out.println(car3.model);
	}
	
}
