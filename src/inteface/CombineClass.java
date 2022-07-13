package inteface;

public class CombineClass implements Demo2Interface
{

	public static void main(String[] args) 
	{
		CombineClass CC = new CombineClass();
		CC.sample1();
		CC.sample2();
		CC.sample3();
		CC.sample4();
	
		System.out.println("Value of a is"+CombineClass.a);
		

	}

	//by using extend keyword properties of one interface class are aquired to another interface class
	//then using implement keyword bothe are called at a time in another class for complete it and calling
	
	@Override
	public void sample1() 
	{
		System.out.println("this is incomplete Sample1 method from interface class extended to interface2 class");
		
	}

	@Override
	public void sample2() {
		System.out.println("this is incomplete Sample2 method from interface class extended to interface2 class");
		
	}

	@Override
	public void sample3() {
		System.out.println("this is incomplete Sample3 method from interface2 class");
		
	}

	@Override
	public void sample4() {
		System.out.println("this is incomplete Sample3 method from interface2 class");
		
	}

}
