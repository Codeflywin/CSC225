// Enable Scanner

import java.util.Scanner;

public class Exercise2_11 {

	public static void main(String[] args) {

		//Scanner object needs to be added
		
				Scanner input = new Scanner(System.in);
				
				//Prompt User for input
				System.out.println("Enter the number of years: ");
				
				int years = input.nextInt();
				
				//Calculate Population
				int population = 312032486 + (((31536000 / 7) - (31536000 / 13)
						+ (31536000 / 45)) * years);
				
				//Display Result
				
				System.out.println("The population in 5 years is: " + population );
				
				//Close Scanner
				
				input.close();
	
	}

}
