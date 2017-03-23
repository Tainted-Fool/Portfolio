
public class Flip 
{
	public static void main(String[] args)
	{
		int[] list = new int[9];
		
		System.out.println("Before swap");
		for (int i = 0; i < list.length; i++)
		{
			list[i] = 2 * i + 2;
			System.out.println(list[i]);
		}
		
		System.out.println();
		
		for (int i = 0; i < list.length / 2; i++)
		{
			int j = list.length - i - 1;
			swap(list, i, j);
		}
		
		System.out.println("After swap");
		for (int i = 0; i < list.length; i++)
		{
			System.out.println(list[i]);
		}
	}
	
	public static void swap(int[] list, int i, int j)
	{
		int temp = list[i];
		list[i] = list[j];
		list[j] = temp;
	}
}
