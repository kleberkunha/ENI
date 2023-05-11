package game;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public abstract class GetWordsRandom extends ReadNames{
	final static int NB_WORDS = 22506;
	public static Random r = new Random();
	
	public static char[] getRandomWord() throws IOException {
		// here i start the file and his value is the return from the class ReadNames
		ReadNames file = new ReadNames();
		
		//Here i receive the words in random
		int numMot = r.nextInt(NB_WORDS);
		
		//the next line we user FileInputStream to create a 
		try (FileInputStream ListNames = new FileInputStream(file.readFile());
				Scanner s = new Scanner(ListNames)) {
			for (int i = 1; i <= numMot; i++)
				s.nextLine();
			return s.nextLine().toUpperCase().toCharArray();
		}
	}

}
