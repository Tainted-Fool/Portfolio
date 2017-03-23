
public class Practice {
	public static final int CONSTANT = 2;
	public static void main(String[] args) 
	{
		int num1 = 0;
		int num2 = 1;
		int next;
		
		System.out.print("1 ");
		
		//Sequence
		for (int i = 1; i < 12; i++)
		{
			next = num1 + num2;
			System.out.print(next + " ");
			num1 = num2;
			num2 = next;
		}
		
		System.out.println();
		System.out.println();
		
		//Star square
		for (int i = 1; i <= 4; i++) 
		{
			System.out.println("*****");
		}
		
		System.out.println();
		
		//Star triangle
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Number triangle
		for (int i = 1; i <= 7; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Squared
		for (int i = 1; i <= 10; i++)
		{
			System.out.print((i * i) + " ");
		}
		
		System.out.println();
		System.out.println();
		
		
		//Star Pyramid
		for (int i = 1; i <= 10; i++) 
		{
			for (int j = 1; j <= 10 - i; j++) 
			{
				System.out.print(" ");
		    }
		    for (int j = 1; j <= 2 * i - 1; j++) 
		    {
		    	System.out.print("*");
		    }
		        System.out.println();
		 }
		
		System.out.println();
		
		//Nested Numbers
		for (int l = 1; l <= 3; l++)
		{
			for (int i = 0; i <= 9; i++)
			{
				for (int j = 0; j < 3; j++)
				{
					System.out.print(i);
				}
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Dollar Figure
		for (int i = 1; i <= 7; i++)
		{
			for (int l = 2; l < 2 * i; l++)
			{
				System.out.print("*");
			}
			for (int j = 7; j > i - 1; j--)
			{
				System.out.print("$");
			}
			for (int l = 16; l > 2 * i; l--)
			{
				System.out.print("*");
			}
			for (int j = 7; j > i - 1; j--)
			{
				System.out.print("$");
			}
			for (int l = 2; l < 2 * i; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//Dollar Figure 2
		for (int i = 1; i <= CONSTANT; i++)
		{
			for (int l = 2; l < 2 * i; l++)
			{
				System.out.print("*");
			}
			for (int j = CONSTANT; j > i - 1; j--)
			{
				System.out.print("$");
			}
			for (int l = CONSTANT * 2 + 1; l >= 2 * i; l--)
			{
				System.out.print("*");
			}
			for (int j = CONSTANT; j > i - 1; j--)
			{
				System.out.print("$");
			}
			for (int l = 2; l < 2 * i; l++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//StarFigure
		for (int i = 0; i <= 4; i++)
		{
			for (int j = 16; j > i * 4; j--)
			{
				System.out.print("/");
			}
			for (int h = 1; h <= i * 8; h++)
			{
				System.out.print("*");
			}
			for (int k = 16; k > i * 4; k--)
			{
				System.out.print("\\");
			}
			System.out.println();
		}
		
		System.out.println();
		
		//StarFigure2
		for (int i = 0; i < CONSTANT; i++)
		{
			for (int j = CONSTANT * 4 - 4; j > i * 4; j--)
			{
				System.out.print("/");
			}
			for (int h = 1; h <= i * 8; h++)
			{
				System.out.print("*");
			}
			for (int k = CONSTANT * 4 - 4; k > i * 4; k--)
			{
				System.out.print("\\");
			}
			System.out.println();
		}
			
			System.out.println();
			
		//WRONG Window
		for (int i = 1; i <= CONSTANT - 1; i++)
		{
			for (int j = 1; j <= CONSTANT - 1; j++)
			{
				System.out.print("+");
				for (int l = 1; l <= CONSTANT; l++)
				{
					System.out.print("=");
				}
			}
			System.out.println("+");
				
			for (int k = 1; k <= CONSTANT; k++)
			{
				for (int m = 1; m <= CONSTANT; m++)
				{
					System.out.print("|");
					for (int l = 1; l <= CONSTANT; l++)
					{
						System.out.print(" ");
					}
				}
				System.out.println();
			}
		}
		for (int j = 1; j <= CONSTANT - 1; j++)
		{
			System.out.print("+");
			for (int l = 1; l <= CONSTANT; l++)
			{
				System.out.print("=");
			}
		}
		System.out.print("+");
			
		System.out.println();
		System.out.println();
			
		for (int i = 1; i <= 2; i++)
		{
			for (int j = 1; j <= 2; j++)
			{
				System.out.print("+");
				for (int l = 1; l <= CONSTANT; l++)
				{
					System.out.print("=");
				}
			}
			System.out.println("+");
			for (int p = 1; p <= CONSTANT; p++)
			{
				for (int t = 1; t <= 2; t++)
				{
					System.out.print("|");
					for (int j = 1; j <= CONSTANT; j++)
					{
					System.out.print(" ");
					}
				}
				System.out.println("|");
			}
				
		}
		
		for (int j = 1; j <= 2; j++)
		{
			System.out.print("+");
			for (int l = 1; l <= CONSTANT; l++)
			{
				System.out.print("=");
			}
		}
		System.out.println("+");
			
			
		System.out.println();
			
		//WaveNumber40
		for (int j = 1; j <= 40; j++)
		{
			System.out.print("-");
		}
		System.out.println();
		for (int i = 1; i <= 10; i++)
		{
			System.out.print("_");
			for (int k = 1; k <= 1; k++)
			{
				System.out.print("-^-");
			}
		}
		System.out.println();
		for (int j = 1; j <= 2; j++)
		{
			for (int m = 1; m <= 9; m++)
			{
				System.out.print(m);
				System.out.print(m);
			}
			System.out.print("00");
		}
		System.out.println();
		for (int j = 1; j <= 40; j++)
		{
			System.out.print("-");
		}
		
		System.out.println();
		System.out.println();
			
		//spacesAndNumbers
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 5; j > i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
			
		System.out.println();
			
		//spacesNumbers
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 5; j > i; j--)
			{
				System.out.print(" ");
			}
			for (int k = 1; k <= 1; k++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		System.out.println();
			
		//printDesgin
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 5; j >= i; j--)
			{
				System.out.print("-");
			}
			for (int k = 1; k <= 2 * i - 1; k++)
			{
				System.out.print(2 * i - 1);
			}
			for (int j = 5; j >= i; j--)
			{
				System.out.print("-");
			}
			System.out.println();
		}
			
		System.out.println();
			
		//nestedNumbers3
		for (int i = 1; i <= 4; i++)
		{
			for (int k = 9; k >= 1; k--)
			{
				for (int j = 1; j <= k ; j++)
				{
					System.out.print(k);
				}
			}
			System.out.println();
		}
			
		System.out.println();
			
		//nestedNumbers2
		for (int i = 1; i <= 5; i++)
		{
			for (int k = 9; k >= 0; k--)
			{
				for (int j = 1; j <= 5; j++)
				{
					System.out.print(k);
				}
			}
			System.out.println();
		}
			
		System.out.println();
			
		//numberOutput60
		for (int i = 1; i <= 6; i++)
		{
			System.out.print("         |");
		}
		System.out.println();
		for (int j = 1; j <= 6; j++)
		{
			for (int m = 1; m <= 9; m++)
			{
				System.out.print(m);
			}
			System.out.print("0");
		}//End Loop
		
		System.out.println();
		System.out.println();
		
		xo(4);
		System.out.println();
		xo(8);
		
	}//End Main
	
	//Exercise 3.4
	//Add function to main to see it work
	public static void printSquare(int min, int max)
	{
	    int range = max - min + 1;
	    
	    for (int i = 0; i < range; i++)
	    {
	        for (int j = min + 1; j <= max; j++) 
	        {
	             System.out.print(j);
	        }
	        for (int k = min; k < min + i; k++) 
	        {
	             System.out.print(k);
	        }
	        System.out.println();
	    }
	}//End of method
	
	//Exercise 3.5
	//Add function to main to see it work
	public static void printGrid(int row, int col)
	{
	    for (int i = 1; i <= row; i++)
	    {
	    	int num = i;
	        for (int j = i; j < col; j ++) 
	        {
	             System.out.print(num + ", ");
	             num += row;
	        }
	        System.out.println(num);
	    }
	}
	
	public static void xo (int size)
	{
	    int front = 0;
	    int back = size - 1;
	    
	    for (int i = 0; i < size; i++)
	    {
	        for (int j = 0; j < size; j++)
	        {
	            if (j == front || j == back)
	            {
	                System.out.print("x");
	            }
	            
	            else
	            {
	                System.out.print("o");
	            }
	        }
	        
	        System.out.println();
	        front++;
	        back--;
	    }
	}//End of Method
	
}//End Class


