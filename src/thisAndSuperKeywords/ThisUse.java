package thisAndSuperKeywords;

public class ThisUse 
{
	int a=100; //Globle Variable
	

	public static void main(String[] args) 
	{
		ThisUse TU = new ThisUse();
		TU.addition();
		

	}
	public void addition()
	{
		int a=55;        //Local Veriable
		System.out.println("The value of A is "+a);
		System.out.println("The Value of A is "+this.a); // taken globle value of A using "this" keyword
	}

}
