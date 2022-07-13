package polymorphism;

public class RunTimePolymorphism 
{

	public static void main(String[] args) 
	{
		ClassA A = new ClassA();
		ClassB B = new ClassB();
		
	
		A.test();
		B.test();
		
		ClassA.test1();
		ClassB.test1();
		
		

	}

}
