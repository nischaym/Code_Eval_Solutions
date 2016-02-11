package ctci_array;

public class Q_7 {

	public static void main(String[] args)
	{
		int[][] image = {{0,1},{0,0},{0,0}};
		delete_if_zero(image);
		
	}

	static void delete_if_zero(int[][] a)
	{
	
		int[] b = new int[a.length+a[0].length];
		System.out.println(a[0].length);
		for(int i =0; i< a.length;i++)
		{
			int sum = 0;
			for(int j=0;j<a[0].length;j++)
			{
				sum = sum+ a[i][j];
				System.out.println("id,sf,sfsf");
			}
			if(sum == 0)
			{
				b[i] = 1;
			}
		}
		
		for(int j =0; j< a[0].length;j++)
		{
			int sum = 0;
			for(int i=0;i<a.length;i++)
			{
				sum = sum + a[i][j];
			}
			if(sum == 0)
			{
				b[a.length+j] = 1;
			}
		}
		
		
		
		System.out.println("afdsfdsf");
		for(int i=0;i < b.length;i++)
		{
			System.out.println(b[i]);
		}
	}
}
