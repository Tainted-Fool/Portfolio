
public class Fractionsum
{
	public static void main(String[] args)
	{
		System.out.print(fractionsum(4));
		
	}
	
	public static double fractionsum (int n)
	{
		double sum = 0;
		double num = 0;
		
		for (double i = 1; i <= n; i++)
		{
			num = 1/i;
			sum += num;
		}
		
		return sum;
	}

}
