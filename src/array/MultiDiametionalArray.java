package array;

public class MultiDiametionalArray 
{

	public static void main(String[] args) 
	{
		System.out.println("with using new keyword");
		System.out.println();
		//using new keyword
		//Declearation
		int[][] marks = new int [3][3]; //it shows 3 rows and 3 column
		//initialisation
		marks [0][0]=31;
		marks [0][1]=32;
		marks [0][2]=33;
		marks [1][0]=51;
		marks [1][1]=52;
		marks [1][2]=53;
		marks [2][0]=71;
		marks [2][1]=72;
		marks [2][2]=73;
		//Usage
		for (int a=0;a<=2;a++)
		{
			for (int b=0;b<=2;b++)
			{
				System.out.print(marks[a][b]+"  ");
			}
			System.out.println("");
				
		}
		
		System.out.println("================================");
		System.out.println("without using new keyword");
		System.out.println();
		
		//without using new keyword
		//declearation and initialisation
		
		String[][] teams = {{"Gujrat","Laknow","Rajastan","Delhi"},{"Banglore","Punjab","Kolkata"},{"Hydrabad","Mumbai","Chennai"}};
		
		for (int x=0;x<=2;x++)
		{
			for (int y=0;y<=2;y++)
			{
				System.out.print(teams[x][y]+"  ");
			}
			System.out.println();
		}
		
		
		

	}

}
