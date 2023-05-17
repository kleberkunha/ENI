package reversi.game;

public enum Pion {
	LIBRE, BLANC, NOIR;
	// nombre de pions de cette couleur
	private int nombre = 2;
	/**
	* Getter pour nombre.
	* @return le nombre de pions de cette couleur
	*/
	public int getNombre() {
	return nombre;
	}
	/**
	* Donne le symbole utilisé pour afficher ce pion
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
}
