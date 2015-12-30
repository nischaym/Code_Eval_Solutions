package learnings;

public class fizz_buzz {

	
	
	public static void main(String[] args){
		
		String line = "3 5 15";
		fn(line);
	}
	
	public static void fn(String line){
		
		String[] a = line.split(" ");
		int x = Integer.valueOf(a[0]);
		int y = Integer.valueOf(a[1]);
		int limit = Integer.valueOf(a[2]);
		String[] out = new String[limit];
		
		for(int i =0 ; i< limit;i++)
		{
			if((i+1)%x == 0 && (i+1)%y == 0)
			{
				out[i]= "FB";
			}
			else if((i+1)%x == 0)
			{
				out[i]= "F";
			}
			else if((i+1)%y == 0)
			{
				out[i]= "B";
			}
			else
			{
				out[i]= String.valueOf(i+1) ;
			}

		}
		for(int i =0 ; i< limit;i++)
		{
			if(i == limit-1)
			{
				System.out.print(out[i]+"\n");
			}
			else
			{
				System.out.print(out[i]+" ");
			}
			
			
		}

		
	}

}
