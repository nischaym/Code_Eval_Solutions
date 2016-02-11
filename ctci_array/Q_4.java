package ctci_array;

public class Q_4 {

	
	public static void main(String[] args)
	{
		String i1 = "nischay";
		String i2 = "yahksin";
		
		System.out.println(isana(i1,i2));
	}
	
	private static Boolean isana(String i1, String i2)
	{

		String[] a = i1.split("");
		String[] b = i2.split("");
		int count = 0;
			for(int i =0 ; i< a.length;i++)
			{
				for (int j =0 ; j < b.length;j++)
				{
					if (a[i].equalsIgnoreCase(b[j]))
					{
						count++;
					}
				}
				
			}

			if (count == a.length) return true;
			return false;
	}
	
}
