//Enable scanner from package

import java.util.Scanner;

//Name Class
public class Phone {

	public static void main(String[] args) {
		
		
		//Scanner object needs to be added
		
		Scanner input = new Scanner(System.in);
		
		//Prompt User for input
		System.out.println("Enter a letter: ");
		
		//Determine constants
		String s = input.nextLine();
		char ch = s.charAt(0);
		ch = Character.toUpperCase(ch);
		int number = 0;
		
//Determine what value to display
		if (Character.isLetter(ch)) {
		
			if (ch >= 'A' && ch < 'D') 
				number = 2;
			
			else if (ch >= 'D' && ch < 'G')
				number = 3;
		
			else if (ch >= 'G' && ch < 'J')
				number = 4;
			
			else if (ch >= 'J' && ch < 'M')
				number = 5;
		
			else if (ch >= 'M' && ch < 'N')
				number = 6;
		
			else if (ch >= 'N' && ch < 'P')
				number = 7;
		
			else if (ch >= 'P' && ch < 'T')
				number = 8;
		
			else if (ch >= 'T' && ch <= 'Z')
				number = 9;
		System.out.println("The corresponding number is " + number);	
		}

//If input charcter invalid display error
		else {
			System.out.println( ch + " is an invalid input.");
		}

//Close Scanner
	input.close();
	}
}