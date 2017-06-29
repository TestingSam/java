import java.util.Scanner;

public class ArraysLec2 
{
	public static void main(String[] args) 
	{
		//Allocating an Array
		int a[]= new int[10];
		for(int i=0;i<a.length;i++)
		{
			Scanner sc= new Scanner(System.in);
			a[i]=Integer.parseInt(sc.nextLine());
		}
	
		int b[];
		//a[] is the array
		//The Variable "a" will contain the starting address of array a[]
		//Now in the below statement we are actually assigning the starting address 
		// of array "a" to array "b"
		//so that array "b" will also point to starting address of array a[] 
		b=a;
		for(int j=0;j<b.length;j++)
		{
			System.out.println(b[j]);
		}
		
		//Now Lets try to Mofify the Size of array a[] and see if the contents
		//Of array a[] prevail.
		
		a= new int[13];
		for(int j=0;j<a.length;j++)
		{
			try
			{
				//The Contents of a did not prevail Once Resized
				//Hence assigning the contents of  b to a  
				a[j]=b[j];
				System.out.println(a[j]);
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
			}
		}
		
	}
}
