import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class Final_Project 
{
	public static void main(String[] args)
	throws FileNotFoundException 
	{
		StudentSorter s = new StudentSorter(new Scanner(new File("students.txt")));
		System.out.println(s);
	}
}
		
import java.util.*;


public class StudentSorter 
{
	//class variables
	private Student [] list = new Student [10];
	private int listLength = 0;
	Scanner console = new Scanner (System.in);
			
	public StudentSorter(Scanner console){
	//declared variables
	int counter = 0;
	char choice = 'y';
				
	//Main process
	do
	{	
		//increase array size if required
		if (counter > list.length - 5)
		list = increaseArraySize(list);
					
		//declared variables
		System.out.print("Enter student's first name: ");
		String fname = console.next();
					
		System.out.print("Enter student's last name: ");
		String lname = console.next();
					
		System.out.print("Enter student's ID number: ");
		String studentID = console.next();
					
		System.out.print("Enter student's GPA: ");
		double GPA = console.nextDouble();
					
		//copy info into database
		list[counter] = new Student(fname,lname,studentID,GPA);
		counter++;
					
		//continue prompt
		System.out.print("Create another student? (y/n): ");
		choice = console.next().charAt(0);
					
		//check for prompt error
		while (choice != 'y' && choice != 'n' && choice != 'Y' && choice != 'N')
		{
			System.out.print("Please enter a valid choice: ");
			choice = console.next().charAt(0);
		}//end of while
					
	}
	while(choice == 'y'); //end of main process
	this.listLength = counter;
	for (;counter < list.length; counter++)
	list[counter] = new Student();
	}
			//end of StudentSorter constructor
			
	public String toString(){
	String result = "";
				result += this.list[0].getFirstName();
				for (int i = 1; i < this.listLength; i++)
					result += (", " + this.list[i].getFirstName());
				return result;
			}
			
			public Student [] increaseArraySize (Student[] temp){
				Student [] result = Arrays.copyOf(temp,temp.length*2);
				return result;
			} // end of increaseArraySize
			
			public void showList(){
				for (int i = 0; i < this.list.length; i++)
					System.out.println(this.list[i].getFirstName());
			}//end of showList
			
			
}
