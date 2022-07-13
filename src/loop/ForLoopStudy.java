package loop;

public class ForLoopStudy {

	public static void main(String[] args) 
	{
		// print abhinav name 5 times
		
		System.out.println("===================");
		for(int a=1; a<=5;a++) 
		{
			System.out.println("abhinav");
		}
		System.out.println("===================");
		
		// print table of 15 in assending order
		
	    for (int b=15; b<=150;b=b+15)
	    {
	    	System.out.println(b);
	    }
	    System.out.println("===================");
	    
	    // print table of 15 in decending order
	    
	    for (int c=150;c>=15;c=c-15)
	    {
	    	System.out.println(c);
	    }
	    System.out.println("===================");
	     //print table of 8
	    
	    int p=8; int q=1;
	    for (q=1;q<=10;q++)
	    {
	    	System.out.println(p+"X"+q+"="+(p*q));
	    }	
		
	
		
	
	}

}
