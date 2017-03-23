import java.util.Scanner;


public class Examine2 
{
	public static void main(String[] args) 
	{
		Scanner console = new Scanner (System.in);
		
		System.out.print("How many numbers are you going to enter? ");
		int amount = console.nextInt();
		
		int max = 0;
		int min = 0;
		
		for (int i = 1; i <= amount; i++)
		{
			System.out.print("Enter number: ");
			int tmp = console.nextInt();
			
			if (tmp > max)
			{
				max = tmp;
			}
			
			else if (tmp < max)
			{
				min = tmp;
			}
			
		}
		
		System.out.println("The max number is " + max);
		System.out.println("The min number is " + min);

		console.close();

	}

}
