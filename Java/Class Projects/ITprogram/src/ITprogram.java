public class ITprogram 
{
    public static void main(String[] args) 
    {
        printOdds(3);
        printOdds(17 / 2);
        
        int x = 25;
        printOdds(37 - x + 1);
        
        System.out.println(swapPairs("hello there"));
        
        System.out.println(wordCount("Hi"));
       
        perfectNumbers3(500);
    }   
    
    public static void printOdds(int n) 
    {
        for (int i = 1; i <= n; i++) 
        {
            int odd = 2 * i - 1;
            System.out.print(odd + " ");
        }
        System.out.println();
    }
    public static String swapPairs (String s)
    {
        String swap ="";
        
        for (int i = 0; i < s.length() - 1; i+=2)
        {
            char a = s.charAt(i + 1);
            char b = s.charAt(i);
            swap = swap + a + b;
        }
        
        if (s.length() % 2 == 1)
        {
        	char c =s.charAt(s.length() - 1);
        	swap = swap + c;
        }
        
        return swap;
    }
    
    public static int wordCount(String s)
    {
    	int count = 0;
    	
    	if(Character.isLetter(s.charAt(0)))
		{
			count++;
		}
    	
    	for (int i = 0; i < s.length() - 1; i++)
    	{
    		if (s.charAt(i) == ' ' && Character.isLetter(s.charAt(i + 1)))
    		{
    			count++;
    		}
    		
    	}
    	return count;
    }
    
    public static void perfectNumbers(int number)
    {        
        int temp = 0;
        
        for(int i=1;i<=number/2;i++)
        {
            if(number%i == 0)
            {
                temp += i;
            }
        }
        
        if(temp == number)
        {
            System.out.println("It is a perfect number");            
        } 
        
        else 
        {
            System.out.println("It is not a perfect number");            
        }
    }
    
    public static void perfectNumbers2(int number)
    {
    	int temp = 0;
    	
    	for (int i = 1; i <= number; i++)
    	{
    		for (int j = 1; j <= number; j++)
    		{
    			if (number % i == 0)
        		{
        			temp += i;
        		}
    		}    		    		
    	}
    }
    
    public static void perfectNumbers3(int n) 
    {    	
    	System.out.print("Perfect numbers up to " + n + ":");
    	
    	for (int current = 1; current <= n; current++)
    	{
    		int sum = 0;
    	 
    		for (int factor = 1; factor < current; factor++)
    		{    		    		
    			if (current % factor==0)
    			{
    				sum = sum+factor;
    			}
    		}
    	
    		if (sum == current)
    		{
    			System.out.print(" " + current);
    		}
    	}
    	
    	System.out.println();
    }
    	
    
}