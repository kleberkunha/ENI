package store;

import java.time.LocalDate;

public class Gyropode extends CycleElectrique{
	
	private int tailleMinCm;
	
	
	public Gyropode(LocalDate dateAchat, String marque, String modele, int autonomieKm, int tailleMinCm) {
		super(dateAchat, marque, modele, autonomieKm);
		this.tailleMinCm = tailleMinCm;
	}


	@Override
	public double getTarifLocationHeure() {
		return 29.9;
	}


	@Override
	public String toString() {
		return String.format("%s [%dm%d min]", super.toString(), this.tailleMinCm/100, this.tailleMinCm%100);
	}
	
	


	
}
