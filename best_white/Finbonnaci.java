package best_white;

public class Finbonnaci {

	
	public static void main(String[] args)
	{
		int n = 10;
		int[] a = new int[n];
		
		if(n<=0)
		{
			System.out.println("enter > 0");
			System.exit(0);
		}
		
		a[0] =1;
		a[1]=1;
		
		if(n ==1)
		{
			System.out.println(a[0]);
		}
		else if(n==2)
		{
			System.out.println(a[0]);
			System.out.println(a[1]);
		}
		else
		{
			System.out.println(a[0]);
			System.out.println(a[1]);
			
			for(int i =2;i<n;i++)
			{
				a[i] = a[i-2]+a[i-1];
				System.out.println(a[i]);
			}
		}
	}
	
}
