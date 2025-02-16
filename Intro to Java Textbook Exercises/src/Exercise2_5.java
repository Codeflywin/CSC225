import java.util.*;

public class Exercise2_5 {

	public static void main(String[] args) {
		
		System.out.println("Enter the subtotal and a gratuity rate:");
		
		Scanner input = new Scanner (System.in);
		
		double subtotal = input.nextDouble();
		
		double GratuityRate = input.nextDouble() / 100;
		
		double gratuity = subtotal * GratuityRate;
		
		double total = subtotal + gratuity;
		
		System.out.println("The gratuity is " + "$"+ gratuity + " and total is " + "$" + total );
		
		input.close();
		

	}

}
