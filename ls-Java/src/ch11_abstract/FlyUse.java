package ch11_abstract;

public class FlyUse {

	public static void main(String[] args) {
		// interface can't create instance
		// Flyer f = new Flyer();
		
		// polymorphism
		// left-hand side: parent
		// right-hand side: child
		Flyer f = new Bird();
		f.takeOff();
		f.fly();
		f.land();
		
		f = new Airplane();
		f.takeOff();
		f.fly();
		f.land();
		
		System.out.println();
		
		// class that implemented interface is able to create instance
		Bird bird = new Bird();
		bird.takeOff();
		bird.fly();
		bird.land();
		
		Airplane air = new Airplane();
		air.takeOff();
		air.fly();
		air.land();
	}
	
}
