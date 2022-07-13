package testAccessSpecifier;

import AccessSpecifier.Velocity;

public class Test extends Velocity 
{

	public static void main(String[] args) 
	{
		//we can only call public method from one pakage to another pakage
		Velocity V = new Velocity();
		V.Sample4(); // this is public method From Another pakage 
		
		//For calling public method and protected method in another pakage we have to use "Inheritance" 
		Test T = new Test();
		T.Sample3(); //calling protected method from another pakage
		T.Sample4(); //calling Public method from another pakage 
		
		
		//We cannot call "private method" and "Default method" in another pakage
		
	}

}
