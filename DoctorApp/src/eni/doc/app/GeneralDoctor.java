package eni.doc.app;

public class GeneralDoctor {
	
	private String first_name;
	private String last_name;
	private String phoneN;
	private int consuPrice ;
	private Address address;
	
	public GeneralDoctor(String first_name, String last_name, String phoneN,int consuPrice, Address address) {
		this.first_name = first_name.toUpperCase();
		this.last_name = last_name;
		this.phoneN = phoneN;
		this.consuPrice = consuPrice;
		this.address = address;
	}
	
	public GeneralDoctor(Address address) {
		this.address = address;
	}

	// GET AND SETTER
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getPhoneN() {
		return phoneN;
	}
	public void setPhoneN(String phoneN) {
		this.phoneN = phoneN;
	}
	
	public int getConsuPrice() {
		return consuPrice;
	}

	public void setConsuPrice(int consuPrice) {
		this.consuPrice = consuPrice;
	}

	public void show() {
		System.out.println("___________________ DOC's ____________________");
		System.out.printf("FirstName : %s - LastName %s%nPhone N:  %s%nPrice : %s%nAddress : %s", this.first_name, this.last_name,this.phoneN,this.consuPrice, this.address.show());
	}
	
}
