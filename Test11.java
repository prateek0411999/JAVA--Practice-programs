import java.util.*;
import java.time.*;
interface Wallet
{
	void deposit(int amount);
}
abstract class Payment
{
	 abstract void pay(int amount);
}
class PayTM extends Payment implements Wallet
{
	private int accountID;
	private int balance;
	void showDetails()
	{
		System.out.println(accountID);
	
	}
	public void deposit(int amount)
	{
		balance=balance+amount;
	}
	public void pay(int amount)
	{
		if(balance<amount)
		{
			System.out.println("Error");
		}
		else if(amount>1000)
		{
			amount=amount/2;
			balance=balance-amount;
		}
	}
	PayTM(int a ,int b)
	{
		this.accountID=a;
		this.balance=b;	
	}
	
}
class Test11
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the account iD and amount to store");
		int aa=sc.nextInt();
		int bb=sc.nextInt();
		PayTM obj=new PayTM(aa,bb);
		
		System.out.println("1  Deposit money in account");
		System.out.println("2  SHOW account details");
		System.out.println("3  pay money at the shop");	
		
		System.out.println("Enter your Choice");
		int a=sc.nextInt();
		
		switch(a)
		{
			case 1:
				System.out.println("Enter the amount to deposit");
				int q=sc.nextInt();
				obj.deposit(q);
				
			case 2:
				System.out.println("Account Details");
				obj.showDetails();
				
			case 3:
				System.out.println("PAY money");
				System.out.println("Enter the amount to pay");
				int aw=sc.nextInt();
				obj.pay(aw);
				obj.showDetails();

		}
	}
}