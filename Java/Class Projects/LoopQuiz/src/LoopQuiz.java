
public class LoopQuiz 
{
	public static void main(String[] args) 
	{
		int z = 0;
		int list[] = {15, 10, 8, 6, 2, 99};
		
		System.out.println(list[2] + list[5]);
		
		boolean a = true;
		int age = 12;
		boolean b = false;
		boolean x = ! ( age < 21 && ( a || b ));
		
		System.out.println(x);
		
		for (int i = 1; i < 11; i += 3) 
		{
			z = z + i;
			System.out.println(z);
			
		}
	}

}
