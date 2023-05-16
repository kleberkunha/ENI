package battlegame;

public class Character {
	
	public String name;
	public char gender;
	

	public Character( String name,char gender) {
		this.name = name;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return String.format("%s %s", this.name, this.gender);
	}
	
	
}
