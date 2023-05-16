package store;

import java.time.LocalDate;

public class Velo extends Cycle{
 
	private int nbVitesses;

	public Velo(LocalDate dateAchat, String marque, String modele, int nbVitesses) {
		super(dateAchat, marque, modele);
		this.nbVitesses = nbVitesses;
	}

	public double getTarifLocationHeure() {
		return 4.9;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s %d vitesse%s", super.toString(), this.nbVitesses, this.nbVitesses > 1?"s":"");
	}
	
	
	
	
	
	
}
