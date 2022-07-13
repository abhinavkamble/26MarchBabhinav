package logicalPrograms;

import java.util.Scanner;

public class PrimeNumber 
{
	private static Scanner sc;


	public static void main(String[] args) 
	{
		//check weather the number is prime or not
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		//We initialized the integer i value to 2, and (i <= Number/2) condition to terminate when the condition fails.

        //Within the for loop, there is an If statement to check whether the Number divisible by i is exactly equal to 0 or not. If the condition is True, then Count incremented, and then Break Statement executed.

        //Next, we used another If statement to check whether Count is Zero, and Number is Not equal to 1. If it is True then prime.
		
		int i, number, count = 0; 
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Integer : ");
		number = sc.nextInt();		
		
		for (i = 2; i <= number/2; i++)
		{
			if(number % i == 0)
		    {
				count++;
		        break;
		    }	
		}
		if(count == 0 && number != 1 )
		{
			System.out.println( number + " >> is a Prime Number");
		}
		else
		{
		   System.out.println(number + " >> is Not prime number");
		}
		

	}
}


