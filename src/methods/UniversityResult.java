package methods;

public class UniversityResult 
{

	public static void main(String[] args)
	{
		UniversityResult UR =new UniversityResult();//Calling Method Without Parameter for creating obj
		UR.studentinfo(); // without parameter
		UniversityResult.STinfo();
		UniversityResult.STinfo("Dinesh",2019,5656,78.23,'A',true);
	
		UR.StudentInfo("Manish",2020,786,65.63,'B',true,(short)256);   //
		UR.StudentInfo("Shekhar",2018,6523,69.69,'B',true,(short)564); //
		UR.StudentInfo("Ajay",2222,5555,65.23, 'B', true,(short) 548);
		UR.StudentInfo("mukesh",2023,23,32.32,'c', false,(short)253);
		

	}
	// Without Paramater
	public void studentinfo()
	{
		String Name="Abhinav Kamble";
		int Year=2019;
		int Rollno=69;
		float Percentage=70.15f;
		char Grade='A';
		boolean Result=true; // pass-true,Fail-false
		
		System.out.println("===============================");		
		System.out.println("Student NAme-->   "+Name);
		System.out.println("Exam Year   -->   "+Year);
		System.out.println("Roll No     -->   "+Rollno);
		System.out.println("Percentage  -->   "+Percentage);
		System.out.println("Grade       -->   "+Grade);
		System.out.println("Result      -->   "+Result);
		System.out.println("===============================");

	}
	
	//With Paramater
	public void StudentInfo(String Name,int year,int RollNo,double Percentage,char Grade,boolean result,short weight)
	{
		System.out.println("===============================");		
		System.out.println("Student NAme-->   "+Name);
		System.out.println("Exam Year   -->   "+year);
		System.out.println("Roll No     -->   "+RollNo);
		System.out.println("Percentage  -->   "+Percentage);
		System.out.println("Grade       -->   "+Grade);
		System.out.println("Result      -->   "+result);
		System.out.println("my height is -->  "+weight);
		System.out.println("===============================");	
	}
	
	//Static Method Without Parameter
	public static void STinfo()
	{
		String Name="Dinesh";
		int Year=20;
		int Rollno=3232;
		float Percentage=85.76f;
		char Grade='A';
		boolean Result=true; // pass-true
		
		System.out.println("===============================");		
		System.out.println("Student NAme-->   "+Name);
		System.out.println("Exam Year   -->   "+Year);
		System.out.println("Roll No     -->   "+Rollno);
		System.out.println("Percentage  -->   "+Percentage);
		System.out.println("Grade       -->   "+Grade);
		System.out.println("Result      -->   "+Result);
		System.out.println("===============================");
	}
	//Stativ Method With Paramater
		public static void STinfo(String Name,int year,int RollNo,double Percentage,char Grade,boolean result)
		{
			System.out.println("===============================");		
			System.out.println("Student NAme-->   "+Name);
			System.out.println("Exam Year   -->   "+year);
			System.out.println("Roll No     -->   "+RollNo);
			System.out.println("Percentage  -->   "+Percentage);
			System.out.println("Grade       -->   "+Grade);
			System.out.println("Result      -->   "+result);
			System.out.println("===============================");
			
		}	


}
