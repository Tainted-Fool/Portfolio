import java.util.Scanner;


public class NewSmalletsLargest
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner (System.in);
		
		System.out.print("How many numbers do you want to enter? ");
		int amount = console.nextInt();
		
		int count = 0;
		int min = 0;
		int max = 0;
		
		do
		{
			System.out.print("Enter a number: ");
			int temp = console.nextInt();
			
			if (count == 0)
			{
				max = temp;
				min = temp;
			}
			
			if (temp > max)
			{
				max = temp;
			}
			
			if (temp < min)
			{
				min = temp;
			}
			count++;
		}
		while (count < amount);
		
		System.out.println("Smallest = " + min);
		System.out.println("Largest = " + max);
		
		console.close();
	}

}
