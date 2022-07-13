package AccessSpecifier;

public class ForVelocity 
{

	public static void main(String[] args) 
	{
		Velocity V = new Velocity();
		//V.Sample();    //This is privet Class method hence we cant call This to another Class
		V.Sample2();   //This is Default method called from another class
		//V.Sample3();   //This is Protected method called from another class
		V.Sample4();   //This is public method called from another class 
		

	}

}
