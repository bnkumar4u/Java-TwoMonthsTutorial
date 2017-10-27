//Bank joint account with two coustomers example
//Synchronisation
import java.util.Scanner;

public class ThreadExample
{
	public static void main(String[] args) 
	{
		Account a1=new Account(1000);
		Customer c1=new Customer(a1,"Raj"),c2=new Customer(a1,"Simran");
		Thread t1=new Thread(c1);
		Thread t2=new Thread(c2);
		t1.start();
		t2.start();
	}
}
class Account
{
	private int bal;
	public Account(int amt)
	{
		bal=amt;
	}
	public boolean isSufficientBalance(int w)
	{
		if(bal>w)
			return true;
		else
			return false;
	}
	public void withdraw(int amt)
	{
		bal=bal-amt;
		System.out.println("Withdrawl money is "+amt);
		System.out.println("Your current balance is "+bal);

	}

}
class Customer implements Runnable
{
	private Account account;
	private String n;

	public Customer(Account acc,String name)
	{
		account=acc;
		n=name;
	}
	public void run()
	{
		Scanner kb= new Scanner(System.in);

		synchronized(account)
		{
			
			System.out.println(n+" ,Enter amount to withdraw");
			int amt=kb.nextInt();
			if(account.isSufficientBalance(amt))
			{
				System.out.println(n);
				account.withdraw(amt);
			}
			else
				System.out.println(n+" ,Insufficient balance");
		}
	}
}