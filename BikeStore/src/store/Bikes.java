package store;

public class Bikes {
	String name;
	int size;
	int year;

	public Bikes(String name, int size, int year) {
		this.name = name;
		this.size = size;
		this.year = year;
	}
	
	
	public void ShowBikes() {
		System.out.printf("Bike name : %s%nSize : %d%nYear : %d", this.name, this.size, this.year);
	}
	
	
	
	
}
