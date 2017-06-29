/*
 * The Purpose of the Below program is demonstrate Mutiple Cathc statements
 * Now, In the below program, The Classes "NumberFormatException" & "ArithmeticException"
 * are the derived classes from base class "Exception", So when mentioning the Exception
 * Information in Catch block, if we first mention the base class, which is "Exception" class
 * all the Exceptions would be caught at that Catch block containing "Exception" class, 
 * Hence this base class "Exception" Needs to be mentioned at the LAST. 
 */
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExceptionHandlingLec2_Part1 
{
	public static void main(String[] args) 
	{
		int i,j,k;
		BufferedReader b;
		b= new BufferedReader(new InputStreamReader(System.in));
		try
		{
			i=Integer.parseInt(b.readLine());
			j=Integer.parseInt(b.readLine());
			k=i/j;
			System.out.println(k);
		}
		catch(NumberFormatException e1)
		{
			System.out.println("Number Format Exception Occred");
		}
		catch(ArithmeticException e2)
		{
			System.out.println("Arthimetic Exception Occured");
		}
		catch(Exception e3)
		{
			System.out.println("Unknown Exception");
		}
	}
}
