package reversi.game;

public class PlateauDeReversi {
	public static final int TAILLE = 8;
	private Pion[][] plateau;

	/**
	 * Constructeur : Initialise le plateau de jeu www.eni-ecole.fr Page 3/12 © ENI
	 * - Tous droits réservésLa Programmation Orientée Objet (POO) avec Java dans la
	 * configuration de début de partie <br>
	 * · · · · · · · · <br>
	 * · · · · · · · · <br>
	 * · · · · · · · · <br>
	 * · · · o ● · · · <br>
	 * · · · ● o · · · <br>
	 * · · · · · · · · <br>
	 * · · · · · · · · <br>
	 * · · · · · · · ·
	 */
	private PlateauDeReversi() {
		this.plateau = new Pion[TAILLE][TAILLE];
		for (int j = 0; j < TAILLE; j++) {
			for (int i = 0; i < TAILLE; i++) {
				plateau[j][i] = Pion.LIBRE;
			}
		}
		this.plateau[TAILLE / 2][TAILLE / 2] = Pion.BLANC;
		this.plateau[TAILLE / 2 - 1][TAILLE / 2] = Pion.NOIR;
		this.plateau[TAILLE / 2][TAILLE / 2 - 1] = Pion.NOIR;
		this.plateau[TAILLE / 2 - 1][TAILLE / 2 - 1] = Pion.BLANC;
	}

	/**
	 * Méthode permettant d'effectuer une partie de Reversi
	 */
	private void jouer() {
		Pion courant = Pion.NOIR;
		int nbPasseTour = 0;
		while (nbPasseTour < 2 && Pion.BLANC.getNombre() + Pion.NOIR.getNombre() < TAILLE * TAILLE) {
			System.out.printf("Au tour de %s...%n", courant.getSymbole());
			int nbRetournes = 0;
			boolean ok = false;
			do {
				this.afficher();
				if (this.peutJouer(courant)) {
					int ligne = Outils.saisie("ligne", 1, TAILLE) - 1;
					int colonne = Outils.saisie("colonne", 1, TAILLE) - 1;
					nbRetournes = this.tester(courant, ligne, colonne);
					if (nbRetournes > 0) {
						this.poser(courant, ligne, colonne);
						courant.gagne(nbRetournes);
						nbPasseTour = 0;
						ok = true;
					} else {
						System.err.println("Position illégale");
					}
				} else {
					System.out.printf("%s n'a aucune position où poser un de ses pions. Il passe son tour.%n",
							courant.getSymbole());
					nbPasseTour++;
					ok = true;
				}
			} while (!ok);
			// changement de joueur
			courant = courant.autrePion();
		}
		if (Pion.BLANC.getNombre() > Pion.NOIR.getNombre()) {
			System.out.printf("%s gagne !%n", Pion.BLANC.getSymbole());
		} else if (Pion.BLANC.getNombre() < Pion.NOIR.getNombre()) {
			System.out.printf("%s gagne !%n", Pion.NOIR.getSymbole());
		} else {
			System.out.println("Égalité !");
		}
		this.afficher();
	}

	/**
	 * Affiche le plateau de jeu et le score
	 */
	private void afficher() {
		// Affichage des scores
		System.out.printf("%2d %s%n%2d %s%n", Pion.NOIR.getNombre(), Pion.NOIR.getSymbole(), Pion.BLANC.getNombre(),
				Pion.BLANC.getSymbole());
		// Affichage du plateau de jeu
		System.out.print(" ");
		for (int i = 1; i <= TAILLE; i++)
			System.out.printf("%d ", i);
		System.out.println();
		for (int j = 0; j < TAILLE; j++) {
			System.out.printf("%d ", j + 1);
			for (int i = 0; i < TAILLE; i++) {
				System.out.printf("%s ", plateau[j][i].getSymbole());
			}
			System.out.println();
		}
	}

