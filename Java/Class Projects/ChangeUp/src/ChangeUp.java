import java.util.Random;
import java.util.Scanner;


public class ChangeUp 
{
	public static void main(String[] args) 
	{
		int[] change = new int[6];
		
		System.out.println("Before call");
		printArray(change);
		
		for(int i = 0; i < 6; i++)
		{
			changeOne(change);
			System.out.println("After call");
			printArray(change);
		}
	}
	
	public static void printArray (int[] change)
	{
		for (int i = 0; i < change.length; i++)
		{
			System.out.println("Change " + i + " = " + change[i]);
		}
	}
	
	public static void changeOne (int[] change)
	{
		Scanner console = new Scanner (System.in);
		Random r = new Random();
		
		System.out.print("Enter a value: ");
		change [r.nextInt(change.length)] = console.nextInt();
		System.out.println();
	}

}
