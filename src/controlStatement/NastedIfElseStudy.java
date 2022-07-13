package controlStatement;

public class NastedIfElseStudy 
{

	public static void main(String[] args) 
	{
		//if user id is correct -- enter passwoed
		//if password is correct --login successful
		//if password is wrong -- incorrect password
		//if user id is incorrect --invalid user

		String UserID="Test@123";
		int Pass=12345;
		if(UserID=="Test@123")
		{
			System.out.println("Enter Password");
			if(Pass==12345)                       //inner loop
			{
				System.out.println("Login Successful");
			}
			else
			{
				System.out.println("Incorrect Password");
			}
			
		}
		else
		{
			System.out.println("Invalid User");
		}
			
	}

}
