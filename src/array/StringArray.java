package array;

public class StringArray 
{

	
	public static void main(String[] args) 
	{
		//1.Array Declearation 
		String Name[] = new String[4];
		
		//2.Array Initialisation
		Name[0]="I ";
		Name[1]="Love ";
		Name[2]="My";
		Name[3]="India";
		
		//3. Usage
		
		//System.out.println(Name[0]);
		//System.out.println(Name[1]);
		//System.out.println(Name[2]);
		//System.out.println(Name[3]);
		
		System.out.println("=========================");
		System.out.println("Using Dynamic Coding ");
		
		//Dynamic Coding 
		for(int i=0;i<=Name.length-1;i++)
		{
			System.out.println(Name[i]);
		}
		
		System.out.println("=========================");
		System.out.println("Using Dynamic Coding Reverse order");
		
		//Dynamic Coding 
		for(int i=Name.length-1;i>=0;i--)
		{
			System.out.println(Name[i]);
		}
		
		System.out.println("=========================");
		System.out.println("Using Dynamic Coding Combine Declear and initialisation");
		
		String Name1[]={"Abhinav","Manish","Dinesh","Shekhar","Prasad"};
		
		
		for(int i=0;i<=Name1.length-1;i++)
		{
			System.out.println(Name1[i]);
		}
		
		System.out.println("=========================");
		System.out.println("Using Dynamic Coding Combine Declear and initialisation in reverse order");
		
		for(int i=Name1.length-1;i>=0;i--)
		{
			System.out.println(Name1[i]);
		}
		
		
		
		
	}

}
