
public class InheritanceLec1 
{
	public static void main(String[] args)
	{
		derived d= new derived();
		d.display();
		d.incr();
		d.display();
		d.decr();
		d.display();
	}
}


class baseclass
{
	//The Reason for declaring i as 'Protected' is 
	// we wanted the variable to be accessible to the class
	//that only derives it or Extends it
	//Here the variable i is accessible to derived class only
	protected int i;
	
	baseclass()
	{
		i=0;
	}
	
	public void display()
	{
		System.out.println(i);
	}
	
	public void incr()
	{
		i=i+1;
	}
}


class derived extends baseclass
{
	public void decr()
	{
		i=i-1;
	}
}