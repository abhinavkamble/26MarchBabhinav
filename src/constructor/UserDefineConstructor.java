package constructor;

public class UserDefineConstructor 
{
	int p; //variable Declearation on public enviroment
	int q; //variable Declearation on public enviroment
	
	public UserDefineConstructor()
	{
		
		
		System.out.println("Hi this is user define constructor is running"); 
		//here we can put value for Veriables which can apply to no of operations will
		p=500;
		q=1200;
		
	}
	public void Addition()
	{
		int sum=p+q; 
	    System.out.println("Sum is          -->"+sum);
	}
	public void Add()
	{
		int sum=p+q;
		System.out.println("Addition"+sum);
	}
	
	public void Substraction()
	{
		int sub=p-q;
		System.out.println("Substraction is -->"+sub);
	}

	public static void main(String[] args)
	{
		UserDefineConstructor UD = new UserDefineConstructor(); // Object Creation for Same Class
	
		UD.Addition();	    // Method calling 
		UD.Substraction(); // Method Calling
		UD.Addition();
		
		Sample S=new Sample();   //Object Creation from Another Class
		S.Multiplication();     //Method Calling
		S.Division();          //Method Calling

		System.out.println("this is github");
	}
	
	
	
}
