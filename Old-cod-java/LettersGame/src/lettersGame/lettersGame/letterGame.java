package lettersGame;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class letterGame {
	public static final String FILE_WORDS = "names.txt";
	public static final int NB_WORDS = 22506;
	
	public static Random r = new Random();

	
	public static char[] main(String[] args) throws IOException {
		
			int numMot = r.nextInt(NB_WORDS);
			try (FileInputStream fichier = new FileInputStream(FILE_WORDS);
					
					Scanner s = new Scanner(fichier)) {
						for (int i = 1; i <= numMot; i++)
							s.nextLine();
					return s.nextLine().toUpperCase().toCharArray();
			}
	}
	
	
	
}
