package exoCalendar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Year");
		int selectedYear = scan.nextInt();
		
		System.out.println("Enter the Month");
		int selectedMonth = scan.nextInt() - 1;
		
		
		Calendario calendar = new Calendario(selectedYear, selectedMonth);

	}

}
