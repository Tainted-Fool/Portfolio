
public class starPyramid 
{
	public static void main(String[] args) 
	{
		StarPyramid();
	}
	
	public static void StarPyramid()
	{
		for (int i = 1; i <= 10; i++) 
		{
			writeSpaces(10 - i);
			
		    for (int j = 1; j <= 2 * i - 1; j++) 
		    {
		    	System.out.print("*");
		    }//end of second inner loop
		        System.out.println();
		 }//end of for loop
		
		System.out.println();
	}
	
	public static void writeSpaces(int s)
	{
		for (int i = 0; i < s; i++)
		{
			System.out.print(" ");
		}//end of for loop
	}//end of write space method
}
