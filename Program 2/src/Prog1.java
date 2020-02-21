// Project: Program 2
// Author: Vincent Distefanis
// Date: Feburary 18, 2020
// Version 1.0
// Git User: vdistefanis


import java.util.Scanner;


public class Prog1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	// Activate scanner/keyboard
	Scanner keyboard = new Scanner(System.in);
	
	// Variables
	int number1;
	int number2;
	int number3;
	
	// User Input
	System.out.println("Pick three numbers 1-100");
	number1 = keyboard.nextInt();
	number2 = keyboard.nextInt();
	number3 = keyboard.nextInt();
	
	// Main Menu
	System.out.println("Main Menu");
	System.out.println("\t1.) Divide");
	System.out.println("\t2.) Subtract ");
	System.out.println("\t3.) Multiply");
	System.out.println("\t4.) Add");
	System.out.println("\t5.) Exit");
	System.out.println("Which option would you like? ");
	
	// Ask for User Input
	int menuChoice = keyboard.nextInt();
		
		
	switch (menuChoice) {
	
	case 1:
		System.out.println(number1 / number2);
		if (number3 > (number1 / number2))
			System.out.println("Your third number is greater than your first two numbers divided");
		else {
			if (number3 < (number1 / number2))
			System.out.println("Your third number is less than your firts two numbers divided");
		}
		break;
	case 2:
		System.out.println(number1 - number2);
		if (number3 > (number1 - number2))
				System.out.println("Your third number is greater than your first number subtracted from the second");
		else {
			if (number3 < (number1 - number2))
				System.out.println("Your third number is less than your first number subtracted from the second");
		}
		break;
	case 3:
		System.out.println(number1 * number2);
		if (number3 < (number1 * number2))
			System.out.println("Your third number is less than your first two numbers multiplied");
		else {
			if (number3 > (number1 * number2))
				System.out.println("your third number is greater than your first two numbers multiplied");
		}
		break;
	case 4:
		System.out.println(number1 + number2);
		if (number3 < (number1 + number2))
			System.out.println("Your third number is less than the sum of your first two numbers");
		else {
			if (number3 > (number1 +number2))
				System.out.println("Your third number is greater than the sum of your first two numbers");
		}
		break;
	
		
		
		
	
	
	}
	
	
	
	
	
	
	
	
	
		
		

	}

}
