package starPattern;

public class Eg8 {

	public static void main(String[] args) 
	{
		//    * 
		//   * * 
		//  * * * 
		// * * * *
		//* * * * *
		
		//row-5 col-9 star-1 space-4
		int space=4;
		int star =1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=star;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
			space--;
			star=star+1;
		}
	}

}
