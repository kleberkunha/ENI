package reversi.game;

public enum Pion {
	LIBRE, BLANC, NOIR;

	// nombre de pions de cette couleur
	private int nombre = 2;

	/**
	 * Getter pour nombre.
	 * 
	 * @return le nombre de pions de cette couleur
	 */
	public int getNombre() {
		return nombre;
	}

	/**
	 * Donne le symbole utilisé pour afficher ce pion
	 * 
	 * @return le symbole utilisé pour afficher ce pion
	 */
	public char getSymbole() {
		char ret;
		switch (this) {
		case BLANC:
			ret = 'o';
			break;
		case NOIR:
			ret = '●';
			break;
		default:
			ret = '·';
			break;
		}
		return ret;
	}

	public Pion autrePion() {
		Pion autre;
		switch (this) {
		case BLANC:
			autre = Pion.NOIR;
			break;
		case NOIR:
			autre = Pion.BLANC;
			break;
		default:
			autre = Pion.LIBRE;
			break;
		}
		return autre;
	}

	/**
	 * Modifie l'attribut nombre pour ajouter le nombre de pions acquis grâce au
	 * coup du joueur L'adversaire perd ce même nombre de pions L'attribut nombre de
	 * ce pion est augmenté de 1 en raison du pion posé par le joueur
	 * 
	 * @param nombre
	 *
	 *               le nombre de pions qui changent de couleur
	 *
	 *               suite à un coup effectué par un joueur
	 */
	public void gagne(int nombre) {
		this.nombre += nombre + 1;
		this.autrePion().nombre -= nombre;
	}

}
