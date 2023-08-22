package fr.eni.demoInterface;

public class Bat extends Mamifero implements Fly{
	public void talk() {
		System.out.println("Sonor bar");
	}

	@Override
	public void fly() {
		System.out.println("Bad is Flying");
	}
}
