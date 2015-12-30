package learnings;

public class Sum_Of_Primes {
	
	
	public static void main (String[] args)
	{
		int num=5;
		int sum = 5;
		
		for(int i=0;i<998;){
			
			if(isPrime(num)){
				
				sum = sum+num;
				i++;
			}
			else
			{
				
			}
			num += 2;
		}
		
		System.out.println(sum);
	}
	
	public static boolean isPrime(int num)
	{
		for(int j=3;j<num/2;j+=2)
		{
			if((num%j) == 0)
			{
				return false;
			}
		}
		return true;

	}

}
