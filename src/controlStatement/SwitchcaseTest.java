package controlStatement;

public class SwitchcaseTest {

	public static void main(String[] args) {
		//Monday    -->First day of week
		//Tuesday   -->Second day of week
		//Wednesday -->Third day of week
		//Thirsday  -->Fourth day of week
		//Friday    -->Fifth day of week
		//Saturday  -->Sixth day of week
		//Sunday    -->Seventh day of week
		
		String day="Sunday";
		switch (day) 
		{
		case "Monday":System.out.println("First day of week");
		break;
		case "Tuesday":System.out.println("Second day of week");
		break;
		case "Wednesday":System.out.println("Third day of week");
		break;
		case "Thursday":System.out.println("Fourth day of week");
		break;
		case "Friday":System.out.println("Fifth day of week");
		break;
		case "Saturday":System.out.println("Sixth day of week");
		break;
		case "Sunday":System.out.println("Seventh day of week");
		break;
		

		default:System.out.println("Please enter valid day");
			break;
		}

	}

}
