//Enable scanner from package

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {
		
		//Scanner object needs to be added
		
				Scanner input = new Scanner(System.in);
				
				//Prompt User for input
				
				System.out.println("Enter the number of lines: ");
						
				//Create String value
				
				int number = input.nextInt();
				
				//Determine Pyramid size and print results
				
				for (int rows = 1; rows <= number; rows++) {
					
					for (int s = number - rows; s >= 1; s--) {
						System.out.print("  ");
					}
					
					for (int l = rows; l >= 2; l--) {
						System.out.print(l + " ");
					}
					
					for (int r = 1; r <= rows; r++) {
						System.out.print(r + " ");
					}
					
					System.out.println();
					//Close Scanner
					
					input.close();
				}

	}

}
