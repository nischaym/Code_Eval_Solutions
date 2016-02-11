package ctci_array;

public class Q_1 {

	
	
	public static void main (String[] args)
	{
		String s = "abcfz";
		System.out.println(hasdup(s));
		
	}

	public static boolean hasdup(String s)
	{
		
		//Integer[] check = new Integer[256];
		int present = 0;
		for(int i=0;i<s.length();i++)
		{
			int val = s.charAt(i);
			System.out.println("val is "+val);
			
			val = val - 'a';
			System.out.println(1 << val);
			if((present & (1 << val)) > 0)
			{
				return true;
			}
			
			present = present | (1 << val);
			System.out.println("present is "+present);
		}
		
		
		return false;

	}
}
