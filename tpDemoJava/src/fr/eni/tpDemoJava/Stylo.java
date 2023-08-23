package fr.eni.tpDemoJava;

public class Stylo extends Article {

	private String couleur;

	public Stylo() {
	}

	public Stylo(String marque, String reference, //
			String designation, float prixUnitaire, int qteStock, String couleur) {
		super(marque, reference, designation, prixUnitaire, qteStock);
		this.couleur = couleur;
	}

	public Stylo(Integer idArticle, String marque, String reference, //
			String designation, float prixUnitaire, int qteStock, String couleur) {
		super(idArticle, marque, reference, designation, prixUnitaire, qteStock);
		this.couleur = couleur;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Stylo [");
		builder.append("idArticle=");
		builder.append(idArticle);
		builder.append(", marque=");
		builder.append(marque);
		builder.append(", reference=");
		builder.append(reference);
		builder.append(", designation=");
		builder.append(designation);
		builder.append(", prixUnitaire=");
		builder.append(prixUnitaire);
		builder.append(", qteStock=");
		builder.append(qteStock);
		builder.append(", couleur=");
		builder.append(couleur);
		builder.append("]");
		return builder.toString();
	}

}
