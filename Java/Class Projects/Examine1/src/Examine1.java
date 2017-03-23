import java.util.*;

public class Examine1
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
			int num = console.nextInt();
			
			sum += num;
		}
		
		System.out.println("The sum of the numbers you entered are " + sum);

		console.close();
	}

}
