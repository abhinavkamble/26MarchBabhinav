package methods;

public class Non_Static_Method_Call_ {

	public static void main(String[] args)
	{
		//syntax class name obj name =new class name 
		
		Non_Static_Method_Call_ NSMC= new Non_Static_Method_Call_(); //Object Creation 
		NSMC.test();     //method Call from same Class 
		NSMC.test2();
		
		//class name is also changed for calling from another class 
		
		Non_Static_Study nss=new Non_Static_Study(); //Object Creation 
		nss.round();     //method Call from Another Class
		nss.round2();

	}
	
	public void test()
	{
		System.out.println("this is test for non static call from same class ");
	}

	public void test2()
	{
		System.out.println("this is test2 for non ststic call from same class");
	}
}
