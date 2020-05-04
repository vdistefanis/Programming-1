import java.util.Scanner;

// Name: Example of Classes
// Author: Vincent Distefanis
// Date: March 24, 2020

public class bankinfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// Declare our variables
		Scanner keyboard = new Scanner (System.in);
		boolean mainLoop = true;
		double deposit = 0;
		double withdrawal = 0;
		
		// Create a checking account of BankAccount
		BankAccount checking = new BankAccount();
		
		checking.Name = "Vincent's Primary Checking";
		checking.accountNumber = 85914;
		checking.type = 'C';
		
		// Create a Savings Account
		BankAccount savings = new BankAccount();
		savings.type = 'S';
		BankAccount ibChecking = new BankAccount();
		ibChecking.type = 'I';
		
		// Set initial balance
		// checking.balance = 200.00
		// I CANNOT do this because balance is private
		checking.addDeposit(200.00);
		//System.out.println("Your starting balance is: $" + checking.getBalance());
		
		
		int menuChoice;
		while(true) {
			
			System.out.println("Welcome to the main menu");
			System.out.println("\t1.) Make a deposit");
			System.out.println("\t2.) Make a withdrawal");
			System.out.println("\t3.) Check balance");
			System.out.println("\t4.) Exit menu");
			
			menuChoice = keyboard.nextInt();
			
			
	
			switch (menuChoice) {
			
			case 1:
				// Make deposit
				System.out.print("How much would you like to deposit? ");
				deposit = keyboard.nextDouble();
				checking.addDeposit(deposit);
				break;
				
			case 2:
				// Make Withdrawal
				System.out.print("How much would you like to withdrawal? ");
				withdrawal = keyboard.nextDouble();
				checking.subtractWithdrawal(withdrawal);
				break;
				
			case 3:
				// Check Balance
				System.out.println("Your final chekcing balance is: $" + checking.getBalance());
				System.out.println("Your final savings balance is: $" + savings.getBalance());
				break;
				
			case 4:
				//Exit Program
				System.out.println("Exiting Menu...");
				System.exit(0);
				break;
			default :
					System.out.println("This is not a valid menu option. Please Select a valid menu choice. ");
					break;
					
				
					
			
			
			
			
			}
			
			// Transfer funds from chekcing to savings
						checking.subtractWithdrawal(50.00);
						savings.addDeposit(50.00);
						
						// Calculate interest
						ibChecking.calcInterest();
						checking.calcInterest();
						savings.calcInterest();
						
				
					
						
		
		
	}
	
	
	
			

}
}