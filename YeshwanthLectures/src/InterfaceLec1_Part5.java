/*
 * 
 * The Below program is to demonstrate the interface IHERITANCE
 */
public class InterfaceLec1_Part5 
{
	public static void main(String[] args) 
	{
		two t;
		t= new genclass();
		System.out.println(t.getnumber(12));
		System.out.println(t.getstring("Samir"));
	}
}



interface one
{
	public int getnumber(int x);
}

interface two extends one
{
	public String getstring(String s);
}

class genclass implements two
{
	public String sample;
	public int number;
	public String getstring(String s1)
	{
		sample=s1;
		return sample;
	}
	
	public int getnumber(int num)
	{
		number=num;
		return number;
	}

}