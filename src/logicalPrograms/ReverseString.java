package logicalPrograms;

public class ReverseString {

	public static void main(String[] args) 
	{
		String name="Abhinav";
		for(int i=name.length()-1;i>=0;i--)
		{
			System.out.print(name.charAt(i)+" ");
		}
		System.out.println("");
		System.out.println("=========================");
		
		
		
		String string = "Dream big";
		String revSt ="  ";
		for(int j=string.length()-1;j>=0;j--)
		{
			revSt=revSt+string.charAt(j);
		}
		System.out.print(string);
		System.out.print(revSt);
		
		System.out.println(" ");
		System.out.println("=========================");
		
//		*
//		**
//		***
//		****
		
		for(int k=1;k<=4;k++)
		{
		 for(int l=4;l>=k;l--)
		 {
			 System.out.print("*");
		 }
		 System.out.println( );
		}
		
		System.out.println("");
		System.out.println("=========================");
		
		
		
	}

}
