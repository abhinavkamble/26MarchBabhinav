package array;

public class FloatArray 
{

	public static void main(String[] args) 
	{
		// With using new keyword 
		//method declearation
		float[] percentage = new float[5];
		
		//method initialisation
		
		percentage[0]=36.52f;
		percentage[1]=62.36f;
		percentage[2]=85.12f;
		percentage[3]=45.95f;
		percentage[4]=80.00f;
		
		//usage
		for (int a=0;a<=percentage.length-1;a++)
		{
			System.out.println(percentage[a]);
		}
		
		System.out.println("=============================");
		
		// Without using new keyword 
		float[] per= {45.69f,63.53f,69.65f,89.65f,75.25f};
		
		for (int b=0;b<=per.length-1;b++)
		{
			System.out.println(per[b]);
		}
		
		
		
		
				

	}

}
