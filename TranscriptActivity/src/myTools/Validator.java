package myTools;
import java.util.Scanner;

public class Validator {
	
	public static String getString(Scanner sc, String prompt)
	{
	    System.out.print(prompt);
	    String s = sc.nextLine();  // read user entry
//	    sc.nextLine();  // discard any other data entered on the line
	    return s;
	}
	
	public static String getStringGrade(Scanner sc, String prompt)
	{
	    String i = "";
	    boolean isValid = false;
	    while (isValid == false)
	    {
	    	i = getString(sc, prompt);
	    	
	    	switch (i)
	    	{
	    	case "A": isValid = true; break;
	    	case "B": isValid = true; break;
	    	case "C": isValid = true; break;
	    	case "D": isValid = true; break;
	    	case "F": isValid = true; break;
	    	default: isValid = false; System.out.println("Please enter a valid grade."); break;
	    	}	
	   	}
	    return i;
	}

	public static int getInt(Scanner sc, String prompt)
	{
	    int i = 0;
	    boolean isValid = false;
	    while (isValid == false)
	    {
	        System.out.print(prompt);
	        if (sc.hasNextLine())
	        {
	            i = Integer.parseInt(sc.nextLine());
	            isValid = true;
	        }
	        else
	        {
	            System.out.println("Error! Invalid integer value. Try again.");
	        }
	        //sc.nextLine();  // discard any other data entered on the line
	    }
	    return i;
	}

	public static int getInt(Scanner sc, String prompt, int min, int max)
	{
	    int i = 0;
	    boolean isValid = false;
	    while (isValid == false)
	    {
	        i = getInt(sc, prompt);
	        if (i > max)
	            System.out.println("Error! Course cannot be more than " + max + " credits.");
	        else if (i < min)
	        	System.out.println("Error! Course must be of at least " + min + " credit.");
	        else
	            isValid = true;
	    }
	    return i;
	}

	public static double getDouble(Scanner sc, String prompt)
	{
	    double d = 0;
	    boolean isValid = false;
	    while (isValid == false)
	    {
	        System.out.print(prompt);
	        if (sc.hasNextDouble())
	        {
	            d = sc.nextDouble();
	            isValid = true;
	        }
	        else
	        {
	            System.out.println("Error! Invalid decimal value. Try again.");
	        }
	        sc.nextLine();  // discard any other data entered on the line
	    }
	    return d;
	}

	public static double getDouble(Scanner sc, String prompt, double min, double max)
	{
	    double d = 0;
	    boolean isValid = false;
	    while (isValid == false)
	    {
	        d = getDouble(sc, prompt);
	        if (d > max)
	            System.out.println(
	                "Error! Number must be less than " + max + ".");
	        else if (d < min)
	            System.out.println(
	                    "Error! Number must be greater than " + min + ".");
	        else
	            isValid = true;
	    }
	    return d;
	}

}
