/*
 * The Purpose of the Below program is to Demostrate,the functionality 
 * of Catching an Exception when it is thrown through Try...Catch..
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandlingLec1_Part2 
{
	public static void main(String[] args) 
	{
		int i;
		BufferedReader b;
		b=new BufferedReader(new InputStreamReader(System.in));
		while(true)
		{
			try
			{
				i=Integer.parseInt(b.readLine());
				break;
			}
			catch(NumberFormatException e1)
			{
				System.out.println("Number Format Exception has Occured");
			}
			catch(IOException e2)
			{
				System.out.println("IO Exception has Occured");
			}
		}
		System.out.println(i);
	}
}
