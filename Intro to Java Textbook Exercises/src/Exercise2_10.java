// Enable Scanner

import java.util.Scanner;

public class Exercise2_10 {

	public static void main(String[] args) {

		//Scanner object needs to be added
		
		Scanner input = new Scanner(System.in);
		
		//Prompt User for input
		System.out.println("Enter the amount of water in kilograms: ");
		
		double kg = input.nextDouble();
		
		System.out.println("Enter the initial temperature: ");
		
		double itemp = input.nextDouble();
		
		System.out.println("Enter the final temperature: ");
		
		double ftemp = input.nextDouble();
		
		//Calculate
		
		double energy = kg * (ftemp - itemp) * 4184;
		
		
		//Display result
		System.out.println("The energy needed is: " + energy );
		
		
		//Close scanner
		
		input.close();
		
		
		
	}

}
