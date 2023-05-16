package battlegame;

import java.util.Scanner;

public class Main {

	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		startGame();



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		private static int choseCharacterClass() {
			int chosed;
			boolean chosedOk;
			do {
				System.out.println(" --- Chose your Class ---");
				System.out.println("Options [ 1 - Wizard  ||  2 - SwordsMan ||  3 - Elf  ");
				
				chosed = scan.nextInt();
				
				if(chosed < 1 || chosed > 3) {
					System.err.println("Wrong option, type again !");
				}while(chosed < 1 || chosed > 3);
				return chosed;
			}	
		}
		
		
		
	}
	
	private static String startGame() {
		System.out.println("Welcome to the game !");
		System.out.println("Create your Character, chose a name and a gender");
		String characterName;
		String characterGame;
		System.out.printf("Character Name :  %s", characterName = scan.nextLine());
		System.out.printf("Character Gender :  %s", characterGame = scan.nextLine());
		
		Character character = new Wizard('M', "kleber", 50);
		System.out.println(character);
	}

	
