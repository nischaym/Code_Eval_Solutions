package learnings;

public class sum_of_numbers {

	public static void main(String[] args){
		
		String line = "23";
		fn(line);
	}
	
	public static void fn(String line){
		
		int a = Integer.valueOf(line);
		
		int sum =0;

		for(int i=0;i<line.length();i++)
		{
			
			sum = sum +(a % 10);
			a = a/10;
		}
		System.out.println(sum);
		
		
	}
}
