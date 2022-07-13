package finalKeywordStudy;

public class FinalForVariable 
{
	int a=40;
	final int p=50;
	

	public static void main(String[] args) 
	{
		FinalForVariable FV = new FinalForVariable();
		FV.Addition();
		

	}
	public void Addition()
	{
		a=a+p;
		System.out.println("Value of a is "+a);
		
		//p=p+20;
		//System.out.println("value of b is "+p);
	}

}
