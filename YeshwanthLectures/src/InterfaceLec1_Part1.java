/*
 * The purpose of the below program is to demonstrate the Concept of interface
 * An Interface is nothing but a Group of code, with function declarations alone
 * The class that IMPLEMENTS the interface should define those function declared in interface
 */
public class InterfaceLec1_Part1 
{
	public static void main(String[] args) 
	{
		//In the below code, we are creating the object for the Interface
		//This object a, can access the functions corresponding to adder interface alone
		adder a;
		//In the below statement, the object for the class calc is created. 
		//The Reference of class calc is stored in 'c'
		calc c= new calc();
		// The Reference of class calc stored in c, is assigned to a, which is the Object of interface adder.
		a=c;
		int res=a.add(10, 20, 0);
		System.out.println(res);
		
		subtract s;
		s= new calc();
		res=s.sub(20, 10, 0);
		System.out.println(res);
	}
}

/*
 * adder,subtract, mutiply are the interfaces
 * 
 */
interface adder
{
	public int add(int x, int y, int z);
}

interface subtract
{
	public int sub(int x, int y, int z);
}

interface mutiply
{
	public int mul(int x, int y, int z);
}

/*
 * Following is the class that Implements the Mutiple interfaces adder, subtract, multiply
 * 
 */
class calc implements adder, subtract, mutiply
{
	public int add(int x, int y,int z)
	{
		z=x+y;
		return z;
	}
	
	public int sub(int x, int y, int z)
	{
		z=x-y;
		return z;
	}
	
	public int mul(int x, int y, int z)
	{
		z=x*y;
		return z;
	}
}