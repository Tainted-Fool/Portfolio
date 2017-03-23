import java.util.Random;
import java.util.Scanner;


public class Dice
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner (System.in);
		System.out.print("Enter number of rolls: ");
		int roll = console.nextInt();
		
		Random r = new Random();
		int result = 1;
		
		for (int i = 1; i <= roll; i++)
		{
			result = r.nextInt(6) + 1;
			System.out.println("Dice roll is: " + result);
		}
		
		console.close();
	}

}
