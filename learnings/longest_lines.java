package learnings;

import java.util.ArrayList;

public class longest_lines {
	
	
	public static void main(String[] args)
	{
		String[] line = {"2","a","ab","sadbasofdo"};
		ArrayList<String> a = new ArrayList<String>();
		int i = 0;
			while(i < line.length )
			{
				a.add(line[i]);
				i++;
			}
		
		fn(a);
	}

	
	public static void fn(ArrayList<String> b)
	{
		//String[] a = line.split("[\\r\\n]+");
		//System.out.println(a[2]);
		
		String[] a = new String[b.size()];	
		for(int i=0;i<b.size();i++)
		{
			a[i] = b.get(i);
		}
		
		
		if(a.length !=0)
		{
			for(int j = 1;j<a.length;j++)
			{
				for(int i=1;i<a.length-1;i++)
				{
					if(a[i].length() < a[i+1].length())
					{
						String temp = a[i];
						a[i]=a[i+1];
						a[i+1] = temp;
					}
				}
			}
			
			if(a.length <=1 ) 
			{
				System.out.println("blah");
			}
			else if(a.length-1 < Integer.valueOf(a[0]))
			{
				System.out.println("blah1");
			}
			else 
			{
				for(int i=1;i<= Integer.valueOf(a[0]);i++)
				{
					System.out.println(a[i]);
				}
				
			}

		}
		
		
	}
}