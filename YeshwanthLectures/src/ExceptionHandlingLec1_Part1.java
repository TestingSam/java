/*
 * The Intention of below program is to demostrate, the happenings
 * If an Exception is not handled, In the below program, if a number is
 * Entered, that gets converted, but if a String is entered as Input in the 
 * Console, that will not get Converted, In such cases the below exception Occurs
 * abc
Exception in thread "main" java.lang.NumberFormatException: For input string: "abc"
	at java.lang.NumberFormatException.forInputString(NumberFormatException.java:65)
	at java.lang.Integer.parseInt(Integer.java:492)
	at java.lang.Integer.parseInt(Integer.java:527)
	at ExceptionHandlingLec1_Part1.main(ExceptionHandlingLec1_Part1.java:11)
 * 
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionHandlingLec1_Part1 {

	public static void main(String[] args) throws Exception {
		int i;
		BufferedReader b;
		b= new BufferedReader(new InputStreamReader(System.in));
		i= Integer.parseInt(b.readLine());
		System.out.println(i);
	}

}
