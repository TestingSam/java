
public class StaticFunctionsLec1_Part3 
{
	public static void main(String[] args) 
	{
		staticblock s1= new staticblock();
		s1.display();
	}
}

class staticblock
{
	static int a,b,c;
	static
	{
		//Code in static block gets executed only once when the the program starts
		a=10;
		b=20;
		c=30;
	}
	
	public void display()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}