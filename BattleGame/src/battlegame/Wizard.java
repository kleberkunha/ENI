package battlegame;

public class Wizard extends Character{
	
	private int mana;
	
	public Wizard(char gender, String name, int mana) {
		super(name, gender);
		this.mana = mana;
	}

	@Override
	public String toString() {
		return String.format("Wizard name : %s%nGender : %s%nMana : %d", super.name,super.gender, this.mana);
	}
	
}
