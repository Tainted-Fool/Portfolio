/*
 Lazaro Herrera
 Long Beach City College
 CS21A Java
 Garrett Whelan
 December 11, 2014
 
 This project uses classes and reads from an input file. 
 The input file has two tokens per line. The first token 
 is ignored and reads the second token. The second token 
 is then placed into an array. After data has been read, 
 the program outputs the content of the array if desired.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class StudentSorter
{
	Student[] list = new Student[10];
	private int counter;
	
	//Constructs a new Sorter at no values
	public StudentSorter()
	{
		list = null;
		counter = 0;
	}
	
	//Reads from input file and stores to array
	public StudentSorter(Scanner input)
	{
		while(input.hasNext())
		{
			//Junk ignores first token
			String junk1 = input.next();
			String fname = input.next();
			String junk2 = input.next();
			String lname = input.next();
			String junk3 = input.next();
			String id = input.next();
			String junk4 = input.next();
			String gpa = input.next();
			
			//Increase array if it gets full
			//If full it copies content of first array to a new one
			if(counter > list.length - 1)
			{	
				Student [] temp = new Student [list.length * 2];
				Arrays.copyOf(list, temp.length);
				list = temp;
			}
			
			//Creates an array from the good data
			list[counter] = new Student(fname, lname, id, gpa);
			counter++;
		}
		input.close();	
	}
	
	//Returns a String representation
	public String toString()
	{
		//Make an empty string and append to it
		String output = "";
		
		for(int i = 0; i < counter; i++)
		{
			output += list[i] + "\n";
		}
		return output;
	}
	
	public static void main(String[] args) 
	throws FileNotFoundException 
	{
		StudentSorter test = new StudentSorter(new Scanner(new File("students.txt")));
		System.out.println(test);
	}
}
