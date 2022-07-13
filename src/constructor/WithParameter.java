package constructor;

public class WithParameter 
{
	//Veriable Declearation
	int p;
	int q;
	int r;
	

	public WithParameter(int a)
	{
	    p=a;	
	}
	public WithParameter(short x)
	{
		p=x;
	}
	
	public WithParameter(int a,int b,int c)
	{
		p=a;
		q=b;
		r=c;	
	}
	public void Multiplication()
	{
		int mul=p+q+r;
		System.out.println("Multiplication is    ==>"+mul);
	}
	
	public static void main(String[] args) 
	{
		
		WithParameter Wp1=new WithParameter(10);
		Wp1.Multiplication();
		
		WithParameter Wp4 = new WithParameter(5,6,10);
		Wp4.Multiplication();
		
		
		WithParameter Wp3=new WithParameter(100);
		Wp3.Multiplication();
		
		WithParameter Wp2=new WithParameter(10,15,5);
		Wp2.Multiplication();

	}
	
	
}
