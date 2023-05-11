package game;

import java.util.Random;

public class RandomWords {
	
	public static Random r = new Random();
	
	public static char[] mixCharacters(char[] word) {
		
		// clonage du tableau
		char[] mixed = new char[word.length];
		for (int i = 0; i < mixed.length; i++) {
			mixed[i] = word[i];
		}
		// échanges de position de caractères
		for (int i = 0; i < mixed.length * 4; i++) {
			int p1 = r.nextInt(mixed.length);
			int p2 = r.nextInt(mixed.length);
			char tmp = mixed[p1];
			mixed[p1] = mixed[p2];
			mixed[p2] = tmp;
		}
		return mixed;
	}
}
