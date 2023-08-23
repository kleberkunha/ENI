package fr.eni.tpDemoJava;

import java.util.ArrayList;
import java.util.List;

public class Panier {

	// niveau attendus
	
	private float montant;

	private List<Ligne> lignesPanier = new ArrayList<>();

	public List<Ligne> getLignesPanier() {
		return this.lignesPanier;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Panier [montant=");
		builder.append(getMontant());
		builder.append(", lignesPanier=");
		builder.append(lignesPanier);
		builder.append("]");
		return builder.toString();
	}

	// niveau avancés, ne vous en faites pas si non acquis
	
	public float getMontant() {
		montant = 0;
		for (Ligne ligne : getLignesPanier()) {
			montant += ligne.getPrix() * ligne.getQte();
		}
		return montant;
	}

	public Ligne getLigne(int index) {
		return this.getLignesPanier().get(index);
	}

	public void addLigne(Article article, int qte) {
		Ligne ligne = new Ligne(article, qte);
		this.getLignesPanier().add(ligne);
	}

	public void updateLigne(int index, int newQte) {
		this.getLigne(index).setQte(newQte);
	}

	public void removeLigne(int index) {
		this.getLignesPanier().remove(index);
	}

}
