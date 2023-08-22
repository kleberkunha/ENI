package fr.eni.demoInterface;

public class Fish implements Swim, Fly{

	@Override
	public void fly() {
		System.out.println("Flish flaying");
	}

	@Override
	public void swim() {
		System.out.println("Flish Swimming");
	}

	
}
