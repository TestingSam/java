import java.util.Scanner;

public class ArraysLec1 
{
	public static void main(String[] args) 
	{
		int a[]=new int[10];
		for(int i=0;i<a.length;i++)
		{
			Scanner sc= new Scanner(System.in);
			a[i]=Integer.parseInt(sc.nextLine());
		}
		
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]);
		}
		
		//initializing Arrays
		int u[]={1,2,3,4};
		for(int k=0;k<u.length;k++)
		{
			System.out.println(u[k]);
		}
	}
}
