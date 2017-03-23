
public class Student 
{
	private String FirstName;
	private String LastName;
	private String StudentID;
	private String GPA;
	
	//Constructs a new Student at no values
	public Student()
	{
		FirstName = null;
		LastName = null;
		StudentID = null;
		GPA = null;
	}
	
	//Constructs a new Student with given values
	public Student(String newFirstName, String newLastName, String newStudentID, String newGPA)
	{
		this.FirstName = newFirstName;
		this.LastName = newLastName;
		this.StudentID = newStudentID;
		this.GPA = newGPA;
	}
	
	//The following sets values, also known as "setters"
	public void setFirstName(String FirstName)
	{
		this.FirstName = FirstName;
	}
	
	public void setLastName(String LastName)
	{
		this.LastName = LastName;
	}
	
	public void setStudentID(String StudentID)
	{
		this.StudentID = StudentID;
	}
	
	public void setGPA(String GPA)
	{
		this.GPA = GPA;
	}
	
	//The following returns values, also known as "getters"
	public String getFirstName()
	{
		return FirstName;
	}
	
	public String getLastName()
	{
		return LastName;
	}
	
	public String getStudentID()
	{
		return StudentID;
	}
	
	public String getGPA()
	{
		return GPA;
	}
	
	//Returns a String representation
	public String toString()
	{
		return "FNAME: " + this.FirstName + "\n" + "LNAME: " + this.LastName + "\n"
				+ "ID: " + this.StudentID + "\n" + "GPA: " + this.GPA;
	}
}
