package controlStatement;

public class SwitchcaseTest1 {

	public static void main(String[] args) {
		//A-->You Are In Distingtion
		//B-->You ARe In First Class
		//c-->You Are In Second Class
		//d-->You Are In Third Class
		
		char grade='A';
		switch (grade)   //s+ctr+ Space
		{
		case 'A':System.out.println("You Are In Distingtion");
		break;
		case 'B':System.out.println("You ARe In First Class");
		break;
		case 'C':System.out.println("You Are In Second Class");
		break;
		case 'D':System.out.println("You Are In Third Class");
		break;

		default:System.out.println("You Are Failed");
			break;
		}
		
		

	}

}
