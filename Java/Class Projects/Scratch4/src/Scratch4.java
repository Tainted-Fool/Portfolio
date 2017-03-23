
public class Scratch4 
{
	public static void main(String[] args) 
	{
		int[] list = new int[5];
		
		for (int i = 0; i < list.length; i++)
		{
			list[i] = 2 * i + 1;
		}
		
		incLoop(list);
		
		for (int i = 0; i < list.length; i++)
		{
			System.out.println("Value " + i + " is " + list[i]);
		}
	}
	
	public static void incLoop(int[] list)
	{
		for (int i = 0; i < list.length; i++)
		{
			list[i]++;
		}
	}
}
