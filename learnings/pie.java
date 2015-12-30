package learnings;

import java.math.BigDecimal;

public class pie {
	
	public static void main(String[] args)
	{
		

		String ln = "1";
		
		fn(ln);
		 
	}
	
	
	public static void fn(String line){
		
		
		int pos = Integer.valueOf(line);
		
		//double value = (22.0/7.0);
		String value = String.format("%.50g%n",Math.PI );//((double)22.0/7.0));

		System.out.println(value);

	}
	

}
