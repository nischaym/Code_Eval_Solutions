package learnings;

public class Number_Of_Primes {

	public static void main(String[] args)
	{
		String line = "2,10";
		
		fn(line);
	}
	
	public static void fn(String line)
	{
		
		String[] a = line.split(",");
		
		int lower = Integer.valueOf(a[0]);
		int upper = Integer.valueOf(a[1]);
		
		//System.out.println(upper);
		int count = 0;
		if(lower>= upper)
		{
			
		}
		else 
		{
			for(int i=lower; i<=upper;i++)
			{
				if(isprime(i) == true)
				{
					count++;
				}
				else
				{
					
				}
			}
			
		}
//		isprime(9);
		System.out.println(count);
	}
	
	public static boolean isprime(int n)
	{
		if (n <= 1) {
		       return false;
		   }

		for (int i = 2; i <= Math.sqrt(n); i++) 
		{
		       if (n % i == 0) 
		       {
		           return false;
		       }
		}
		//System.out.println(n);
		return true;
	}
	
}
