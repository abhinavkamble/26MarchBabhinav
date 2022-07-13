package methods;

public class Static_Method_Call {

	public static void main(String[] args) 
	{
		
		Static_Study.Demo();
		Static_Study.demo2();
		sample();
		sample1();
		

	}

	public static void sample()
	{
		System.out.println("This is sample static method from same class");
	}
	public static void sample1()
	{
		System.out.println("This is sample1 static method from same Class ");
	}
}
