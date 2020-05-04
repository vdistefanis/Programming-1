// Title: Program 6 - Arrays
// Author: Vincent Distefanis
// Date: May 4, 2020
// Version: 1.0

//Import additional code being used
import java.util.Scanner;
import java.util.Random;

public class Prog6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			//Declare Variables
			Scanner keyboard = new Scanner(System.in);
			Random randomNumber = new Random ();
			int teamOneTotal = 0;
			int teamTwoTotal = 0;
			String teamOne = "Penn State:\t";
			String teamTwo = "Ohio State:\t";
			
			// Sport and Explanation
			System.out.println("Welcome to CS Football! The goal of Football is to advance the ball to the opposing team's endzone while the defense attempts to stop them. ");
			System.out.println("Whichever team scores the most points wins! ");
			
			//Prompt user for # of sections and create array
			System.out.print("How many sections do you want to play? ");
			int sections = keyboard.nextInt();
			
			//Create the array
			int[][] scores = new int[2][sections];
			
			// Loop One: loop through rows first
			for (int row = 0; row<scores[0].length; row++)
			{
				
				// Loop Two: loop through cols second
				for (int col = 0; col<scores.length; col++)
				{
					
						// Random info for Team One
						if(col == 0)
						{
							
							//Random
							scores[col][row] = randomNumber.nextInt(100);
							//Total
							teamOneTotal += scores[col][row];
							//Add to our String
							teamOne = teamOne + scores[col][row] + "\t";
							
						}
						
						// Random info for Team Two
						if(col == 1)
						{
							//Random
							scores[col][row] = randomNumber.nextInt(100);
							//Total
							teamTwoTotal += scores[col][row];
							//Add to our string
							teamTwo = teamTwo + scores[col][row] + "\t";
							
						}
						
						
						
				}//End of Loop Two
				
			}//End of Loop One
			
			//Output total scores
			System.out.println(teamOne + "=\t" + teamOneTotal);
			System.out.println(teamTwo + "=\t" + teamTwoTotal);
			
			if (teamOneTotal == teamTwoTotal)
			{
				System.out.println("There was a tie!");
			}
			else
			{
				if (teamOneTotal > teamTwoTotal)
					System.out.println("Team One is the Winner!");
				else
					System.out.println("Team Two is the Winner!");
			}
	}

}
