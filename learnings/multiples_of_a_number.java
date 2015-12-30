package learnings;

public class multiples_of_a_number {
	
	
	public static void main(String[] args)
	{
		

		String ln = new String("100,16");
		
		fn(ln);
		 
	}
	
	
	public static void fn(String ln){
		
		int i=1;
		String[] a = ln.split(",");
	    int x = Integer.valueOf(a[0]);
	    int n = Integer.valueOf(a[1]);
	    
		int val = n;
	    for(n= n*i;;n = val*i)
	    {
	    	if(n >= x)
	    	{
	    		System.out.println(n);
	    		break;
	    	}
	    	else
	    	{
	    		i++;
	    	}
	    }

	}
}
