// Enable Scanner

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {

		//Enable Scanner
		
		Scanner input = new Scanner(System.in);
		
		//Prompt user to add numbers
		
		System.out.println("Enter three numbers: ");
		
		double num1 = input.nextDouble();
		
		double num2 = input.nextDouble();
		
		double num3 = input.nextDouble();
		
		//Close scanner
		
		input.close();
		
		//Include the method
		
		displaySortedNumbers(num1, num2, num3);
	}
	
		//Create the method 
		public static void displaySortedNumbers (double num1, double num2, double num3) {
			
			//Swap variable
			
			double temp;
			
			//Create method of swap
			if  (num2 < num1 && num2 < num3){
				temp = num1;
				num1 = num2;
				num2 = temp;
			}
			else if (num3 < num1 && num3 < num2) {
				temp = num1; 
				num1 = num3;
				num3 = temp;
			}
			if (num3 < num2) {
				temp = num2;
				num2 = num3;
				num3 = temp;
			}
			
			// Display numbers sorted according to increasing order
			System.out.println(num1 + " " + num2 + " " + num3);
			
		}
	}