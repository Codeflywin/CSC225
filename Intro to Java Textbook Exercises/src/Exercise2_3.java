import java.util.*;

public class Exercise2_3 {

	public static void main(String[] args) {

		System.out.println("Enter a value for meter:");
		
		Scanner input = new Scanner (System.in);
		
		double meter = input.nextDouble();
		
		double feet = meter * 3.2786 ;
		
		System.out.println( meter + " meters is " + feet);
		
		input.close();
		
	}

}
