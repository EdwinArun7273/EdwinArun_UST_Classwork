package Day3Programs;

import java.util.Scanner;

class bankAccount
{
	Scanner c1 = new Scanner(System.in);
	static int bal = 0;
	int dep, wit;
	void deposit()
	{
		System.out.println("Enter amount to Deposit: ");
		dep = c1.nextInt();
		bal+=dep;
		System.out.println("\nAmount Deposited Successfully");
		System.out.println("Current Balance: " + bal);
		
	}
	
	void withdraw()
	{
		bal-=wit;
		System.out.println("\nAmount Withdrawed Successfully");
		System.out.println("Current Balance: " + bal);
	}
}

class savingsAccount extends bankAccount
{
	void withdraw()
	{
		System.out.println("Enter amount to Withdraw: ");
		wit = c1.nextInt();
	    if ((bal-wit)<2000)
	    {
	    	System.out.println("Insufficient Balance");
	    	System.out.println("Current Balance: " + bal);
	    }
	    else
	    {
	    	super.withdraw();
	    }
	}
}

public class Exercise_01 {

	public static void main(String[] args) {
		int ch;
		Scanner c2 = new Scanner(System.in);
		savingsAccount obj1 = new savingsAccount();
		do {
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Exit");
			ch = c2.nextInt();
			if (ch==1)
			{
				obj1.deposit();
			}
			else if (ch==2)
			{
				obj1.withdraw();
			}
		} while (ch==1 || ch==2);
	}

}
