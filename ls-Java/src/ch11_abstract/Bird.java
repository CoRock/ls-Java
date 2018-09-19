package ch11_abstract;

public class Bird implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("bird take off");
	}

	@Override
	public void fly() {
		System.out.println("bird flight");
	}

	@Override
	public void land() {
		System.out.println("bird landing");
	}

}
