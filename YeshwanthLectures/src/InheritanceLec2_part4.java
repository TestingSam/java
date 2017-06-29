/*
 * Once if a class is defined as FINAL, we cannot inherit the class
 * 
 */
public class InheritanceLec2_part4 {

	public static void main(String[] args) {

	}

}


final class base5
{
	protected int i=10;
	base5()
	{
		System.out.println("Value of i in base class"+i);
	}
}

class derived5 extends base5
{
	int i=20;
	derived5()
	{
		System.out.println("Value of i in derived class"+i);
	}
}