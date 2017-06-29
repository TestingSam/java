import java.util.Scanner;

public class ArraysLec3_Part2 
{
	public static void main(String[] args) 
	{
		//2D Arrays Creation
		//Fetching Values
		//Passing
		//Returning
		int d[][]={{45,56},{34,67}};
		display(d);
		int a[][]= new int[2][2];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				Scanner sc= new Scanner(System.in);
				a[i][j]=Integer.parseInt(sc.nextLine());
			}
		}
		
		display(a);
		modify(a);
		display(a);
	}
	
	public static void display(int b[][])
	{
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				//Scanner sc= new Scanner(System.in);
				//a[i][j]=Integer.parseInt(sc.nextLine());
				System.out.println(b[i][j]);
			}
		}
	}
	
	public static void modify(int c[][])
	{
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				Scanner sc= new Scanner(System.in);
				c[i][j]=Integer.parseInt(sc.nextLine());
			}
		}
	}
}
