package eni.doc.app;


import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;

public class Patient {

	private String first_name;
	private String last_name;
	private String phoneN;
	private char gender;
	private String socialN;
	private LocalDate birthDate;
	private String comments;
	
	
    
    
	
	
	public Patient(String first_name, String last_name, String phoneN, char gender, String socialN, String birthDate, String comments) {
		this.first_name = first_name.toUpperCase();
		this.last_name = last_name;
		this.phoneN = phoneN;
		this.gender = gender;
		this.socialN = socialN;
		this.birthDate = LocalDate.parse(birthDate);
		this.comments = comments;
		
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	}
	//Format date
	//String formattedDate = birthDate.format(formatter);
	
	////// MISS TO FINISH THE DATE FORMAT   /////


	public void show() {
		System.out.println("___________________ Patient ____________________");
			System.out.printf("Full name : %s %s%nPhone N: %s%nGender : %s%nSocialN :  %s%nBirth Date: %s%nComments : %s",  this.first_name,this.last_name,this.phoneN,
					this.gender == 'F' ? "Female" : "Male", this.socialN, this.birthDate, this.comments != null ? this.comments : "[No comments]");
	}
}
