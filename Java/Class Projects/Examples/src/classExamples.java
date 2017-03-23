
public class classExamples 
{

	/**
	 * @param args
	 */
	
	//Created by Lazaro Herrera and Ronald Abella
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("       /\\");
		System.out.println("      /  \\");
		System.out.println("     /    \\");
		System.out.println("    /      \\");
		System.out.println("   /        \\");
		Tree();
		Tree();
		Tree();
		Tree();
		Base();
	}
	
	public static void Base()
	{
		System.out.println("     |    |");
		System.out.println("     |    |");
		System.out.println("     |____|");
	}
	
	public static void Tree()
	{
		System.out.println("  /          \\");
		System.out.println(" /___     ____\\");
		System.out.println("/              \\");
	}
}
