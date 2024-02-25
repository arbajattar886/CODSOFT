import java.util.Arrays;
import java.util.Scanner;

class BankAccount
{
	private int balance;
	public BankAccount(int initialAmount)
	{
		this.balance=initialAmount;
	}
	
	public int balance()
	{
		return balance;
	}
	public void deposite(int amount)
	{
		if(amount>0)
		{
			balance+=amount;
			System.out.println("Deposite of "+amount +" Rs was succesful");
		}
		else
		{
			System.out.println("Invalid entry. Please choose a number above 0");
		}
	}
	
	public void withdraw(int amount)
	{
		if(amount>0&& amount<=balance)
		{
			amount-=balance;
			System.out.println("Withdraw succesfuly of "+amount+"Rs");
			
		}
		else
		{
			System.out.println("Invalid Entry..Insufficent balance or nnegative value entered");
		}
	}
}


class ATM
{
	private BankAccount account;
	public ATM(BankAccount account)
	{
		this.account=account;
	}
	public void display()
	{
		System.out.println("Select option");
		System.out.println("1.Check Balance");
		System.out.println("2.Deposite");
		System.out.println("3.Withdraw");
		System.out.println("4. Leave");
	}
	public void run()
	{
		Scanner sc=new Scanner(System.in);
		int option;
		do {
			display();
			System.out.println("Pick an option");
			option=sc.nextInt();
			
				switch (option) 
				{
				case 1:
					System.out.println("Current balance: "+account.balance());
					break;
					
				case 2:
					System.out.println("Enter amount to deposite: ");
					int depositeAmount=sc.nextInt();
					account.deposite(depositeAmount);
	
					
					break;
					
				case 3:
					System.out.println("x:Enter amount to withdraw :");
					int withdrawAmount=sc.nextInt();
					account.withdraw(withdrawAmount);
					break;
					
				case 4:
					System.out.println("x:Thanks for working with ABC Bank....");
					break;
	
				default:
					System.out.println("Invalid entry!!!.Enter only given options..");
					break;
			}
		}while(option!=4);
		}
	}




public class ATM_Interface {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount userAccount=new BankAccount(30000);
		ATM atm=new ATM(userAccount);
		atm.run();

	}
}
