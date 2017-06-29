
public class InheritanceLec2_Part3 
{
	public static void main(String[] args)
	{
		derived4 d= new derived4();
	}
}

class base4
{
	protected int i=10;
	base4()
	{
		System.out.println("value of i"+i);
	}
}

class derived4 extends base4
{
	int i=20;
	derived4()
	{
		System.out.println("value of local i"+i);
		System.out.println("Value of i from base class"+super.i);
	}
}