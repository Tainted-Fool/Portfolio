/*
 Lazaro Herrera
 Long Beach City College
 CS21A Java
 Garrett Whelan
 October 31, 2014
 
 This project generates a random number between 2 and the
 number entered by user. It then prints the random number
 generated and gives all it's factors. The program stops
 when the user inputs zero. This program can also handle 
 if the user inputs negative numbers. Also this program
 can detect if user inputs invalid data.
 */

import java.util.Random;
import java.util.Scanner;

public class ProjectFactor 
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner(System.in);
		Factor(console);
		console.close();
	}
	
	public static void Factor(Scanner console)
	{
		//Method call for getting number
		int num = getNumber(console);
		
		//Variables
		int random = 0;
		Random r = new Random();
		
		//While loop to exit when user inputs zero
		while (num != 0)
		{
			//If loop for first three prime numbers
			if (num <= 3)
			{
				System.out.println(num + ": Prime");
			}
			
			//Else creates a random number and factors it
			else
			{
				//More variables
				//Generates random number from 2 to users input
				random = r.nextInt((num - 2) + 1) + 2;
				System.out.print(random + ": ");
				
				//Method call to see if random number is prime
				if (checkPrime(random))
				{
					System.out.println("Prime");
				}
				
				//Else factors random number
				else
				{
					//For loop to check for factors of random number
					//Notice the for loop does not increment
					for (int i = 2; i <= random;)
					{
						//While loop to calculate factors
						while (random % i == 0)
						{
							System.out.print(i);
							random = random / i;
							
							//If loop for "fencepost" issue that occurs
							if (i <= random)
							{
								System.out.print(", ");
							}	
						}
						
						//Increments i to next integer to find next factor
						if (random % i != 0)
						{
							i++;
						} 
					}
					System.out.println();
				}
			}
			
			//Method call for getting number
			//Same as beginning
			num = getNumber(console);
		}
		
		System.out.println("Program will now exit");
	}
	
	//Method to check if random number is prime or not
	public static boolean checkPrime(int num)
	{
		for (int i = 2; i < num; i++)
		{
			if (num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	//Method to get a whole number from user
	public static int getNumber(Scanner console)
	{
		System.out.print("Enter a whole number (0 to quit): ");
		
		//Checks for invalid data
		while (!console.hasNextInt())
		{
			System.out.println("That is not a whole number!!");
			System.out.print("Enter a whole number (0 to quit): ");
			console.next();
		}
		int number = Math.abs(console.nextInt());
		
		return number;
	}
}
