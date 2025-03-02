// Enable Scanner

import java.util.Scanner;

//Name Class
public class Exercise2_7 {

	public static void main(String[] args) {
		
		
		//Scanner object needs to be added
		
		Scanner input = new Scanner(System.in);
		
		//Prompt User for input
		System.out.println("Enter the number of minutes: ");
		
		int minutes = input.nextInt();
		
		//Calculate years
		int years = minutes / 525600;
		
		
		//Find Remainder Minutes and calculate days remaining
		int remainingminutes = minutes % 525600;
		
		int days = remainingminutes / 1440;
			
		//Display Result
		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
		
		//Close Scanner
		
		input.close();		
	}

}
