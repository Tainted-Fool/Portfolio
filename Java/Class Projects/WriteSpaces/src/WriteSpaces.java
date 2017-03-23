
public class WriteSpaces 
{
	public static void main(String[] args) 
	{
		System.out.print("|");
		writeSpaces(5); //This is an actual parameter
		System.out.print("|");
	}
	
	public static void writeSpaces(int s) //This is a formal parameter
	{
		for (int i = 0; i < s; i++)
		{
			System.out.print(" ");
		}//End of for loop
	}//End of write space method
	
	
	
}
