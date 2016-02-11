package best_white;

public class Anagrams {

	
	
	public static void main(String[] args)
	{
		
		String a = "Nischay";
		String b = "aynhc";
		
		fn(a,b);
	}

	public static void fn(String a ,String b)
	{
		String[] a1 = a.split("");
		String[] b1 = b.split("");
		int count=0;
		for( int i=0;i < b1.length;i++)
		{
			for(int j =0;j <a1.length;j++)
			{
				//System.out.println(b1[i]);
				if(b1[i].equalsIgnoreCase(a1[j]));
				{
					count ++;
					break;
				}
			}
			
		}
		//System.out.println(count);
		if(count == b.length())
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
			
	}
}
