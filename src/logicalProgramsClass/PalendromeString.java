package logicalProgramsClass;

import java.util.Scanner;

public class PalendromeString {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name==>");
		String a = sc.next();
		String b ="";
		
		for (int i=a.length()-1;i>=0;i--)
		{
			b=b+a.charAt(i);
		}
		System.out.println("Orignal Name==>"+a);
		System.out.println("Reverse Name==>"+b);

		if(a.equals(b))
			System.out.println("Name is Palendrome");
		else
		    System.out.println("Name is Not Palendrome");
	}

}
