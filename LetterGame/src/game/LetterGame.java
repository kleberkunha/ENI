package game;

import java.io.IOException;

public class LetterGame {

	public static void main(String[] args) throws IOException {

		char[] table = GetWordsRandom.getRandomWord();
	
		//ReadNames teste1 = new ReadNames();
		char[] returnTable = RandomWords.mixCharacters(table);
	
		System.out.println(returnTable);
		
	}
}