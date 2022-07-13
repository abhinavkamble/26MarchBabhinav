package logicalPrograms;

public class FabonicciSeries {

	public static void main(String[] args) 
	{
		// Fabonici series-----> 0+1=1, 1+1=2, 2+1=3, 2+3=5, 2+5=7 .......
		int a=0;
		int b=1;
		
		for(int i=1;i<=12;i++)
		{
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
			
			
		}

	}

}
