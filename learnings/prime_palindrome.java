package learnings;

public class prime_palindrome {


	public static void main(String[] args)
	{

		//int max = 1000;
		for(int i=999;i>=0;i= i-2)
		{
			if (isPalindrome(i) && isPrime(i))
			{
				System.out.println(i);
				break;
			}
			
		}
	}
	
	public static boolean isPrime(int num){
		
		if(num%2 == 0){
			
			return false;
		}
		
		for(int i=3;i<num/2;i= i+2)
		{
			if(num%i == 0)
			{
				return false;
			}
		}
		return true;
	}

	
	public static boolean isPalindrome(int num){
		
		int[] a = new int[3];

		for(int i=0;i<3;i++)
		{
			a[i] = num % 10;
			num = num/10;
		}
		
		if(a[0] == a[2]){
			
			return true;
		}
		
		return false;
		
		
	}

}
