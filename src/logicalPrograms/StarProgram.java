package logicalPrograms;

public class StarProgram 
{

	public static void main(String[] args) 
	{
		for (int i=1;i<=10;i++)
		{
			for (int k=1;k<=i;k++)
			{
				System.out.print("*  ");
			}
			System.out.println(" ");
		}
		
		System.out.println("==============================");
		
		for(int p=10;p>=1;p--)
		{
			for(int q=1;q<=p;q++)
			{
				System.out.print("*  ");
			}
			System.out.println("");
		}
		
		System.out.println("==============================");
		
		for(int a=0;a<=10;a++)
		{
			for (int b=10;b>=a;b--)
			{
				System.out.print(" ");
			}
			for(int c=0;c<=a;c++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
		System.out.println("==============================");
		for(int a=10;a>=0;a--)
		{
			for (int b=0;b<=a;b++)
			{
				System.out.print(" ");
			}
			for(int c=10;c>=a;c--)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		

	}

}
