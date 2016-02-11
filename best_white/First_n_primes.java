package best_white;

public class First_n_primes {


	public static void main(String[] args)
	{
		
		int n = 1000;
		
		for(int i=3;i<=1000;i++)
		{
			if(fn(i))
			{
				System.out.println(i);
			}
		}
		
	}
	
	public static Boolean fn(int n)
	{
		for(int i=2;i*i <= n;i++)
		{
			if( n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
}
