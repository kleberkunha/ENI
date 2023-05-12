package eni.doc.app;

public class Address {
	private String buildingName;
	private int buildingN;
	private String streetName;
	private int postalCode;
	private String city;
	
	
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public int getBuildingN() {
		return buildingN;
	}
	public void setBuildingN(int buildingN) {
		this.buildingN = buildingN;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	


	public Address(String buildingName, int buildingN, String streetName, int postalCode, String city) {
		this.buildingName = buildingName;
		this.buildingN = buildingN;
		this.streetName = streetName;
		this.postalCode = postalCode;
		this.city = city;
	}







	public void show() {
		System.out.println("___________________ Address ____________________");
		System.out.printf("Building name : %s%n%d %s%n%s %s", this.buildingName, this.buildingN, this.streetName,this.postalCode, this.city);
		
	}
	
	
	
	
	
	
	
	
}
