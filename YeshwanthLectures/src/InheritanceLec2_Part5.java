/*
 * Once if a function is defined as "FINAL", one cannot overide it 
 * in the derived class
 * 
 */
public class InheritanceLec2_Part5 {

	public static void main(String[] args) {
		

	}

}

class base6
{
	final public void display()
	{
		System.out.println("display function in base5 class");
	}
}
class derived6 extends base6
{
	public void display()
	{
		System.out.println("display function in derived6 class");
	}
}