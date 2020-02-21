// Project: Program 3
// Author: Vincent Distefanis
// Date: Feburary 24, 2020
// Git User: vdistefanis

import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Start Scanner
		Scanner Keyboard = new Scanner(System.in);
		
		// Variables
		String name;
		int number1;
		
		// Collecting Variables
		System.out.println("What is your name? ");
		name = Keyboard.next();
		System.out.println("Choose a number between 0-100. ");
		number1 = Keyboard.nextInt();
		
		// While Loop
		while (number1 < 0 || number1 > 100)
		{
			System.out.println("Please choose a number between 0 and 100. ");
			number1= Keyboard.nextInt();
		}
			System.out.println("Thank you for your input " + name + ". ");
			
		// For loop
		for (number1--; number1 >=0; number1--)
		{
				if(number1 > 4)
				{
					System.out.println(number1);
					System.out.println("Please standby, an important announcement will be made soon! ");
				}
				if (number1 == 4 )
				{
					System.out.println(number1 +  " seconds until the annual purge begins!");
				}
				if (number1 == 3)
				{
					System.out.println("The purge will begin in " + number1 + " seconds." );
				}
				if (number1 == 2)
				{
					System.out.println(number1 + " seconds until the purge begins, get ready! ");
				}
				if (number1 == 1)
				{
					System.out.println(number1 + " second remaining! Ready your weapons. ");
				}
				if (number1 == 0)
				{
					System.out.println("It has begun!!! ");
		}
		
		// Closing Keyboard
		Keyboard.close();
		
		
		
		
		
		
		
		
		
		}
		
		
		
		

	}

}
