import java.util.Random;

public class Multi 
{
	public static void main(String[] args) 
	{
		int [][] multi = new int[3][5];
		populate(multi);
		printArray(multi);
	}
	
	public static void populate (int data [][])
	{
		Random rand = new Random();
		
		for (int i = 0; i < data.length; i++)
		{
			for (int j = 0; j < data[i].length; j++)
			{
				data[i][j] = rand.nextInt(10);
			}
		}
	}
	
	public static void printArray(int data [][])
	{
		for (int i = 0; i < data.length; i++)
		{
			System.out.print("[");
			for (int j = 0; j < data[i].length; j++)
			{
				System.out.print(data[i][j]);
				
				if (j <= data.length)
				{
					System.out.print(", ");
				}	
			}
			
			System.out.println("]");
		}
	}
}
