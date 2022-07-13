package abstractStudy;

public class ConcreteClass extends AbstractClass
{
	public void demo()
	{
		System.out.println("this is Concrete Class Method");
	}
	@Override
	public void Sample3() 
	{
		System.out.println("Sample3 metod from abstract class now completed in CC");  //body 
	}
	

	public static void main(String[] args) 
	{
		ConcreteClass CC = new ConcreteClass();
		CC.Sample1();
		AbstractClass.Sample2();
		CC.Sample3();
		CC.demo();
		AbstractClass.Add();
		

	}

}
