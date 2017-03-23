/*
  Harrison Foster
  Lazaro Herrera
  Diana Nop
  Ronald Tun
  CS21A
  Program Assignment #1
 */
 
//This program creates a stick figure coming down a set of stairs
public class Stairs 
{
	//Change Number of STEPS to increase amount of stairs
	public static final int STEPS = 5;
		public static void main(String[] args)
		{
			//This loop add the stairs
			for (int i = 1; i <= STEPS; i++)
			{
				//This loop adds the spaces at the beginning of the stick figure depending on STEPS
				for (int space = 1; space <= (STEPS - i); space++)
				{
					System.out.print("     ");							
				}
				
				//This prints out the head of the figure
				System.out.print("  O  ******");
				
				//This loop adds the gap in between the stars depending on STEPS
				for (int gap = STEPS - 1; gap > (STEPS - i); gap--)
				{
					System.out.print("     ");
				}
				
				//This adds a star at the end and creates a new line
				System.out.println("*");
				
				//This loop adds the spaces at the beginning of the stick figure depending on STEPS
				for (int space = 1; space <= (STEPS - i); space++)
				{
					System.out.print("     ");
				}
				
				//This prints our the body of the figure
				System.out.print(" /|\\ *     ");
				
				//This loop adds the gap in between the stars depending on STEPS
				for (int gap = STEPS - 1; gap > (STEPS - i); gap--)
				{
					System.out.print("     ");
				}
				
				//This adds a star at the end and creates a new line
				System.out.println("*");
				
				//This loop adds the spaces at the beginning of the stick figure depending on STEPS
				for (int space = 1; space <= (STEPS - i); space++)
				{
					System.out.print("     ");
				}
				
				//This prints out the legs of the figure
				System.out.print(" / \\ *     ");
				
				//This loop adds the gap in between the stars depending on STEPS
				for (int gap = STEPS - 1; gap > (STEPS - i); gap--)
				{
					System.out.print("     ");
				}
				
				//This adds a star at the end and creates a new line
				System.out.println("*");
			}
			
			//This loop adds the stars at the last line to close the stairs
			for (int star = 1; star <= (5 * STEPS + 7); star++)
			{
				System.out.print("*");
			}
		}
}


	




