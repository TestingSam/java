/*
 * 
 * The Pupose of the Below program is to Demonstrate, the Usage of FINALLY Block
 * Now this Finally Block is Optional
 * THe Code in the Finally Block Gets exected No matter what ever happens
 * Even If Break or Return Statement is present the Code in FINALLY Block gets executed
 * Only if System.exit Statement is present the code in the FINALLY Block will not Execute
 */
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ExceptionHandlingLec2_Part2 
{
	public static void main(String[] args)
	{
		FileWriter f=null;
		try
		{
			f= new FileWriter("C:/a.txt");
			f.write("Samir is a Good Boy\n");
		}
		catch(IOException e)
		{
			System.out.println("IO Exception Occured");
		}
		catch(Exception e)
		{
			System.out.println("Unknown Exception");
		}
		finally
		{
			if(f!=null)
			{
				try
				{
					f.close();
				}
				catch(Exception e)
				{
					System.out.println("Exception Occured, WHen Closing the File");
				}
			}
			else
			{
				System.out.println("No Need of Closing File, as File Never Opened");
			}
		}
	}
}
