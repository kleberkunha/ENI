package store;

import java.time.LocalDate;

public class Gyroroue extends CycleElectrique{

	public Gyroroue(LocalDate dateAchat, String marque, String modele, int autonomieKm) {
		
		// The super is to call the variables from the Class that has been extended, here is CycleEletrique
		// so the value super is calling were created in the CycleEletrique FILE
		super(dateAchat, marque, modele, autonomieKm);
	}

	@Override
	public double getTarifLocationHeure() {
		return 18.9;
	}
	
	
}
