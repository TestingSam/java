/*
 * The Pupose of this Program is to Show the ability to create a user Defined Exception
 * In the Below program "BankException" is the UserDefined Exception class Inherited from
 * Exception class.
 */
public class Exception_UserDefined_Part1 {

	public static void main(String[] args) 
	{
		customer c= new customer("samir",900);
		c.getBalance();
		try
		{
			c.withdraw("Samir", 500);
		}
		catch(BankException e)
		{
			e.inform();
		}
	}
}

class customer
{
	private String name=null;
	private int balance=0;
	
	customer(String n, int b)
	{
		name=n;
		balance=b;
	}
	
	public int getBalance()
	{
		return balance;
	}
	
	public void withdraw(String n1,int b1) throws BankException
	{
		balance=balance-b1;
		if(balance<500)
		{
			throw new BankException(n1,balance);
		}
		System.out.println("New Balance"+balance);
	}
}


class BankException extends Exception
{
	private String namePassed;
	private int balancePassed;
	BankException(String n, int b)
	{
		namePassed=n;
		balancePassed=b;
	}
	
	public void inform()
	{
		System.out.println("Name"+namePassed);
		System.out.println("BalancePassed"+balancePassed);
	}
}