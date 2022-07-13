package inheritance;

public class SingleLevelInheritance {

	public static void main(String[] args) 
	{
		
		Mother M =new Mother();  //object creation for superclass
		M.cooking();             //calling for Super class (for Non static)
		Mother.dancing();        //calling for superclass (for static)
		
		Daughter D =new Daughter();//object creation for sub class
		D.Cycle();                 //calling for sub class (for Non Static)
		Daughter.Saree();          //calling for sub class (for static)
        
		//calling superclass(Mother) object into sub class(Daughter)
		D.cooking();
		Daughter.dancing(); 
		
		
		//  No need to create obj for mother and calling method from mother class
		
	}

}
