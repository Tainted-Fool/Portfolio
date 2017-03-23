
public class Scratch1 
{
	public static void main(String[] args) 
	{
		char c = 'a';
		System.out.println((int)c);
		c = (char) (c + 2);
		System.out.println((int)c);
		
		int x1 = 38;
		int y1 = -152;
		System.out.printf("Location (%d, %d)\n", x1, y1);
		
		double x = 38.3;
		double y = -152.2;
		System.out.printf("Location (%12.2f, %12.2f)\n", x, y);
		
		String test = "Hi there";
		int z = search (test, 'v');
		System.out.println(z);
	}
	
	public static int search(String s, char c)
	{
		for (int i = 0; i < s.length(); i++)
		{
			if (s.charAt(i) == c)
			{
				return i;
			}
		}
		return -1;
	}

}
