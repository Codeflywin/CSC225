// Enable Scanner

import java.util.Scanner;

//Name Class
public class Game {

	public static void main(String[] args) {

		//Choose play
		System.out.println("scissor (0), rock (1), paper (2):");

		//Scanner object needs to be added
		Scanner input = new Scanner(System.in);

		//Generate computer response
		int computer = (int) (Math.random()*3);
		
		//Prompt for user input
		int player = (int) input.nextInt();
		
		//Compute and display result of the game for the computer
		System.out.print("The computer is "); 
		switch (computer) 
		{
		case 0: System.out.print("scissors."); break;
		case 1: System.out.print("rock."); break;
		case 2: System.out.print("paper."); break;
		}
		
		//Compute and display result of the game for the user
		System.out.print(" You are ");
		switch (player)
		{
		case 0: System.out.print("scissors."); break;
		case 1: System.out.print("rock."); break;
		case 2: System.out.print("paper."); break;
		}
		
		//Display outcome of game
		
		//DRAW
		if (computer == player)
			System.out.println(" too. It is a draw.");
		
		//PLAYER WINS
		else
				{
			boolean win = (player == 0 && computer == 2) ||
						(player == 1 && computer == 0)||
						(player == 2 && computer == 1);
				
			if (win)
				System.out.println(" You won");
			
		//PLAYER LOSES
			else
				System.out.println(" You lose");
		}
			
	}

}
