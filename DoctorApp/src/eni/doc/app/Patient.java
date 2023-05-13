package eni.doc.app;

import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;

public class Patient {
	private String first_name;
	private String last_name;
	private int phoneN;
	private char gender;
	private String socialN;
	private LocalDate birthDate;
	private String comments;
	private Address address;

//	public Patient(String first_name, String last_name, String phoneN, char gender, String socialN, String birthDate,
//			String comments, Address address) {
//		this.first_name = first_name.toUpperCase();
//		this.last_name = last_name;
//		this.phoneN = phoneN;
//		this.gender = gender;
//		this.socialN = socialN;
//		this.birthDate = LocalDate.parse(birthDate);
//		this.comments = comments;
//		this.address = address;
//
//		// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//	}
	// Format date
	// String formattedDate = birthDate.format(formatter);

	////// MISS TO FINISH THE DATE FORMAT /////
	
	
	





	public Patient(String first_name, String last_name, int phoneN, char gender, String socialN, LocalDate birthDate,
			String comments, Address address) {
		this.first_name = first_name;
		this.last_name = last_name;
		this.phoneN = phoneN;
		this.gender = gender;
		this.socialN = socialN;
		this.birthDate = birthDate;
		this.comments = comments;
		this.address = address;
	}




	public Patient(Address address) {
		this.address = address;
	}

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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getSocialN() {
		return socialN;
	}

	public void setSocialN(String socialN) {
		this.socialN = socialN;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public void show() {
		System.out.println("___________________ Patient ____________________");
		System.out.printf(
				"Full name : %s %s%nPhone N: %d%nGender : %s%nSocialN :  %s%nBirth Date: %s%nComments : %s%nAddress: %n",
				this.first_name, this.last_name, this.phoneN, this.gender == 'F' ? "Female" : "Male", this.socialN,
				this.birthDate, this.comments != null ? this.comments : "[No comments]",this.address);
	}
}
