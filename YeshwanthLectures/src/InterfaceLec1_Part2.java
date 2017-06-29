/*
 * The purpose of below program is to demonstrate the concept of Inheritance and Interfaces
 */
public class InterfaceLec1_Part2 
{
	public static void main(String[] args) 
	{
		modal m;
		actor myself= new actor();
		//by forming the statement as below
		//the Object m can call the style function alone of actor class
		//Where as the Other functions are unavailable to object m
		m=myself;
		m.style();
		
		charecter ch;
		//By forming the below statement, 
		//Those Functions implemented for the interface charecter in actor class alone 
		//is available, other functions of actor class is not available to "Ch" variable
		ch=myself;
		ch.patriyotism();
		//For getting all the functions, below is the method.
		myself.name();
		myself.style();
		myself.patriyotism();
	}
}


interface charecter
{
	public void patriyotism();
}

class modal
{
	//protected String style;
	public void  style()
	{
		System.out.println("Modal.Style");
	}
}

/*
 * In the below actor class, the intention is to INHERIT the style function of Modal class
 * and Implement the charecter interface, there by qualities of modal and charecter are got in
 * actor class
 * 
 */
class actor extends modal implements charecter
{
	public void name()
	{
		System.out.println("actor.name");
	}
	
	public void style()
	{
		super.style();
		System.out.println("actor.style");
	}
	
	public void patriyotism()
	{
		System.out.println("Actor.patriyotism");
	}
}