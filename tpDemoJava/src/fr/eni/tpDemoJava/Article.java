package fr.eni.tpDemoJava;

public abstract class Article {

	protected Integer idArticle;
	protected String marque;
	protected String reference;
	protected String designation;
	protected float prixUnitaire;
	protected int qteStock;

	public Article() {
	}

	public Article(String marque, String reference, String designation, float prixUnitaire, int qteStock) {
		this(null, marque, reference, designation, prixUnitaire, qteStock);
	}

	public Article(Integer idArticle, String marque, String reference, String designation, float prixUnitaire,
			int qteStock) {
		this.idArticle = idArticle;
		this.marque = marque;
		this.reference = reference;
		this.designation = designation;
		this.prixUnitaire = prixUnitaire;
		this.qteStock = qteStock;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
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
		return builder.toString();
	}

	public Integer getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Integer idArticle) {
		this.idArticle = idArticle;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public float getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(float prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public int getQteStock() {
		return qteStock;
	}

	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}

}
