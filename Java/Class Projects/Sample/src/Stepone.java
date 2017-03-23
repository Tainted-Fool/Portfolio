
public class Stepone 
{
	public static void main(String[] args) 
	{	
		printGrid(3, 6);
    }

	public static void printGrid(int row, int col)
	{
	    for (int i = 1; i <= row; i++)
	    {
	        for (int j = 1; j <= col; j++) 
	        {
	            System.out.print((j + i) % col - 1);
	            System.out.print(", ");
	        } 
	        System.out.println();
	    }
	}
}

	

