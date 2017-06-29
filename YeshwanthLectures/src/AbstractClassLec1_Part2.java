/*
 * The Pupose of the below program is to demostrate that
 * for ABSTRACT CLASS ONE CANNOT CREATE OBJECT
 * Which means in the below program
 * 
 * image i1= new image();  WILL GIVE ERROR.
 * 
 * The Derived class of an ABSTRACT CLASS, should define the ASBTRACT METHOD corersponding
 * to the ABSTRACT CLASS.
 * 
 * In the below example "JPEGClass" & "GIFclass" are the Derived classes of the Abstract class image
 * & print is the abstract method corresponding to abstract class image, Hence "JPEGClass" & "GIFclass" 
 * should have function definition for "print" method.
 * 
 */
public class AbstractClassLec1_Part2 
{
	public static void main(String[] args) 
	{
		//create is a static function, hence calling in the below way.
		image i1= image.create("test.jpg");
		i1.print();
		image i2=image.create("test.gif");
		i2.print();
	}
}

abstract class image
{
	protected String filename;
	
	public void setImage(String f)
	{
		this.filename=f;
	}
	//Return type is of type IMAGE class.--POINT TO BE NOTED
	public static image create(String fi)
	{
		if(fi.toLowerCase().contains(".jpg"))
		{
			return new JPEGClass(fi);
		}
		else if(fi.toLowerCase().contains(".gif"))
		{
			return new GIFclass(fi);
		}
		return null;
	}
	
	abstract public void print();
}

class JPEGClass extends image
{
	JPEGClass(String file)
	{
		setImage(file);
	}
	
	public void print()
	{
		System.out.println("Printing JPEG image"+super.filename);
	}
}

class GIFclass extends image
{
	GIFclass(String file)
	{
		setImage(file);
	}
	
	public void print()
	{
		System.out.println("Printing GIF file"+super.filename);
	}
}