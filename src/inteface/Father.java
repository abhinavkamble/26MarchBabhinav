package inteface;

public interface Father 
{
	void Car();   //incomplete method from father class
	
	default void Bike()  //using default when method name is different 
	{
		System.out.println("Fathers Bike");
	}
	static void Home() //using static when method name is different
	{
		System.out.println("Fathers Home");
	}
	default void exp() //using default when method name is Same
	{
		System.out.println("Fathers Exp");
	}
	static void business() //using Static when method name is same
	{
		System.out.println("Fathers Business");
	}

}
