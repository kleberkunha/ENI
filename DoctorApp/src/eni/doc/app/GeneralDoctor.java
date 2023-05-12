package eni.doc.app;

public class GeneralDoctor {
	
	private String first_name;
	private String last_name;
	private int phoneN;
	private static int consuPrice = 25;
	
	public GeneralDoctor(String first_name, String last_name, int phoneN) {
		this.first_name = first_name.toUpperCase();
		this.last_name = last_name;
		this.phoneN = phoneN;
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
	public int getPhoneN() {
		return phoneN;
	}
	public void setPhoneN(int phoneN) {
		this.phoneN = phoneN;
	}
	public static int getConsuPrice() {
		return consuPrice;
	}
	public static void setConsuPrice(int consuPrice) {
		GeneralDoctor.consuPrice = consuPrice;
	}
	
	public void show() {
		System.out.println("___________________ DOC's ____________________");
		System.out.printf("%s %s%nPhone N:  %s%nPrice : %d%n", this.first_name, this.last_name,this.phoneN, GeneralDoctor.consuPrice);
	}
	
}
