package AccessSpecifier;

public class Velocity {

	public static void main(String[] args) 
	{
		Velocity V = new Velocity();
		V.Sample1();  //Calling private method in main method in same class
		V.Sample2();  //Calling Default method in main method in same class
		V.Sample3();  //Calling Protected method in main method in same class
		V.Sample4();  //Calling public method in main method in same class
	}
	
	private void Sample1()
	{
		System.out.println("Iam private method of Sample1");
	}
	
	void Sample2()
	{
		System.out.println("Iam Default method of Sample2");
	}
	
	protected  void Sample3()
	{
		System.out.println("Iam Protected method of Sample3");
	}
	
	public void Sample4()
	{
		System.out.println("Iam public method of Sample4");
	}
	

}
