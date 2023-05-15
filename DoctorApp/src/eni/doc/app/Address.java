package eni.doc.app;

public class Address {
	private String buildingName;
	private int buildingN;
	private String streetName;
	private int postalCode;
	private String city;
	

	public Address(String buildingName, int buildingN, String streetName, int postalCode, String city) {
		this.buildingName = buildingName;
		this.buildingN = buildingN;
		this.streetName = streetName;
		this.postalCode = postalCode;
		this.city = city;
	}



	public void show() {
		System.out.printf("Building name : %s%n%d %s%n%s %s", this.buildingName, this.buildingN, this.streetName,this.postalCode, this.city);
		
	}

}
