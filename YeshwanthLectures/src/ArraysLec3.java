import java.util.Scanner;

public class ArraysLec3 
{
	public static void main(String[] args) 
	{
		//Passing the Array to a Function and Returning it
		int a[]= new int [5];
		
		for(int i=0;i<a.length;i++)
		{
			Scanner sc= new Scanner(System.in);
			a[i]=Integer.parseInt(sc.nextLine());
		}
		display(a);
		modify(a);
		display(a);
	}
	
	public static int display(int b[])
	{
		for(int j=0;j<b.length;j++)
		{
			System.out.println(b[j]);
		}
		
		return 0;
	}
	
	public static int[] modify(int c[])
	{
		for(int j=0;j<c.length;j++)
		{
			Scanner sc= new Scanner(System.in);
			c[j]=Integer.parseInt(sc.nextLine());
		}
		return c;
	}
}
