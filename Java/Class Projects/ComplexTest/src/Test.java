
public class Test 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Topv();
		Bottomv();
		Walls();
		Topv();
		Bottomv();
	}
	
	public static void Topv()
	{
		System.out.println("\\        /");
		System.out.println(" \\      /");
		System.out.println("  \\    /");
		System.out.println("   \\  /");
		System.out.println("    \\/");
	}
	
	public static void Bottomv()
	{
		System.out.println("    /\\");
		System.out.println("   /  \\");
		System.out.println("  /    \\");
		System.out.println(" /      \\");
		System.out.println("/        \\");
	}
	
	public static void Walls()
	{
		System.out.println("|        |");
		System.out.println("|        |");
		System.out.println("|        |");
	}
}
