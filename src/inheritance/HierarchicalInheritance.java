package inheritance;

public class HierarchicalInheritance {

	public static void main(String[] args) 
	{
		//object creation for parents
		Parents P =new Parents();
		P.Strictness();
		Parents.Love();
		
		//obj creation for child1 and calling Child1 call and Parent class methods
		Child1 C1 = new Child1();
		C1.White();
		Child1.Short();
		
		C1.Strictness();
		Child1.Love();
		
		//obj creation for child2 and calling Child2 call and Parent class methods
		Child2 C2 =new Child2();
		C2.Black();
		Child2.Tall();
		
		C2.Strictness();
		Child2.Love();

	}
	

}
