package castingStudy;

public class UpCasting 
{

	public static void main(String[] args) 
	{
		Father F = new Father();
		F.City();
		F.State();
		
		System.out.println("++++++++++++++++++++");
		
		Son S = new Son();
		S.City();
		S.State();
		S.Education();
		
		System.out.println("++++++++++++++++++++");
		
		Father F2 = new Son(); //Creating Obj of subclass and giving superclass reference 
		F2.City();             //In this only common methods are called in fathers class
		F2.State();            //Sub class proerties are not Upcast
	
		

	}

}
