import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class HiLoNames
{
	public static void main(String[] args)
	throws FileNotFoundException 
	{
		Scanner input = new Scanner(new File("testscores.txt"));
		
		int high = 0;
		int low = 0;
		
		String[] highScore = new String[100];
		String[] lowScore = new String[100];
		
		while (input.hasNextLine()) 
		{
			String text = input.nextLine();
			Scanner data = new Scanner(text);
			
			while (data.hasNextInt()) 
			{
				int score = data.nextInt();
				String ID = data.next();
				
				if(score >= 70)
				{
					highScore[high] = ID;
					high++;
				}
				else
				{
					lowScore[low] = ID;
					low++;
				}
			}
			data.close();
		}
		
		input.close();
		
		System.out.println("70 or better:");
		for(int i = 0; i < high; i++)
		{
			System.out.println("  " + highScore[i]);
		}
		
		System.out.println("Less than 70:");
		for(int j = 0; j < low; j++)
		{
			System.out.println("  " + lowScore[j]);
		}
	}
	
}
