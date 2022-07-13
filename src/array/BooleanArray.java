package array;

public class BooleanArray 
{

	public static void main(String[] args) 
	{
		// Without using new keyword
		boolean[] result =new boolean[4];
		
		result[0]=true;
		result[1]=false;
		result[2]=true;
		result[3]=false;
		
		
		for(int i=0;i<=result.length-1;i++)
		{
			System.out.println(result[i]);
		}
		
		System.out.println("======================");
		
		// with using new keyword
		boolean[] marks= {true,false,false,true};
		
		for(int x=0;x<=marks.length-1;x++)
		{
			System.out.println(marks[x]);
		}

	}

}
