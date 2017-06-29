/*
 * The pupose of the below class is to demonstrate the static functions and static data
 * REMEMBER: Static function can only use static data
 * The Function can be called by className.staticfunction
 * 
 * static data is nothing but shared data
 * Which means, in the below code "Count" is the static data, which is sgared between 
 * the Objects s1, s2, s3
 */
public class StaticFunctionsLec1_Part1 
{
	public static void main(String[] args) 
	{
		shape1 s1= new shape1();
		//The static Function can be called by className.staticfunction
		shape1.display();
		shape1 s2= new shape1();
		shape1.display();
		shape1 s3= new shape1();
		shape1.display();
		System.out.println(s1.count);
	}
}

class shape1
{
	int i;
	static int count=0;
	shape1()
	{
		i=0;
		count=count+1;
	}
	
	static void display()
	{
		System.out.println("Count is"+count);
	}
}


