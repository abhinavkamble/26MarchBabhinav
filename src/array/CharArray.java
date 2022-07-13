package array;

public class CharArray 
{

	public static void main(String[] args) 
	{
		//Detailed Execution of Array 
		//1.Array Declearation 
		char Div[] = new char[6];  //here 6 is length or capacity is decided here which is fixed
		
		//2.Array Initialisation---providing value to crated blocks (6)
		Div[0]='A';
		Div[1]='B';
		Div[2]='C';
		Div[3]='D';
		Div[4]='E';
		Div[5]='F';
		
		//Usage ---printout the statement
		
		System.out.println(Div[0]);
		System.out.println(Div[1]);
		System.out.println(Div[2]);
		System.out.println(Div[3]);
		System.out.println(Div[4]);
		System.out.println(Div[5]);
		
		System.out.println("==========================");
		System.out.println("Static Coding");
		
		
		//using Static Coding ---value is fix
		for(int i=0;i<=5;i++)
		{
			System.out.println(Div[i]);
		}
		
		System.out.println("==========================");
		System.out.println("Dynamic Coding");
		
		
		//using Dynamic Coding ---value Changes with size changes
		for(int i=0;i<=Div.length-1;i++)
		{
			System.out.println(Div[i]);
		}
		
		System.out.println("==========================");
		System.out.println("Dynamic Coding in reverse order");
		
		
		//using Dynamic Coding ---value Changes with size changes
		for(int i=Div.length-1;i>=0;i--)
		{
			System.out.println(Div[i]);
		}
		
		System.out.println("==========================");
		System.out.println("Combine declearation and Initiation");
		
		char Alpha[] = {'P','Q','R','S','T','U','V'};
		
		for (int i=0;i<=Alpha.length-1;i++)
		{
			System.out.println(Alpha[i]);
		}
		
		
		System.out.println("==========================");
		System.out.println("Combine declearation and Initiation in Reverse order");
		for (int i=Alpha.length-1;i>=0;i--)
		{
			System.out.println(Alpha[i]);
		}
		
		
		
		
		

	}

}
