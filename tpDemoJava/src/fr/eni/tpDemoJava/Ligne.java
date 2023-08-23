package fr.eni.tpDemoJava;

public class Ligne {

	// niveau attendu
	
	private Article article;
	private int qte;

	public Ligne(Article article, int qte) {
		super();
		this.article = article;
		this.qte = qte;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Ligne [article=");
		builder.append(article);
		builder.append(", qte=");
		builder.append(qte);
		builder.append("]");
		return builder.toString();
	}

	public Article getArticle() {
		return this.article;
	}

	public void setArticle(Article article) {
		this.article = article;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	// niveau avancé
	
	public float getPrix() {
		return this.getArticle().getPrixUnitaire();
	}
	
}
