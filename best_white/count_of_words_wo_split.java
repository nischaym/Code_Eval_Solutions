package best_white;

public class count_of_words_wo_split {

	
	public static void main(String[] args)
	{
		
		String a = "line is a line is not";
		
		fn(a);
		
	}
	
	public static void fn(String a)
	{
		int start =0, end=a.length();
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i) == ' ')
			{
				 
				end = i;
				
				System.out.println(a.substring(start, end).trim());
				start = i;
			}
			if(i == a.length()-1)
			{
				System.out.println(a.substring(start, a.length()).trim());
			}
		}
		
	}
	
}
