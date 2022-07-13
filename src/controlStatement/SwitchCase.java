package controlStatement;

public class SwitchCase {

	public static void main(String[] args) 
	{
		//1-it is memory size for byte 
		//2-it is memory size for short
		//4-it is memory size for integer
		//8-it is memory size for long

		int memory=2;
		switch (memory) 
		{
		case 1:System.out.println("it is memory size for byte");
		break;
		
		case 2:System.out.println("it is memory size for short");
		break;	
		
		case 4:System.out.println("it is memory size for integer");
		break;
		
		case 8:System.out.println("it is memory size for long");
		break;
		
		default:System.out.println("please enter correct memory size");
		break;
		}
	}

}
