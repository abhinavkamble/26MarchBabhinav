package loop;

public class DoWhileLoopStudy {

	public static void main(String[] args) 
	{
		//print Sachin 5 times
		System.out.println("===========================");
		System.out.println("Sachine name 5 Times");
		
		int a=1;
		do 
		{
			System.out.println("Sachin");
			a++;
		}
		while (a<=5);
		
		//print 26 table in assending order
		System.out.println("===========================");
		System.out.println("26 table in assending order");
		
		int p=26;
		do 
		{
			System.out.println(p);
			p=p+26;
		} 
		while (p<=260);
		
		//print 26 table in decending order
		System.out.println("===========================");
		System.out.println("26 table in decending order");
		
		int x=260;
		do 
		{
			System.out.println(x);
			x=x-26;
		} while (x>=26);
		
		System.out.println("===========================");
		

	}

}
