import java.util.Scanner;


public class Examine3 
{
	public static void main(String[] args) 
	{
		Scanner console = new Scanner (System.in);
		
		System.out.print("How many numbers are you going to enter? ");
		int amount = console.nextInt();
		
		int sum = 0;
		
		for (int i = 1; i <= amount; i++)
		{
			System.out.print("Enter number: ");
			int tmp = console.nextInt();
			
			sum += tmp;
		}
		
		System.out.println("The sum is " + sum);
		System.out.println("The average is " + sum/amount);
		
		console.close();

	}

}
