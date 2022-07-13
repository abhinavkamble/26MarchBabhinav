package logicalProgramsClass;

public class MultiPlicationWithoutOperator {

	public static void main(String[] args) 
	{
		//5*4
		//5+5+5+5
		int a = 5;
		int sum =0;
		for(int i=1;i<=4;i++)
		{
			sum= sum+a;
		}
		System.out.println("Multiplication is  "+sum);


	}

}
