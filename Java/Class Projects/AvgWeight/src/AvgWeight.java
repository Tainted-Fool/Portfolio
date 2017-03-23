import java.util.Scanner;


public class AvgWeight 
{
	public static void main(String[] args) 
	{
		Scanner console = new Scanner (System.in);
		double[] weight = new double[3];
		double sum = 0;
		
		for (int i = 0; i < weight.length; i++)
		{
			weight[i] = console.nextDouble();
			sum = sum + weight [i];
		}
		
		for (int i = 0; i < weight.length; i++)
		{
			System.out.println("Weight " + i + " = " + weight[i]);
		}
		
		System.out.println("Average = " + sum / weight.length);
		
		console.close();

	}

}
