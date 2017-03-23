import java.util.Scanner;


public class Throwit
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int denom = console.nextInt();
		
		console.close();
		
		if (denom == 0)
		{
			throw new IllegalArgumentException("Dividing by zero is a bad idea\n denom is " + denom);
		}
		
		int x = 5 / denom;
		System.out.println(x);
	}

}
