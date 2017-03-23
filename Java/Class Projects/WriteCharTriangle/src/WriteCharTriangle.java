
public class WriteCharTriangle 
{
	public static void main(String[] args) 
	{
		StarPyramid();
	}
	
	public static void StarPyramid()
	{
		for (int i = 1; i <= 10; i++) 
		{
			writeChar(10 - i);
			writeChar('*', (2 * i - 1));
		    System.out.println();
		 }//End of for loop
		System.out.println();
	}//End of StarPyramid
	
	public static void writeChar(char myChar, int num)
	{
		for (int i = 0; i < num; i++)
		{
			System.out.print(myChar);
		}//End of for loop
	}//End of writeChar
	
	public static void writeChar(int num)
	{
		for (int i = 0; i < num; i++)
		{
			System.out.print(" ");
		}//End of for loop
	}//End of writeChar
}//End of Class
