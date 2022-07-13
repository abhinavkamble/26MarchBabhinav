package inheritance;

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// Calling methods from grandfather class
		Grandfather GF= new Grandfather();
		GF.money();
		Grandfather.pawer();
		
		//Calling method from father Class
		Father F =new Father();
		F.car();
		Father.Home();
		F.money();               //Calling method from grandfather class (Non Static)
		Father.pawer();          //Calling Method from Grandfather Class (Static)

		//Calling method from Son Class
		Son S= new Son();
		S.Bike();
		Son.Mobile();
		
		S.money();         //Calling From Grandfather ClaSS using Son obj 
		Son.pawer();
		
		S.car();           //Calling From father ClaSS using Son obj
		Son.Home();
				
	}

}
