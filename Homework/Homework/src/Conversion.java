//Allow scanner input

import java.util.Scanner;

//Name class

public class Conversion {

	public static void main(String[] args) {
	
		// Scanner object needs to be added
		
		Scanner input = new Scanner (System.in);
		
		//Prompt for user input
		
		System.out.println("Enter a number in pounds: ");
		double pounds = input.nextDouble();
				
		//Calculate the conversion
		
		double kilograms = pounds * 0.454;
		
		//Display Results
		
		System.out.println( pounds + " pounds is " + kilograms + " kilograms ");
					
	}

}
