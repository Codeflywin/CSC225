// Enable Scanner

import java.util.Scanner;

public class Exercise2_12 {

	public static void main(String[] args) {

		//Scanner object needs to be added
		
		Scanner input = new Scanner(System.in);
		
		//Prompt User for input
		System.out.println("Enter speed and acceleration: ");
		
		double speed = input.nextDouble();
		
		double acceleration = input.nextDouble();
		
		//Calculate
		
		double length = (Math.pow(speed, 2)) / (2 * acceleration);
		
		//Display Result
		
		System.out.println("The minimum runway length for this airplane is: " + length);
		
		//Close scanner
		
		input.close();
				
	}

}
