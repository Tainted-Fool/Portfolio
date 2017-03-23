import java.util.Scanner;


public class Factor 
{
	public static void main(String[] args) 
	{
		Scanner console = new Scanner (System.in);
		System.out.print("Enter a number: ");
		
		while (!console.hasNextInt())
		{
			System.out.println("That is invalid data!");
			System.out.print("Enter a number: ");
			console.next();
		}
		
		int number = console.nextInt();
		int divisor = 2;
		
		while(number % divisor != 0)
		{
			divisor++;
		}
		
		System.out.println("The smallet divisor is " + divisor);
		console.close();
	}

}
