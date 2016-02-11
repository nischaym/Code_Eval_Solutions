package best_white;

public class Anagrams {

	static int count=0;
	
	public static void main(String[] args)
	{
		
		String a = " ";
		String b = "aynhckewrfewf";
		
		fn(a,b);
	}

	public static void fn(String a ,String b)
	{
		String[] a1 = a.split("");
		String[] b1 = b.split("");
		
		for( int i=0;i < b1.length;++i)
		{
			for(int j =0;j <a1.length;j++)
			{
				//System.out.println(b1[i]);
				if(a1[j].equals(b1[i]));
				{
					System.out.println(b1[i]);
					System.out.println(a1[j]);
					count ++;
					break;
				}
			}
			
		}
		System.out.println(count);
		if(count == b.length())
		{
			System.out.println(true);
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
			
	}
}