	/**
	 * Indique le nombre de pions changeant de couleur si le joueur ayant les pions
	 * de la couleur passée en paramètre pose un pion sur la case dont les
	 * coordonnées sont passées en paramètre
	 *
	 * @param couleur
	 *
	 *                couleur du pion qui serait posé
	 * @param y
	 *
	 *                ligne pour le pion
	 * @param x
	 *
	 *                colonne pour le pion
	 * @return le nombre de pions qui changeraient de couleur
	 */
	public int tester(Pion couleur, int y, int x) {
		int nbPions = 0;
		if (plateau[y][x] == Pion.LIBRE)
			for (int dy = -1; dy <= 1; dy++)
				for (int dx = -1; dx <= 1; dx++)
					if (dx != 0 || dy != 0)
						nbPions += testerDirection(couleur, y, x, dy, dx);
		return nbPions;
	}

	/**
	 * Indique le nombre de pions changeant de couleur si le joueur ayant les pions
	 * de la couleur passée en paramètre pose un pion www.eni-ecole.fr Page 5/12 ©
	 * ENI - Tous droits réservésLa Programmation Orientée Objet (POO) avec Java sur
	 * la case dont les coordonnées sont passées en paramètre pour une direction
	 * donnée avec les paramètres dx et dy
	 *
	 * @param couleur
	 * @param y
	 *
	 *                ligne pour le pion
	 * @param x
	 *
	 *                colonne pour le pion
	 * @param dy
	 *
	 *                -1 pour indiquer un décalage vers la gauche, 1 vers la droite,
	 *
	 *                et 0 pas de décalage
	 * @param dx
	 *
	 *                -1 pour indiquer un décalage vers le haut, 1 vers le bas,
	 *
	 *                et 0 pas de décalage
	 * @return le nombre de pions qui changeraient de couleur
	 */
	private int testerDirection(Pion couleur, int y, int x, int dy, int dx) {
		Pion couleurOpp = couleur.autrePion();
		int nbAutres = 0;
		int i = x + dx;
		int j = y + dy;
		while (0 <= i && i < TAILLE && 0 <= j && j < TAILLE && this.plateau[j][i] == couleurOpp) {
			nbAutres++;
			i += dx;
			j += dy;
		}
		if (i < 0 || i >= TAILLE || j < 0 || j >= TAILLE || this.plateau[j][i] != couleur)
			nbAutres = 0;
		return nbAutres;
	}

	/**
	 * Cherche s'il y a au moins une case sur laquelle le joueur passé en paramètre
	 * peut jouer
	 *
	 * @param joueur
	 *
	 *               le joueur dont c'est le tour de jeu
	 * @return s'il y a au moins une case sur laquelle le joueur
	 *
	 *         passé en paramètre peut jouer
	 */
	private boolean peutJouer(Pion joueur) {
		boolean positionJouable = false;
		int j = 0;
		while (j < TAILLE && !positionJouable) {
			int i = 0;
			while (i < TAILLE && !positionJouable) {
				positionJouable = tester(joueur, j, i) > 0;
				i++;
			}
			j++;
		}
		return positionJouable;
	}

	/**
	 * Pose un pion sur le plateau et change la couleur des pions www.eni-ecole.fr
	 * Page 6/12 © ENI - Tous droits réservésLa Programmation Orientée Objet (POO)
	 * avec Java nouvellement encadrés entre ce pion et un autre de la même couleur
	 * dans toutes les directions
	 *
	 * @param couleur
	 *
	 *                couleur du pion à poser
	 * @param y
	 *
	 *                ligne où poser le pion
	 * @param x
	 *
	 *                colonne où poser le pion
	 */
	private void poser(Pion couleur, int y, int x) {
		this.plateau[y][x] = couleur;
		int nbPions;
		for (int dy = -1; dy <= 1; dy++)
			for (int dx = -1; dx <= 1; dx++) {
				nbPions = 0;
				if (dx != 0 || dy != 0) {
					nbPions += testerDirection(couleur, y, x, dy, dx);
					for (int k = 1; k <= nbPions; k++)
						this.plateau[y + dy * k][x + dx * k] = couleur;
				}
			}
	}

	/**
	 * Méthode principale : lance une partie de Reversi
	 *
	 * @param args Rien du tout
	 */
	public static void main(String[] args) {
		PlateauDeReversi p = new PlateauDeReversi();
		p.jouer();
	}
}
