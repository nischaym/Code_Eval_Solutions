package learnings;

public class credit_fake {

	
	
	public static void main(String[] args){
		
		String line = "9999 9999 9999 9999";
		fn(line);
	}
	
	public static void fn(String line){
		
		String[] a = line.split(" ");
		//System.out.println(a[0]);
		int sum = 0;
		
		for(int i =0 ; i< a.length;i++)
		{
			int v = Integer.valueOf(a[i]);
			//System.out.println(v);
			for(int j=0; j<4;j++)
			{
				//System.out.println(v%10);
				if(j==1 || j ==3)
				{
					sum = sum+ ((v%10) * 2);
				}
				else
				{
					sum = sum+(v%10);
				}
				v = v/10;
				
			}
		}
		
		if(sum%10 == 0)
		{
			System.out.println("Real");
		}
		else
		{
			System.out.println("Fake");
		}
				
	}

}
