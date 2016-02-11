package best_white;

public class Combo_Of_Array {

	public static void main(String[] args)
	{
		String[] a = new String[]{"a","b","c"};
		String[] b = new String[]{"e","f","g"};
		String[] c = new String[]{"h","i","j"};
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<3;k++)
				{
					System.out.println(a[i]+" "+b[j]+" "+c[k]);
				}
						
			}
		}
		
		
	}
	
}
