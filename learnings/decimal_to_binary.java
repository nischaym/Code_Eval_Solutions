 package learnings;
 import java.util.ArrayList;

public class decimal_to_binary 
{

	public static void main(String[] args){
		
		String line = "1";
		fn(line);
	}
	
	public static void fn(String line){
		
		
		int a = Integer.valueOf(line);
		//ystem.out.println(a);
		ArrayList<Integer> b = new ArrayList<Integer>();
		//int i =0 ;
		if(a==0)
		{
			System.out.println(0);
		}
		while(a !=0){
			
			b.add(a%2);
			//System.out.println(a%2);
			a=a/2;
			//System.out.println(a);
		}
		//int i = b.size();
		//System.out.print(b);
		
		//System.out.println(b.size());

		
		for(int i = b.size()-1;i>=0;i--)
		{
			System.out.print(b.get(i));
			//System.out.println("jsbnfjonsdjfndn");
			if(i == 0)
			{
				System.out.println("");
			}
		}
		
		
		

	}
}
