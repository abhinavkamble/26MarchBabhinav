package inteface;

public class UseMultipleInheritance implements Father,Mother
{

	public static void main(String[] args) 
	{
		UseMultipleInheritance UM = new UseMultipleInheritance();
		UM.Bike(); //Default calling using obj creation (Diff method name in father and mother)
		UM.Car();  //incomplete mothod calling
		UM.love(); //Default calling using obj creation (Diff method name in father and mother)
		UM.nature(); //incomplete mothod calling
		
		Father.Home();  // Static calling from interface (Diff method name in father and mother) by simple method calling
		Mother.kind();  //Static calling from interface (Diff method name in father and mother) by simple method calling
		
		UM.exp(); //Default calling using obj creation (Same method name in father and mother)
		
		Father.business();  //Static calling from interface (Same method name in father and mother) by simple method calling
		Mother.business();  //Static calling from interface (Same method name in father and mother) by simple method calling
		
		
	}
    // These to methods are incomplete in father & mother interface mondatory to override for giving defination
	// Calling is done by obj creation 
	@Override
	public void nature() 
	{
		System.out.println("this is incomplete Car method from Father class");
		
	}
	@Override
	public void Car() 
	{
		System.out.println("this is incomplete Nature method from Mother class");
		
	}
	
    //Default method (Same method name in father and mother)Mondatory to override for deciding from which class mothod name u want to call
	//it is done using super keyword and call by using obj creation  
	@Override
	public void exp() 
	{
		Father.super.exp();
		Mother.super.exp();
	}

}
