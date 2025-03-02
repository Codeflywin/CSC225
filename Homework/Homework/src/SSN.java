//Enable scanner from package

import java.util.Scanner;

//Name Class
public class SSN {

	public static void main(String[] args) {
		
		
		//Scanner object needs to be added
		
		Scanner input = new Scanner(System.in);
		
		//Prompt User for input
		System.out.println("Enter a SSN: ");
		
		//Determine constants
		String SSN = input.nextLine();
	
		
		//Set Conditions for correct number
		
			if (Character.isDigit(SSN.charAt(0)) &&
			   Character.isDigit(SSN.charAt(1)) &&
			   Character.isDigit(SSN.charAt(2)) &&
			   SSN.charAt(3) == '-' &&
			   Character.isDigit(SSN.charAt(4)) &&
			   Character.isDigit(SSN.charAt(5)) &&
			   SSN.charAt(6) == '-' &&
			   Character.isDigit(SSN.charAt(7)) &&
			   Character.isDigit(SSN.charAt(8)) &&
			   Character.isDigit(SSN.charAt(9)) &&
			   Character.isDigit(SSN.charAt(10))) {
			System.out.println( SSN +" is a valid social security number");
			}
		//Set condition of incorrect number
	else {
		System.out.println(SSN + " is an invalid social security number");
		}
		
		//Close Scanner	
		input.close();
		
	}
}


