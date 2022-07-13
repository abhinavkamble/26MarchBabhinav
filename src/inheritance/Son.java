package inheritance;

public class Son extends Father
{
	public void Bike()
	{
		System.out.println("Son Bike");
	}
	
	public static void Mobile()
	{
		System.out.println("Son mobile");
	}
	
	public static void main(String[] args) 
	{
		Son S = new Son();
		S.Bike();
		S.car();
		S.money();
		
		Grandfather.pawer();
		Father.Home();
		Mobile();
		
	}

}
