package learnings;

public class fibonacci {

	public static void main(String[] args){
		
		String line = "1";
		fn(line);
	}
	
	public static void fn(String line){
		
		int a = Integer.valueOf(line);
		int[] f = new int[a+1];

		if(a==0)
		{
			System.out.println(0);
		}
		else if(a < 2)
		{
			System.out.println(1);
		}
		else
		{
			f[0] = 1;
			f[1] = 1;
			
			for(int i=2;i<a;i++)
			{
				
				f[i]= f[i-1]+f[i-2];
			}
			System.out.println(f[a-1]);
			
		}
	}

}
