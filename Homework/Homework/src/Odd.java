//Enable scanner from package

import java.util.Scanner;


public class Odd {

	public static void main(String[] args) {
		
		//Scanner object needs to be added
		
		Scanner input = new Scanner(System.in);
		
		//Prompt User for input
		
		System.out.println("Enter a string: ");
				
		//Create String value
		
		String string = input.nextLine();
	
		//Display only Odd Chars
		for (int i = 0; i < string.length(); i += 2)
			System.out.print(string.charAt(i));
		
		//Close scanner
		
		input.close();
			

		
	}

}
