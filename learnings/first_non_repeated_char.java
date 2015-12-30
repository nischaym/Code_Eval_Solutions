package learnings;

public class first_non_repeated_char {

	
	public static void main(String[] args)
	{
		
		String line = "yellow";
		fn(line);
	}
	
	public static void fn(String line)
	{
		char[] a = new char[line.length()];
		int [] b = new int[line.length()];
		for(int i=0;i<line.length();i++)
		{
			a[i] = line.charAt(i);
		}
		
		for(int i=0;i<line.length();i++)
		{
			for(int j=0;j<line.length();j++)
			{
				if(a[i]==a[j])
				{
					b[i]++;
				}
			}
		}

		for(int i=0;i<line.length();i++)
		{
			if(b[i]==1)
			{
				System.out.println(a[i]);
				break;
			}
			else
			{
				
			}
		}
	}
}
