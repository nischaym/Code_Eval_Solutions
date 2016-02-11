package best_white;

public class tic_tac_toe {

	
	public static void main(String[] args)
	{
		
		Integer[][] a =  {{0,1,1},
						  {1,0,0,},
				          {0,1,0}}; 
		
		System.out.println(fn(a));
		
	}
	
	public static Boolean fn(Integer[][] a)
	{

		for(int i=0;i<a.length;i++)
		{
			int b = a[i][0];
			int count = 0;
			for(int j=0;j<a.length;j++)
			{
				if( b == a[i][j])
				{
					count++;
				}
			}
			if(count == 3)
			{
				return true;
			}
			else
			{
				count =0;
			}
		}
		
		for(int j=0;j<a.length;j++)
		{
			int b = a[0][j];
			int count = 0;
			for(int i=0;i<a.length;i++)
			{
				if( b == a[i][j])
				{
					count++;
				}
			}
			if(count == 3)
			{
				return true;
			}
			else
			{
				count =0;
			}
		}
		
		int b = a[0][0];
		int count =0;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i][i] == b)
			{
				count ++;
			}
		}
		if(count ==3)
		{
			return true;
		}
		
		
		return false; 
	}
	
}
