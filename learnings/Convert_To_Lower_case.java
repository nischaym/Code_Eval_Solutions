package learnings;

public class Convert_To_Lower_case {
	
	
	public static void main(String[] args)
	{
		String line = "AhghA bb";
		fn(line);
	}
	
	public static void fn(String line)
	{

		System.out.println(line.toLowerCase());
//		for(int i=0;i<line.length();i++)
//		{
//			int ascii = (int) line.charAt(i);
//			if(ascii >= 65 && ascii <=90)
//			{
//				line.charAt(i) = 0;
//			}
//		}
	}

}
