package store;

import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
	
		

		System.out.println("--- Welcome to BikeStore ---");
		System.out.printf("Add a brand [1]%nAdd a bike [2]%n");

		
		Scanner scanner = new Scanner(System.in);


		int brandUserData = scanner.nextInt();
		
		
		if (brandUserData == 1) {
			System.out.println("--- Type the name of the new Brand ---");
			scanner = new Scanner(System.in);
			String newBrand = scanner.nextLine();
			Brand brand = new Brand(newBrand);
			
			
			System.out.println("--- Add another brand ? (Y)(N) ---");
			
			
			scanner = new Scanner(System.in);
			String addAnotherBrand = scanner.nextLine();
			
			while(addAnotherBrand == "Y") {
				
				System.out.println("--- Type the brand name ---");
				scanner = new Scanner(System.in);
				String newBrand2 = scanner.nextLine();
				Brand newBrand3 = new Brand(addAnotherBrand);
			}

			brand.showBrands();
			
//			System.out.println("--- Add another one ? (Y)-(N) ---");
//			
//			
//			Scanner addAnotherBrand = new Scanner(System.in);
//			brandUserData = scanner.nextLine();
//			
//			
//			if()
//			brand.showBrands();
			return;
		}
	
		
		
		
		//Bikes bikes = new Bikes("Moma fat bike 26", 26, 2023);
		
		//bikes.showBikes();
		
		
		
		//Brand brand = new Brand("Moma");
		
		//brand.showBrands();
		
		

	}


}
