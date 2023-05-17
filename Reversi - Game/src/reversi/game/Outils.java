package reversi.game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Outils {
	private static Scanner s = new Scanner(System.in);

	/**
	 * Fait saisir à l'utilisateur une valeur comprise entre les valeurs {@code min}
	 * et {@code max} passées en paramètre. En cas d'erreur, l'utilisateur devra
	 * ressaisir jusqu'à ce que la valeur soit correcte.
	 * 
	 * @param message
	 *
	 *                message à afficher à l'utilisateur pour l'inviter à saisir
	 * @param min
	 *
	 *                valeur minimale acceptable (incluse)
	 * @param max
	 *
	 *                valeur maximale acceptable (incluse)
	 * @return la valeur saisie par l'utilisateur
	 */
	public static int saisie(String message, int min, int max) {
		System.out.printf("%s ", message);
		int val = 0;
		boolean ok;
		do {
			try {
				val = Outils.s.nextInt();
				ok = val >= min && val <= max;
			} catch (InputMismatchException e) {
				ok = false;
			} finally {
				Outils.s.nextLine();
			}
			if (!ok)
				System.err.printf("La valeur doit être un entier compris entre %d et %d%nRessaisissez... ", min, max);
		} while (!ok);
		return val;
	}
}