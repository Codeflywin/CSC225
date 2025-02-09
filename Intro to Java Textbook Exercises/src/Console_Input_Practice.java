// In order to allow console input, scanner class from java.util package needs to be added

import java.util.Scanner; 

public class Console_Input_Practice {

	public static void main(String[] args) {
		// Add the scanner object
		Scanner input = new Scanner (System.in);
		
		// Have the user add the radius input through the console
		System.out.println ("Enter a number for radius: ");
		double radius = input.nextDouble();
		
		//Compute the area of the circle with the console entered radius
		double area = radius * radius * 3.14159;
		
		//Display the results
		System.out.println ("The area for the circle of radius " + 
		radius + " is " + area);
		

	}

}
