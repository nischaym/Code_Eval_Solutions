package learnings;

//import static org.junit.Assert.*;

//import org.junit.Test;

public class Stack_implementation {

	public static  void main(String[] args)
	{
		String line = "10 -2 3 4";
		fn(line);
		
	}

	public static void fn(String line)
	{
		String[] a = line.split(" ");
		int[] b = new int[a.length];
		int j=0;
		for(int i = a.length-1;i >= 0;i--)
		{
			
			b[i] = Integer.valueOf(a[i]);
			
			if(j%2 == 0)
			{
				if((a.length % 2 == 0 && i == 1) || (a.length % 2 == 1 && i == 0))
				{
					
					System.out.println(b[i]);
					break;
				}
				else
				{
					System.out.print(b[i]+" ");
				}
			}
			j++;
		}
	
		//System.out.println(b[3]);
	}
	
}
