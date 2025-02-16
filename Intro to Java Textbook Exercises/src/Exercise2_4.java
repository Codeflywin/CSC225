import java.util.*;

public class Exercise2_4 {

	public static void main(String[] args) {
		
		System.out.println("Enter a number in square meters:");
		
		Scanner input = new Scanner (System.in);
		
		double meters = input.nextDouble();
		
		double ping = meters * 0.3025;
		
		System.out.println(meters + " square meters is " + ping + " pings");
		
		input.close();
		
		
		

	}

}
