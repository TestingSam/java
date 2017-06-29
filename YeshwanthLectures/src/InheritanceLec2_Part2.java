/*
 * The Intension of this program is display the fact that the 
 * constructor calling starts from base class
 * 
 * for example in the below program
 * base3 has 2 construtors defined 1 is zero argument and another is 1 argument
 * now, In the statement 'derived3 d= new derived3(3);', what happens is at first,
 * the program looks for any suitable constructor available in base class, when 'super(3)',
 * is not mentioned in 'derived3(int y)', the zero arg constructor in base class
 * is executed, since super(3), has been mentioned in derived(int y), 'base3(int x)' gets 
 * executed, suppose, if we delete base3() constructor, then we get an error, 
 * which means there should be atleast one constructor available in base class, if a
 * zero argument constructor is present in derived class
 */
public class InheritanceLec2_Part2 {

	public static void main(String[] args) 
	{
		derived3 d= new derived3(3);
		d.display();
	}
}

class base3
{
	protected int i;
	base3()
	{
		System.out.println("Zero arg constructor");
	}
	
	base3(int x)
	{
		i=x;
		System.out.println("1 arg constructor"+i);
	}
	
	public void display()
	{
		System.out.println("Bases3 display");
	}
}

class derived3 extends base3
{
	derived3()
	{
		System.out.println("Zero arg derived class Cons");
	}
	
	derived3(int y)
	{
		//super(3);
		System.out.println("1 arg derived cons"+i);
	}
	
	public void display()
	{
		System.out.println("derived3 display");
	}
}


