package ctci_array;

public class Q_3 {

	public static void main (String[] args)
	{
		String ip = "blaah";
		
		if(fn(ip).equals("blah"))
		{
			System.out.println("test1");
		}

	}

	static String fn(String ip)
	{
		String op = "";
		int present = 0;

		for(int i =0 ; i< ip.length();i++)
		{
			int val = ip.charAt(i) - 'a';
			if((present & (1 << val)) > 0)
			{
				op = op + "";
			}
			else 
			{
				op = op + ip.charAt(i);
			}
			present = present | (1 << val);
		}
		return op;
	}
	
	
}

