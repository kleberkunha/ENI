package eni.doc.app;


//import java.time.format.DateTimeFormatter;

public class Patient {
	private String first_name;
	private String last_name;
	private String phoneN;
	private char gender;
	private String socialN;
	private String comments;
	private Address address;
	

	public Patient(String first_name, String last_name, String phoneN, char gender, String socialN,
			String comments, Address address) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.phoneN = phoneN;
		this.gender = gender;
		this.socialN = socialN;
		this.comments = comments;
		this.address = address;

	}



	public void show() {
		System.out.printf(
				"Full name : %s %s%nPhone N: %s%nGender : %s%nSocialN :  %s%nComments : %s%n",
				this.first_name, this.last_name, this.phoneN, this.gender == 'F' ? "Female" : "Male", this.socialN,
				this.comments != null ? this.comments : "[No comments]");
		this.address.show();

	}
}
