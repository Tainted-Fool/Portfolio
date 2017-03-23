import java.util.*;


public class Familimembers 
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner (System.in);
		
		System.out.print("How many family members do you have ");
		int members = console.nextInt();
		
		if (members < 2)
		{
			System.out.println("Lonely?");
		}
		
		else if (members <=4)
		{
			System.out.println("That's normal");
		}
		
		else if (members <=7)
		{
			System.out.println("That's big!");
		}
		
		else
		{
			System.out.println("Are you a Duggar?");
		}
		
		console.close();
	}

}
