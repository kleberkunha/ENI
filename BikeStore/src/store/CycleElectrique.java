package store;

import java.time.LocalDate;

public abstract class CycleElectrique extends Cycle{
	private int autonomieKm;

	public CycleElectrique(LocalDate dateAchat, String marque, String modele, int autonomieKm) {
		super(dateAchat, marque, modele);
		this.autonomieKm = autonomieKm;
	}

	@Override
	public String toString() {
		return String.format("%s %d km d'autonomie", super.toString(), this.autonomieKm);
	}
	
	
	
	
}
