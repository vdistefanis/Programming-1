//Class Name: BankAccount
//Purpose:    Create and store bank account info


public class BankAccount {
	
	// Declare Variables
	public String Name;
	private double balance;
	public char type;
	public double intrestRate;
	public int accountNumber;
	
	public BankAccount()
	{
		
		// Set initial balance of account
		balance = 0;
		double interestRate = .02;
		
	}
	
	// Deposit funds
	public void addDeposit(double dep)
	{
		balance = balance + dep;
	}
	
	//Withdrawal funds
	public void subtractWithdrawal(double wit)
	{
		if (balance < wit)
		{
			System.out.println("You do not have enough funds to withdrawal that amount.");
		}
		else
		{
			balance = balance - wit;
		}
	}
	
	// Check balance
	public double getBalance()
	{
		return balance;
	}
	
	// Calc interest
	public void calcInterest()
	{
		
			// only calculate interest for S or I accounts
			if (type =='S' || type =='I')
			{
				double interestAmount;
				double interestRate = 0;
				interestAmount = balance * interestRate;
				balance += interestAmount;
				
				// balance = balance * (interestRate);				// multiply by 1.02
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
