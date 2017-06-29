/*
 * The Pupose of the below program to exhibit a single interface 
 * Implemented in different ways by different class
 * 
 */
public class InterfaceLec1_Part3 
{
	public static void main(String[] args) 
	{
		adder2 a2,a3;
		class1 c1= new class1();
		a2=c1;
		a2.add("2", "3");
		class2 c2= new class2();
		a3=c2;
		a3.add("Samir", "Mounica");
	}
}


interface adder2
{
	public void add(String x, String y);
}

class class1 implements adder2
{
	public void add(String x, String y)
	{
		Object z=Integer.parseInt(x)+Integer.parseInt(y);
		System.out.println(z);
	}
	
}

class class2 implements adder2
{
	public void add(String x, String y)
	{
		String z=x+y;
		System.out.println(z);
	}
}