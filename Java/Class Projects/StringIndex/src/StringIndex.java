import java.util.Scanner; //Can change Scanner to  a *


public class StringIndex 
{

	public static void main(String[] args) 
	{
		String s1 = "Hello";
		String s2 = "there";
		String combine = s1 + " " + s2;
		System.out.println(combine.length());
		System.out.println(combine.charAt(2));
		System.out.println(combine.substring(2, 7));
		System.out.println(combine.toUpperCase());
		System.out.println(combine.toLowerCase());
		
		System.out.println();
		Spread("Hello there");
		
		Scanner console = new Scanner(System.in);
		String n = console.nextLine(); //.next .nextInt .nextDouble
		System.out.println(n);
		console.close();
	}
	
	public static void Spread (String str)
	{
		for (int i = 0; i < str.length(); i++)
		{
			System.out.println(str.charAt(i));
		}
	}

}
