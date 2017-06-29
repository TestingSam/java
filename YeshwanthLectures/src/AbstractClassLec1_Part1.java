/*
 * The below program has been coded to demonstrate the following
 * 	At first, here circle & Rectangle are derived classes from shape class
 * 	Secondly, Being the derived class, the Objects of circle and Rectangle have the
 * 		ability to cast them to object corresponding to shape class, Using the below
 * 		Statement.
 * 		shape s1= new shape();		
		s1=r1;
		
		shape s2= c2;
	THIS METHODOLOGY IS CALLED UPCASTING
	Which means the Objects of DERIVED CLASS are BEING ASSIGNED TO BASED CLAS
	WHICH AGAIN MEANS, THE ADDRESS OF OBJECTS FOR DERIVED CLASS ARE BEING ASSIGNED TO
	BASE CLASS
	
	shape s[]={c1,c2,c3,r1,r2,r3};
	In the Above statement, we are creating an ARRAY OF BASE CLASS OBJECT and Storing 
	REFERENCES OR OBJECTS OR ADDRESS OF DERIVED CLASSES.
	
	Now in the Below program, the Base class Draw Method Does nothing and more over
	we are actually, overriding the function draw in Derived classes circle and Rectangle
	
	By assigning "shape s[]={c1,c2,c3,r1,r2,r3};" in this way, as Suitable Draw method will
	be called.
	
	We Can also make user to not able to create Objects to Shape class, by ABSTRACTING it.
	Please view next program to understand it
 */
public class AbstractClassLec1_Part1 
{
	public static void main(String[] args) 
	{
		circle c1,c2,c3;
		c1=new circle();
		c2=new circle();
		c3=new circle();
		rectangle r1,r2,r3;
		r1=new rectangle();
		r2=new rectangle();
		r3=new rectangle();
		shape s1= new shape();
		s1=c1;		
		s1=r1;
		shape s2= c2;
		shape s[]={c1,c2,c3,r1,r2,r3};
		for(int i=0;i<s.length;i++)
		{
			s[i].draw();
		}
		s1.draw();
		s2.draw();
	}
}


class shape
{
	public void draw()
	{
		
	}
}

class circle extends shape
{
	public void draw()
	{
		System.out.println("Drawing Circle");
	}
	public void display()
	{
		
	}
}

class rectangle extends shape
{
	public void draw()
	{
		System.out.println("Drawing Rectangle");
	}
}
 class triangle
 {
	 public void draw()
	 {
		 System.out.println("Drawing triangle");
	 }
 }
