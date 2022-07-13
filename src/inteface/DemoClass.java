package inteface;

public class DemoClass implements DemoInteface
{

	public static void main(String[] args) 
	{
		DemoClass DC = new DemoClass();
		DC.sample1();
		DC.sample2();

	}

	//these two methods are are overridden from interface class 
	
	@Override
	public void sample1() 
	{
		System.out.println("this is incomplete Sample1 method from interface class");
		
	}

	@Override
	public void sample2() 
	{
		System.out.println("this is incomplete Sample2 method from interface class");
		
	}

}
