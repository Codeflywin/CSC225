//Allow scanner input

import java.util.Scanner;

//Name Class

public class Distance {

	public static void main(String[] args) {
		
		// Scanner object needs to be added
		
		Scanner input = new Scanner (System.in);
		
		//Ask user to enter x1 and y1
		
		System.out.println(" Enter x1 and y1: ");
		
		//Add scanner line
		
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		//Ask user to enter x2 and y2
		
		System.out.println(" Enter x2 and y2: ");
		
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		//Calculate the distance
		
		double distance = Math.pow( Math.pow(x2 - x1 , 2) + Math.pow( y2 - y1, 2), .5);
		
		//Display the result
		
		System.out.println ("The distance between the two points is: " + distance);
		
		//Close Scanner
		
		input.close();
		
		
		}

	}
