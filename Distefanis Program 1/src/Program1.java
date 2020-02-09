// Project: Program 1
// Author: Vincent Distefanis
// Date: 02/07/20

import java.util.Scanner;


public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Start Scanner
		Scanner keyboard = new Scanner (System.in);
		
		// Declare Variables
		String favoriteFood;
		int age;
		String firstName;
		
		// Collect User Input
		System.out.print("What is your favorite food? ");
		favoriteFood = keyboard.next();
		System.out.print("What is your age? ");
		age = keyboard.nextInt();
		System.out.print("What is your first name?" );
		firstName = keyboard.next();
		
		keyboard.close();
		
		// Output Results
		System.out.println(firstName + " " + " 's favorite food to eat is " + favoriteFood);
		System.out.println(firstName + " " + " is " + age + " years old. ");
		System.out.println("Favorite Food: " + favoriteFood);
		System.out.println("Age: " + age);
		
	
		
				
		
		
		
		
		
		
	}

}
