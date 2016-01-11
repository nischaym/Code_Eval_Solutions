package learnings;

public class Make_A_Square {

	
	
	public static void main (String[] args)
	{
		String line = "(0,0), (0,0), (0,0), (0,0)";
		
		fn(line);
	}
	
	public static void fn(String line)
	{
		int n = line.length();
		char[] a = new char[n];
		int[] b = new int[8];
		int j=0;
		double mx = 0 ,my =0;
		for(int i=0;i<n;i++)
		{
			a[i] = line.charAt(i);
			//System.out.print(a[i]);
			if(a[i] >= 48 && a[i] <= 57){
				b[j] = (Integer.valueOf(a[i]) - 48);
				//System.out.println(b[j]);
				j++;
			}
		}
		mx = (b[6]+b[0]+b[2]+b[4])/4.0;
		my = (b[7]+b[1]+b[3]+b[5])/4.0;
		
//		System.out.println("mx "+mx);
//		System.out.println("my "+my);
		double[] d = new double[4];
		
		for(int i =0;i<4;i++)
		{
			 d[i] = distance(mx,my,b[i*2],b[(i*2)+1]);
			 //System.out.println(d[i]);
		}
		
		if( d[0] == d[1] && d[2] == d[3] && d[1] == d[2] && d[0] !=0 && d[1] !=0 && d[2] !=0 && d[3] !=0)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
			
		
	}
	
	public static double distance(double mx,double my,int x, int y)
	{
		return (double) Math.sqrt(((mx-x)*(mx-x)) + ((my-y)*(my-y)));
	}
}
