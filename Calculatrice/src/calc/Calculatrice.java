package calc;

import java.math.BigInteger;
//import java.util.InputMismatchException;
//import java.util.NoSuchElementException;
import java.util.Scanner;

public class Calculatrice {

	private static Scanner s = new Scanner(System.in);
	private static final String OPERATEURS = "+-*/%q";

	public static void main(String[] args) {
		
		int valeur = saisirEntier();
		char operateur;
		
		do {
			operateur = saisirOperateur();
			try {
				if(operateur != 'q') {
					int res = 0;
					int valeur2 = saisirEntier();
					switch (operateur) {
					case '+':
						res = Operation.ajouter(valeur, valeur2);
						break;
					case '-':
						res = Operation.ajouter(valeur, valeur2);
						break;
					case '*':
						res = Operation.ajouter(valeur, valeur2);
						break;
					case '/':
						res = Operation.ajouter(valeur, valeur2);
						break;
					case '%':
						res = Operation.ajouter(valeur, valeur2);
						break;
					}
					System.out.printf("%d %s %d = %d%n", valeur, operateur, valeur2, res);
					valeur = res;
				}
			}catch(DepassementCapaciteException e) {
				System.out.println(e.getMessage());
			}catch(ArithmeticException e) {
				System.out.println("la division par zéro n'est pas définie pour des entiers");
			}
		}while(operateur != 'q');
	}
	

		private static char saisirOperateur() {
			String saisie;
			boolean saisieOk;
			do {
				System.out.println("opérateur ? (+ - * / % ou q pour quitter)");
				saisie = s.nextLine();
				saisieOk = saisie.length() == 1 &&
				Calculatrice.OPERATEURS.indexOf(saisie.charAt(0)) != -1;
			if (!saisieOk)
				System.err.println("Opérateur non valide");
			} while (!saisieOk);
			return saisie.charAt(0);
		}
		
		
		
		private static int saisirEntier() {
			System.out.println("Saisir un nombre entier");
			int valeur = 0;
			String valS = s.nextLine();
			boolean saisieOk = false;
			do {
				try {
					valeur = Integer.parseInt(valS);
					saisieOk = true;
				}catch(NumberFormatException e) {
					try {
						new BigInteger(valS);
						System.out.println("la valeur saisie dépasse les capacités de cette calculatrice. Réessayez...");
					} catch (NumberFormatException f) {
						System.err.println("Saisie incorrecte. Réessayez...");
					}
					valS = s.nextLine();
				}
			}while(!saisieOk);
			return valeur;
		}
		
		
		
		
		
		
		
		
	}
