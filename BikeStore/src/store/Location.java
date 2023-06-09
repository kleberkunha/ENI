package store;

import java.time.LocalDate;
import java.time.Month;

public class Location {

	public static void main(String[] args) {
		
		//This is how i create an Array,
		// and in this array i create every content
		
		//Cycle in coming from the other file "Class Cycle"
		Cycle[] aLouer = {
				new Velo(LocalDate.of(2017, Month.JUNE, 2), "Lapierre", "speed 400", 27),
				new Velo(LocalDate.of(2018, Month.APRIL, 9), "Btwin", "riverside 900", 10),
				new Gyropode(LocalDate.of(2018, Month.JUNE, 5), "Segway", "Ninebot Elite", 40, 150),
				new Gyropode(LocalDate.of(2017, Month.MAY, 2), "Weebot", "Echo", 35, 160),
				new Gyroroue(LocalDate.of(2018, Month.MARCH, 25), "Immotion", "v8", 40),
				new Gyroroue(LocalDate.of(2018, Month.MARCH, 25), "Segway", "Ninebot One E+", 30)
		};
		
		System.out.println("Voici les cycles que nous proposons a la location :");
		for(Cycle c : aLouer) {
			// THE %-65s is the space between the left text and the price in the right side
			System.out.printf(" - %-65s %5.2f$/heure%n", c.toString(), c.getTarifLocationHeure());
			//Here i get the to String that i created in the Cycle class,
			//the toString will show all the text, and the getTarifLocationHeure will show the values NUMBERSint
		}
	}

}
