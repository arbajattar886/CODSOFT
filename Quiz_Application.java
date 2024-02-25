package com.sunbeam;

import java.util.Scanner;

class BankAccount
{
	public int balance;
	public  BankAccount(int initialbalance)
	{
		this.balance=initialbalance;
	}
	
	public int display()
	{
		return balance;
	}
	
	public void withdraw(int amount)
	{
		if(amount>0 && balance>amount)
		{
			balance-=amount;
			System.out.println("Withdraw succesfully...Your account balance : "+balance);
			
		}
		else
		{
			System.out.println("You have withdrawing wrong amount....Please entered valid amount..");
		}
	}
	
	public void deposite(int amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Amount Depoited succesfully... Your account balance : "+balance);
		}
		else
		{
			System.out.println("Ypu have depositing invalid amount");
		}
	}
}

class ATM
{
	private BankAccount bankaccount;
	public ATM(BankAccount bankAccount)
	{
		this.bankaccount=bankAccount;
	}
	
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		int option;
		do
		{
			System.out.println("Chose one option");
			System.out.println("1. Display Balance");
			System.out.println("2. Withdrow Amount");
			System.out.println("3. Diposite Amount");
			System.out.println("4. Leave system");
			option=sc.nextInt();
			
			switch(option)
			{
			case 1:
				int balance=bankaccount.display();
				System.out.println("Your account balance :"+balance);
				break;
				
			case 2:
				System.out.println("Enter amount to be withdrow: ");
				int amount=sc.nextInt();
				bankaccount.withdraw(amount);
				break;
				
			case 3:
				System.out.println("Enter amount to be deposited :");
				int money=sc.nextInt();
				bankaccount.deposite(money);
				break;
				
			case 4:
				System.out.println("Thank you for chossing our app....");
				break;
				
			default:
				System.out.println("You have entered invalid option....");
				
			}
		}while(option!=4);
	}
}

public class Quiz_Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount useraccount=new BankAccount(30000);
		ATM atm=new ATM(useraccount);
		atm.run();
		

	}

}
