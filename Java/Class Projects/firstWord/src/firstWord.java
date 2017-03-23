
public class firstWord 
{
	public static void main(String[] args) 
	{
		System.out.println(FirstWord("Hello"));
		System.out.println(FirstWord("Hello World"));
		System.out.println(FirstWord("        Hello World"));
		System.out.println(FirstWord("        HelloWorld"));
	}
	
	public static String FirstWord(String s) 
	{
		int start = 0;
		
		while (start < s.length() && s.charAt(start) == ' ') 
		{
			start++;
		}
		
		int stop = start;
		
		while (stop < s.length() && s.charAt(stop) != ' ') 
		{
			stop++;
		}
		
		return s.substring(start, stop);
	}

}

