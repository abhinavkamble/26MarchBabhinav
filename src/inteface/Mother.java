package inteface;

public interface Mother 
{
	void nature();
	default void love()
	{
		System.out.println("Mothers Love");
	}
	static void kind()
	{
		System.out.println("Mothers Kindness");
	}
	default void exp()
	{
		System.out.println("Mothers Exp");
	}
	static void business() //using Static when method name is same
	{
		System.out.println("Mothers Business");
	}

}
