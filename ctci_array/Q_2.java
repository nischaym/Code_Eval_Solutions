package ctci_array;

public class Q_2 {

	
	
	public static void main (String[] args)
	{
		String input = "nischay0";
		System.out.println(input);
		String[] a = input.split("");
		input = "";
		for(int i =a.length-2 ; i>=0;i--)
		{
			input = input+ a[i]; 
		}
		input = input+0;
		System.out.println(input);
	}
}
