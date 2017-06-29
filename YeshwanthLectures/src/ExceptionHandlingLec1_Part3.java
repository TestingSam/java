/*
 * 
 * The Purpose of the below program is to demostrate, the "GRACEFUL EXIT"
 * of a program, when an Exception has Occured
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandlingLec1_Part3 
{
	public static void main(String[] args) 
	{
		int i;
		BufferedReader b;
		
		b= new BufferedReader(new InputStreamReader(System.in));
		try
		{
			i=Integer.parseInt(b.readLine());
		}
		catch(NumberFormatException e1)
		{
			System.out.println("Number Format Exception");
		}
		catch(IOException e2)
		{
			System.out.println("IOException has Occured");
		}
	}
}
