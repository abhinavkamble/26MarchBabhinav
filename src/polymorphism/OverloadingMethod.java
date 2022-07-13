package polymorphism;

public class OverloadingMethod 
{
	public void Addition()
	{
		int a=25;
		int b=75;
		int sum=a+b;
		System.out.println("The Addition is "+sum);
	}
	
	public void Addition(int a,int b)
	{
		int sum=a+b;
		System.out.println("The New Addition is "+sum);
	}

	public static void main(String[] args) 
	{
		OverloadingMethod OM = new OverloadingMethod();
		OM.Addition();
		OM.Addition(150, 200);

	}

}
