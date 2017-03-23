
public class Temperature 
{
	public static void main(String[] args) 
	{
		for (int i = 0; i <= 500; i++)
		{
			double celsius = (i - 32)/1.8000;
			
			System.out.printf("Fahrenheit = %-5d Celsius = %7.2f\n", i, celsius);
		}

	}

}
