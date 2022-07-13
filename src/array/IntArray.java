package array;

public class IntArray 
{

	public static void main(String[] args) 
	{
		//declearation 
		int Marks[] = new int[7];
		//initialisation 
		Marks[0]=40;
		Marks[1]=38;
		Marks[2]=55;
		Marks[3]=62;
		Marks[4]=52;
		Marks[5]=70;
		Marks[6]=75;
		//usage
		System.out.println(Marks[0]);
		System.out.println(Marks[1]);
		System.out.println(Marks[2]);
		System.out.println(Marks[3]);
		System.out.println(Marks[4]);
		System.out.println(Marks[5]);
		System.out.println(Marks[6]);
		
		System.out.println("++==++==++==++==++==++==++==++");
		System.out.println("combine declearation and initiation");
		
		int mark1[]= {21,11,31,51,41,71};
		
		for (int i=0;i<=mark1.length-1;i++)
		{
			System.out.println(mark1[i]);
		}
		
		System.out.println("++==++==++==++==++==++==++==++");
		System.out.println("combine declearation and initiation in reverse Order");
		for(int i=mark1.length-1;i>=0;i--)
		{
			System.out.println(mark1[i]);
		}
		
		
		
		
		
		
		

	}

}
