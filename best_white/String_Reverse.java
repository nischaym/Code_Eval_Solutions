package best_white;

public class String_Reverse {

	
	public static void main(String[] args)
	{
		
		String a = "arra";
		
//		String[] b = a.split("");
//		
		String c = "";
		for(int i=a.length()-1;i>=0;i--)
		{
			c = c+a.charAt(i);
		}
		
		if(a.equals(c))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
	
}
