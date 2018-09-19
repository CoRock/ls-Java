package ch11_abstract;

public class Airplane implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("airplane take off");
	}

	@Override
	public void fly() {
		System.out.println("airplane flight");
	}

	@Override
	public void land() {
		System.out.println("airplane landing");
	}

}
