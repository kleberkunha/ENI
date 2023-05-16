package store;

import java.time.LocalDate;

public abstract class Cycle {
	
	private LocalDate dateAchat;
	private String marque;
	private String modele;
	/**
	 * @param dateAchat
	 * @param marque
	 * @param modele
	 */
	public Cycle(LocalDate dateAchat, String marque, String modele) {
		this.dateAchat = dateAchat;
		this.marque = marque;
		this.modele = modele;
	}

/*--->>*/public int age() {
		// DateAchat has a value of 2017-6-2, and it will calculate the age doing 2023-2017,
		//probably using also the day and month digits
		return dateAchat.until(LocalDate.now()).getYears();
	}
	
	public abstract double getTarifLocationHeure();
	
	@Override
	public String toString() {
/*--->>*/	int age = this.age();
		// Here at the end i do a verification to see if the age is higher than '1', if it is i add a 's'||| 
		//result ('%d' is the number of the year, 'an' is the text for year, and '%s' is the 'S' if the number is higher than '1';
		return String.format("%s %s %s (%dan%s)", this.getClass().getSimpleName(), this.marque, this.modele, age, age > 1 ? "s" : "");
	}
	
	
}
