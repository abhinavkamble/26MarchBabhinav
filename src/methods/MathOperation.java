package methods;

public class MathOperation
{

	public static void main(String[] args) 
	{
		MathOperation MO=new MathOperation();
		MO.addition();
		MathOperation.Substraction();
		
		Test1 T=new Test1();
		T.Muliplication();
		Test1.Division();

	}
	
	public void addition()
	{
		int x=55;
		int y=45;
		int sum=x+y;

		System.out.println("Addition is -->"+sum);
	}
	public static void Substraction()
	{
		int p=55;
		int q=45;
		int sub=p-q;
		System.out.println("Substraction is -->"+sub);
	}

}
