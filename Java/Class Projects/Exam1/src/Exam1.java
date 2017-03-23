
public class Exam1 {
	
	public static final int NumLines = 4;
	
	public static void main(String[] args) 
	{
		drawNumberLines();
	}
	
	public static void drawNumberLines() 
	{
		for (int i = 0; i <= NumLines; i++)
		{
			
			for (int j = NumLines; j >= i; j--)
			{
				System.out.print(" ");
			}
			
			for (int k = i; k >= 0; k--)
			{
				System.out.print(k);
			}
			
			System.out.println();
		}
	}
}
