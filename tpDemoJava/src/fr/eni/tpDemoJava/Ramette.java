package fr.eni.tpDemoJava;

public class Ramette extends Article {

	private int grammage;

	public Ramette() {
		super();
	}
	
	public Ramette(Integer idArticle, String marque, String reference, //
			String designation, float prixUnitaire, int qteStock, int grammage) {
		super(idArticle, marque, reference, designation, prixUnitaire, qteStock);
		this.grammage = grammage;
	}

	public Ramette(String marque, String reference, //
			String designation, float prixUnitaire, int qteStock, int grammage) {
		super(marque, reference, designation, prixUnitaire, qteStock);
		this.grammage = grammage;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ramette [");
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
		builder.append(", grammage=");
		builder.append(grammage);
		builder.append("]");
		return builder.toString();
	}

	public int getGrammage() {
		return grammage;
	}

	public void setGrammage(int grammage) {
		this.grammage = grammage;
	}

}
