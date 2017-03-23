import java.util.*;

public class Age
{
	public static void main(String[] args)
	{
		Scanner console = new Scanner (System.in);
		
		System.out.print("How old are you? ");
		int age = console.nextInt();
		
		
		
		if (age < 16)
		{
			System.out.println("You cannot drive");
		}
		
		else if (age >= 18)
		{
			System.out.print("Are you (M)ale or (F)emale ");
			String gender = console.next();
			
			if (gender.equals("m"))//DO NOT USE ==
			{
				System.out.println("You must register for draft");
			}
			
			else 
			{
				System.out.println("You dont have to register for draft");
			}
		}//end of if/else
		
		else 
		{
			System.out.println("You can drive without responsibilities");
		}
		
		console.close();
	}
}
