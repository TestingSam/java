/*
 * The Intention of the below program is 
 * here fun2 is defined in both base class and Derived class
 * but only the instance of fun2 present in derived2 got executed
 * the reason is fun2 definition is getting over ridden in derived class
 * in order to explicitly call the instance of fun2 in base class
 * we have to used super.fun2(), as mentioned in derived class of fun3 function
 */
public class InheritanceLec2_Part1 
{
	public static void main(String[] args) 
	{
		derived2 d= new derived2();
		d.fun1();
		d.fun2();
		d.fun3();
	}
}

class base
{
	protected int i;
	
	public void fun1()
	{
		System.out.println("base.fun1");
	}
	
	public void fun2()
	{
		System.out.println("base.fun2");
	}
}

class derived2 extends base
{
	public void fun2()
	{
		System.out.println("derived.fun2");
	}
	
	public void fun3()
	{
		super.fun2();
		System.out.println("derived.fun3");
	}
}