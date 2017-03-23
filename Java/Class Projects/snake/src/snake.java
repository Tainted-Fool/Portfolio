
//Lazaro Herrera
//CS21A
 

public class snake 
{
	public static void main(String[] args) 
	{
		Head();
		Body();
		Tail();
	}
	
	public static void Head()
	{
		System.out.println("     \\/");
		System.out.println("     ||");
		System.out.println("     ||");
		System.out.println("     __");
		System.out.println("    /  \\");
		System.out.println("   / .. \\");
		System.out.println("  /      \\");
		System.out.println(" (  [] [] )");
		System.out.println(" |        |");
		System.out.println("  \\      /");
		System.out.println("   |    |");
		System.out.println("   |    |");
	}
	
	public static void Body()
	{
		for (int i = 1; i < 3; i++)
		{
			System.out.println("   )    )");
			System.out.println("  /    /");
			System.out.println(" (    (");
			System.out.println("  \\    \\");
		}
	}

	public static void Tail()
	{
		System.out.println("  |     |");
		System.out.println("  |     |");
		System.out.println("  \\     /");
		System.out.println("   \\   /");
		System.out.println("    \\_/");
	}
}