package variableTypes;


public class GlobleAndLocalVariable {

	//2 Types of globle variable Static and non static
	
	int a=35;        //globle non static veriable
	static int b=75; //globle static Veriable
	int sum=a+b;
	
	public static void main(String[] args) 
	
	{
		GlobleAndLocalVariable GLV = new GlobleAndLocalVariable();           //Obj Creation
		
		System.out.println("The Value of A is  -"+GLV.a);                    //Calling Non Static Variable
		System.out.println("The Value of B is  -"+b);                        //Calling Static Variable
		System.out.println("sum is---->"+GLV.sum);                             
		                                                                     //Simply u can write +b
		
		Test T=new Test();
		System.out.println("Value of X is -->"+T.X);
		System.out.println("Value of Y is -->"+Test.Y);

				
		GLV.Mltiplication();
		GLV.Addition();
		
		int div=b/GLV.a;
		System.out.println("Division is -->"+div);
		
		int mul=b/(T.X);
		System.out.println("Multiplication is -->"+mul);
		
		int sub=b-GLV.a;
		System.out.println("Substraction is -->"+sub);
		
		int add=Test.Y+GLV.a;
		System.out.println("Addition is -->"+add);

	}
	public void Mltiplication()
	{
		int mul=a*b;
		System.out.println("The Multiplication is   -->"+mul);
	}
	public void Addition()
	{
		int Add=a+b;
		System.out.println("Addition is -->"+Add);
	}

}
