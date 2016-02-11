package ctci_array;

public class Sum_in_an_array {

	
	public static void main(String[] args )
	{
		int[] a = {1,2,3,4,5,6};
		
		int sum = 6;
		
		fn(a,sum);
	}
	
	public static void fn(int[] a , int sum)
	{
		
		for(int i=0;i<a.length;i++)
		{
			
			for(int j =i+1 ;j<a.length;j++)
			{
				for(int k = j+1; k<a.length;k++)
				{
					if(a[i]+a[j]+a[k] == sum)
					{
						System.out.println(a[i]+ " "+a[j]+ " "+a[k]);
					}
				}
				
				
			}
		}
	}
	
}
