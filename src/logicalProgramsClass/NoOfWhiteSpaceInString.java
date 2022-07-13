package logicalProgramsClass;

public class NoOfWhiteSpaceInString {

	public static void main(String[] args) 
	{
		String a="A B H I N A V";
		int count = 0;
		
		for (int i=0;i<=a.length()-1;i++)
		{
			char b = a.charAt(i);
			if(b==' ')
			{
				count++;
			}
		}
		System.out.println("number of white spaces are in  "+a+"  are  "  +count);

	}

}
