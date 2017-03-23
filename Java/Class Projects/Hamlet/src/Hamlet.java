import java.io.*;
import java.util.*;

public class Hamlet 
{
	public static void main(String[] args)
	throws FileNotFoundException 
	{
		Scanner input = new Scanner(new File("hamlet.txt"));
		
		int count = 0;
		while (input.hasNext()) 
		{
			String word = input.next();
			if (word.equals("and"))
			{
				count++;
			}
		}
		
		System.out.println("total words = " + count);
		input.close();
	}
		
}


