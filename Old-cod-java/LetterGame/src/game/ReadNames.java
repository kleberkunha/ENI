package game;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class ReadNames {
	
	public File readFile() {
	
		File file = new File("names.txt");
		
		try (FileReader fileReader = new FileReader(file);
	         BufferedReader bufferedReader = new BufferedReader(fileReader)) {
	
	        String line;
	        while ((line = bufferedReader.readLine()) != null) {
	           String char_list = line;
	        }
	
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		return file;
	}
}