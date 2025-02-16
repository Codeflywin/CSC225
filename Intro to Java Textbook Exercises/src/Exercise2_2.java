import java.util.*;

public class Exercise2_2 {

	public static void main(String[] args) {
		
		System.out.println("Enter length of the sides and height of the Equilateral triangle:");
		
		Scanner input = new Scanner (System.in);
		
		double length = input.nextDouble();
		
		double height = input.nextDouble();
		
		double area = ((Math.pow(3, .5)) / 4 ) * (Math.pow(length, 2));
		
		System.out.println("The area is " + area);
		
		double volume = area * height;
		
		System.out.println("The volume of the Triangular prism is " + volume);
	
		input.close();

	}

}