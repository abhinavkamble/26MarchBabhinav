package abstractStudy;

public abstract class AbstractClass 
{
	static int a=20;
	static int b=15;
	static int sum=a+b;
	public static void Add() 
	{
		
		System.out.println("Addtion is "+sum);

	}
	public void Sample1()
	{
		System.out.println("This is Abstract class complete method");
	}
	 
	public static void Sample2()
	{
		System.out.println("This is Abstract class complete method 2");
	}
	
	public abstract void Sample3();  //This is Abstract class incomplete method
	

	public static void main(String[] args) 
	{
		Sample2();
		Add();
		
		
		

	}

}
