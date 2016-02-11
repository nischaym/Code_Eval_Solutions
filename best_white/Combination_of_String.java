package best_white;

public class Combination_of_String {

	
	public static void main(String[] args)
	{
		String a = "line";
		
		//String[] b = a.split("");
		
		permutation(a);
		
	}
	
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    //System.out.println("prefix is "+prefix + " and is "+str);
	    if (n == 0) 
	    {
	    	System.out.println(prefix);
	    }	
	    else 
	    {
	        for (int i = 0; i < n; i++)
	        {
	        	permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	        }
	    }
	}
	
	
}
