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

	public int age() {
		return dateAchat.until(LocalDate.now()).getYears();
	}
	
	public abstract double getTarifLocationHeure();
	
	@Override
	public String toString() {
		int age = this.age();
		return String.format("%s %s %s (%dan%s)", this.getClass().getSimpleName(), this.marque, this.modele, age, age > 1 ? "s" : "");
	}
	
	
}
