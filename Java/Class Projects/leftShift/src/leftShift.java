import java.util.Arrays;
import java.util.Random;


public class leftShift 
{
	public static void main(String[] args) 
	{
		int [] list = new int[5];
		System.out.println(Arrays.toString(list));
		populate(list);
		System.out.println();
		
		System.out.println(Arrays.toString(list));
		leftShiftLogical(list);
		System.out.println(Arrays.toString(list));
		leftShiftLogical(list);
		System.out.println(Arrays.toString(list));
		leftShiftLogical(list);
		System.out.println(Arrays.toString(list));
		System.out.println();
		
		leftShiftArithematic(list);
		System.out.println(Arrays.toString(list));
	}
	
	public static void populate (int data[])
	{
		Random rand = new Random();
		for (int i = 0; i < data.length; i++)
		{
			data[i] = rand.nextInt(2);
		}
	}
	
	public static void leftShiftLogical (int data[])
	{
		for (int i = 0; i < data.length - 1; i++)
		{
			data[i] = data [i + 1];
		}
		
		data[data.length - 1] = 0;
	}
	
	public static void leftShiftArithematic (int data[])
	{
		for (int i = 0; i < data.length - 1; i++)
		{
			data[i] = data [i + 1];
		}
	}

}
