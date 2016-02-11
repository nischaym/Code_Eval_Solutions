package ctci_array;

public class Q_5 {

	public static void main (String[] args)
	{
		String ip = "n i s";
		replace(ip);
	}
	
	public static void replace(String a)
	{
		String b = "";
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i) == ' ')
			{
				b = b+"%20";
			}
			else
			{
				b = b+a.charAt(i);
			}
		}
		
		System.out.println(b);
		
	}
	
}
