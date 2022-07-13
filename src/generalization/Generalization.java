package generalization;

public class Generalization {

	public static void main(String[] args) 
	{
		BCCI B = new BCCI();
		B.President();
		B.Chairman();
		B.Member();
		
		System.out.println("++++++++++++++++++++++");
		
		PCB P = new PCB ();
		P.President();
		P.Chairman();
		P.Member();

		System.out.println("++++++++++++++++++++++");


	}

}
