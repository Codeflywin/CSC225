import java.util.Scanner;

public class Exercise2_1 {

	public static void main(String[] args) {

		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter miles:");
		double miles = input.nextDouble();
		
		
		double kilometers = miles * 1.6;
		
		System.out.println( miles + " miles is " + kilometers + " kilometers");
		
		input.close();
		
	}

}
