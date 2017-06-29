/*
 * The Purpose of the below class is to demonstrate the usage of Singletom class
 * Here in the below class, no matter the number of times a new Object is created
 * for SingleTon class the same REFERENCE is Returned each time
 * 
 * JUST DEBUG Below class you will Understand.
 * 
 */
public class StaticFunctionsLec1_Part2 
{
	public static void main(String[] args) 
	{
		singleton s1= new singleton();
		singleton.display();
		singleton s2= new singleton();
		singleton.display();
	}
}


class singleton
{
	static singleton p;
	static int count=0;
	singleton()
	{
		count=count+1;
	}
	
	public static singleton display()
	{
		if(p==null)
			p=new singleton();
		System.out.println("Value of count is"+count);
		return p;

	}
}