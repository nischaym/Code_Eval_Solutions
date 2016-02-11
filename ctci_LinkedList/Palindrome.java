package ctci_LinkedList;

public class Palindrome {

	
	
	
//	String line = "Nischay";

	public static void main(String[] args)
	{
		String line = "AMMA";
		Integer a = 10;
		StringBuilder l = new StringBuilder();
		l = l.append(line);
		l = l.reverse();
		String b = "";
		for(int i=0;i<l.length();i++)
		{
			b = b+l.charAt(i);
		}
		System.out.println(b.equals(line));
	}	
	
}
