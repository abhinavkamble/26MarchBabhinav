package array;

public class SplitMethod 
{

	public static void main(String[] args)
	{
		String Song = "Sa Re Ga Ma Pa Dha Ni Sa";
		
		String[] Result =Song.split(" ");//this space denotes from where you want to split 
		
		//usage
		for(int i=0;i<=Result.length-1;i++)
		{
			System.out.println(Result[i]);
		}
		
		System.out.println("++==++==++==++==++==++==++==++");
		System.out.println("combine declearation and initiation reverse order");
		for(int i=Result.length-1;i>=0;i--)
		{
			System.out.println(Result[i]);
		}
		
		
		
		
		
		String name = "manish shekhar prasad abhinav dinesh";
		
		String[] Output=name.split(" ");
		
		for (int z=0;z<=Output.length-1;z++)
		{
			System.out.println(Output[z]);
		}

	}

}
