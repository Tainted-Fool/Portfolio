
import java.io.*;
import java.util.*;

public class Hamlet2 
{
	public static void main(String[] args)
	throws FileNotFoundException 
	{
		Scanner input = new Scanner(new File("hamlet.txt"));
		int count = 0;
		
		while (input.hasNextLine()) 
		{
			String text = input.nextLine();
			Scanner data = new Scanner(text);
			boolean found = false;
			
			while (data.hasNext() && !found) 
			{
				String word = data.next();
				if (word.equals("and"))
				{
					count++;
					found = true;
				}
			}
			data.close();
		}
		
		System.out.println("total words = " + count);
		input.close();
		
	}
	
}
