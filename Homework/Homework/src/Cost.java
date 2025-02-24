// Enable Scanner

import java.util.Scanner;

//Name Class
public class Cost {

	public static void main(String[] args) {
		
		
		//Scanner object needs to be added
		
		Scanner input = new Scanner(System.in);
		
		//Ask for package weight and cost
		
		System.out.println("Enter weight and price for package 1: ");
		double weight1 = input.nextDouble();
		double price1 = input.nextDouble();
		System.out.println("Enter weight and price for package 2: ");
		double weight2 = input.nextDouble();
		double price2 = input.nextDouble();
		
		//Determine which price is better
		
		if (price1 / weight1 < price2 / weight2)
			System.out.println("Package 1 has a better price.");
		
		else if (price1 / weight1 > price2 / weight2)
			System.out.println("Package 2 has a better price.");
			
		else
				System.out.println("Two packages have the same price");
		
		
	}

}
