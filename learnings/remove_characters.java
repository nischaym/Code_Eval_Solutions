package learnings;

public class remove_characters {

	public static void main(String[] args)
	{
		String line = "snkkofanofn, abcf";
		fn(line);		
	}
	
	public static void fn(String line){
		
		String[] a = line.split(", ");

		if(a.length>=2)
		{
			StringBuilder sb = new StringBuilder(a[0]);
			int[] b1 = new int[a[0].length()];

			for(int i=0;i<a[0].length();i++)
			{
				for(int j=0;j<a[1].length();j++)
				{
					if(sb.charAt(i)== a[1].charAt(j))
					{
						b1[i] = 1;
						break;
					}
					else
					{
						
					}
				}
			}
			
			int j=0;
			for(int i=0;i<b1.length;i++)
			{
				if(b1[i]==1)
				{
					sb.deleteCharAt(i-j);
					j++;
				}
			}
			String b = sb.toString();
			System.out.println(b);
		}
		
		
	}
}
