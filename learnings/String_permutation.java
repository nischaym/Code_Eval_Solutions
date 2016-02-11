package learnings;

public class String_permutation {

	public static void main(String[] args)
	{
		String line = "hat";
		fn(line);
	}
	
	public static void fn(String line)
	{
		int count = line.length();
		String[] source = line.split("");
		//System.out.println(source[0]);
		int maxcom = 1;
		
		for(int i=1;i<=count;i++)
		{
			maxcom=maxcom*i;
		}
		
		System.out.println(maxcom);
		
		String[] a = new String[maxcom];
				
		
	}
	
}
