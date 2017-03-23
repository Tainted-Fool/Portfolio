
public class Unit3Quiz1 
{
	public static void main(String[] args) 
	{
		add(1, 3);
		add(5, 5);
		sub(5, 4);
		System.out.println(mult(3, 3));
		System.out.println(mult(9));
		System.out.println(div(8.3, 2.6));
		System.out.println(div(6.3));
	}

	public static void add(int a, int b)
	{
		int num = a + b;
		System.out.println(num);
	}
	
	public static void sub(int a, int b)
	{
		int num = a - b;
		System.out.println(num);
	}
	
	public static int mult(int a, int b)
	{
		int num = a * b;
		return num;
	}
	public static int mult(int a)
	{
		int num = a * 2;
		return num;
	}
	
	public static double div(double a, double b)
	{
		double num = a / b;
		return num;
	}
	
	public static double div(double a)
	{
		double num = a / 1;
		return num;
	}

}
