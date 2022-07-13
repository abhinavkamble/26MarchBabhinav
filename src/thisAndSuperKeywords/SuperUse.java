package thisAndSuperKeywords;

public class SuperUse extends sample
{
	int a=1555;

	public static void main(String[] args) 
	{
		SuperUse SU = new SuperUse();
		SU.test();

	}
	public void test()
	{
		int a=15;
		System.out.println("The Value of A is "+a);
		System.out.println("The Value of A is "+super.a);
		System.out.println("The Value of A is "+this.a);
	}

}
