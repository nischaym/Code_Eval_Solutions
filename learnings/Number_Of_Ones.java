 package learnings;
 import java.util.ArrayList;

public class Number_Of_Ones 
{

	public static void main(String[] args){
		
		String line = "10";
		fn(line);
	}
	
	public static void fn(String line){
		
		
		int a = Integer.valueOf(line);
		//ystem.out.println(a);
		ArrayList<Integer> b = new ArrayList<Integer>();
		int count = 0 ;
		if(a==0)
		{
			System.out.println(0);
		}
		while(a !=0){
			
			b.add(a%2);
			a=a/2;
		}
		
		for(int i = b.size()-1;i>=0;i--)
		{
//			System.out.print(b.get(i));
//			//System.out.println("jsbnfjonsdjfndn");
//			if(i == 0)
//			{
//				System.out.println("");
//			}
			
			if(1 == b.get(i)){
				count++;
			}
		}
		
		System.out.println(count);
		

	}
}
