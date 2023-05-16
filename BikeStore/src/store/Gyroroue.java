package store;

import java.time.LocalDate;

public class Gyroroue extends CycleElectrique{

	public Gyroroue(LocalDate dateAchat, String marque, String modele, int autonomieKm) {
		super(dateAchat, marque, modele, autonomieKm);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double getTarifLocationHeure() {
		return 18.9;
	}
	
	
}
