// Enable Scanner

import java.util.Scanner;

public class Exercise2_9 {

	public static void main(String[] args) {

		//Scanner object needs to be added
		
				Scanner input = new Scanner(System.in);
				
				//Prompt User for input
				System.out.println("Enter v0, v1, and t: ");
				
				double v0 = input.nextDouble();
				
				double v1 = input.nextDouble();
				
				double t = input.nextDouble();
				
				//Calculate
				double a = (v1 - v0) / t;
				
				//Display Result
				System.out.println("The average acceleration is: " + a);
				
				//Close Scanner
				input.close();
				
	}

}
