package ch12_inner;

import ch11_abstract.Flyer;

/**
 * anonymous inner class: new DATA_TYPE() { };
 * ex. Flyer f = new Flyer() { }; 
 * @author CoRock
 */
public class InnerUse {

	public static void main(String[] args) {
		Flyer f = new Flyer() {
			@Override
			public void takeOff() {
				System.out.println("implement interface");
			}

			@Override
			public void fly() { }

			@Override
			public void land() { }			
		};
		
		f.fly();
	}
	
}
