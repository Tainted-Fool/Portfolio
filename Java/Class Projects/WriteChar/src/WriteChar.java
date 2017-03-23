
public class WriteChar 
{
	public static void main(String[] args) 
	{
		//Square Box
		for (int i = 1; i <= 1; i++)
		{
			writeChar('*', 9);
			System.out.println();
			
			for (int j = 1; j <= 3; j++)
			{
				writeChar('*', 1);
				System.out.print("       ");
				writeChar('*', 1);
				System.out.println();
			}
		}
		writeChar('*', 9);
	}

	public static void writeChar(char myChar, int num)
	{
		for (int i = 0; i < num; i++)
		{
			System.out.print(myChar);
		}//End of for loop
	}//End of writeChar
}
