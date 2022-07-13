package logicalProgramsClass;

import java.util.Scanner;

public class UserinputSum {

	public static void main(String[] args) 
	{
		Scanner Sc = new Scanner(System.in) ;
		System.out.println("Enter THe First Number==>");
		int a = Sc.nextInt();
		
		System.out.println("Enter THe Second Number==>");
		int b = Sc.nextInt();
		
		int sum = a+b;
		System.out.println("Sum is==>"+sum);

	}

}
