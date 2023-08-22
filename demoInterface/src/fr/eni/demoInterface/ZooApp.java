package fr.eni.demoInterface;

public class ZooApp {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.talk();
		
		Bat bat = new Bat();
		bat.talk();
		bat.fly();
		
		
		Fly v = new Bat();
		
		v.fly();;
		
		Fish f = new Fish();
		
		f.swim();
		f.fly();
	}
}
