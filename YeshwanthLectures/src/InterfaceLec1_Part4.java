/*
 * The purpose of the below class is to demonstrate the concept of getting
 * the properties or functionalites of various codes
 * 
 * We cannot inherit from two base classes in one derived class
 * 
 * Here in the below class male, i wanted to use the functions getHeight and smell
 * 
 * Hence used an interface called perfume for smell and class person for getheight
 * 
 */
public class InterfaceLec1_Part4 
{
	public static void main(String[] args) 
	{
		//male m1=new male();
		perfume p;
		p=new male();
		p.smell();
		
		p= new female();
		p.smell();
		
	}
}


interface perfume
{
	public void smell();
}

class person
{
	protected int height;
	public int getheight(int height)
	{
		this.height=height;
		return height;
	}
}

class male extends person implements perfume
{
	public void name()
	{
		System.out.println("Male Name");
	}
	public void height()
	{
		System.out.println(super.getheight(6));
		
	}
	
	public void smell()
	{
		System.out.println("Good");
	}
}

class female extends person implements perfume
{
	public void name()
	{
		System.out.println("Female Name");
	}
	
	public void height()
	{
		System.out.println(super.getheight(5));
	}
	
	public void smell()
	{
		System.out.println("BAD");
	}
}