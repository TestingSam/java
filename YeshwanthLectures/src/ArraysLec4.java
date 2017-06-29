import java.util.Scanner;

public class ArraysLec4 {

	public static void main(String[] args) {
		//Concept of Jaggered Arrays
		
		int a[][]=new int[3][];
		a[0]=new int[4];
		a[1]=new int[3];
		a[2]=new int[2];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				Scanner sc= new Scanner(System.in);
				a[i][j]= Integer.parseInt(sc.nextLine());
			}
		}
		
		display(a);

	}
 public static void display(int b[][])
 {
	 for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.println(b[i][j]);
			}
		}
 }
}
