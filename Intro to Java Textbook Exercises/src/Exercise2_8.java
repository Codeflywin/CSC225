// Enable Scanner

import java.util.Scanner;

//Name Class
public class Exercise2_8 {

	public static void main(String[] args) {
		
		
		//Scanner object needs to be added
		
		Scanner input = new Scanner(System.in);
		
		//Prompt User for input
		System.out.println("Enter the time zone offset to GMT: ");
		
		int offset = input.nextInt();
		
		//Calculate Time
		long totalMilliSeconds = System.currentTimeMillis();
		
		long totalSeconds = totalMilliSeconds / 1000;
		
		long currentSecond = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		
		long currentMinute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		
		//Compute current time
		
		long currentHour = (totalHours % 24) + offset;
		
		//Display results
		System.out.println("The current time is: " + currentHour + ":" + currentMinute + ":" 
		+ currentSecond);
		
		//Close Scanner
		input.close();
		
		

	}

}
