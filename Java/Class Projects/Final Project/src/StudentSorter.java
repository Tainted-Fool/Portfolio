import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class StudentSorter 
{
	public StudentSorter()
	{
		
	}
	
	public StudentSorter(Scanner input)
	{
		Student[] list = new Student[5];
		int counter = 0;
		
		while(input.hasNext())
		{
			String dummy1 = input.next();
			String fname = input.next();
			String dummy2 = input.next();
			String lname = input.next();
			String dummy3 = input.next();
			String id = input.next();
			String dummy4 = input.next();
			String gpa = input.next();
			
			if(counter > list.length - 1)
			{	
				Student [] temp = new Student [list.length *2];
				Arrays.copyOf(list, temp.length);
				list = temp;
			}
			
			list[counter] = new Student(fname, lname, id, gpa);
			counter++;
		}
		
		System.out.println(Arrays.toString(list));
		input.close();	
	}
	
	public String toString()
	{
		return "2646";
	}
	
	public static void main(String[] args)
			throws FileNotFoundException 
			{
				StudentSorter s = new StudentSorter(new Scanner(new File("students.txt")));
				System.out.println(s);
			}
}
