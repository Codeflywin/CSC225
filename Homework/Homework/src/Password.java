// Enable Scanner

import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		
				//Enable Scanner
		
				Scanner input = new Scanner(System.in);
				
				//Prompt user to add numbers
				
				System.out.println("Enter a password to verify ");
				
				String s = input.nextLine();
				
				//Close scanner
				
				input.close();
				
				// Set the condition
				
				if (isValidPassword(s)) {
					System.out.println("It is a valid password.");
				}
				else  {
					System.out.println("It is an ivalid password.");
				}
	}
				
				//Create method *must be boolean (need true/false)*
	
				public static boolean isValidPassword(String s) {
				
				//Password should not contain any signs
					for (int i = 0; i < s.length(); i++ ) {
						if(!Character.isLetter(s.charAt(i)) &&
						   !Character.isDigit(s.charAt(i)))
						return false;
						}
				//Password should be at least 8 characters
					if (s.length() < 8)
					return false;
				
				//Count Digits
					int count = 0;
					for (int i = 0; i < s.length(); i++) {
						if (Character.isDigit(s.charAt(i)))
							count++;
						}
				//It should have at least 2 digits
					if (count >=2)
						return true;
					else
						return false;	
	}
}
