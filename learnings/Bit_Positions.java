package learnings;

public class Bit_Positions {

	public static void main(String[] args){
		
		String line = "0,2,3";
		fn(line);
	}
	
	public static void fn(String line){
		
		String[] a = line.split(",");

		int[] bp = new int[8];
		int num = Integer.valueOf(a[0]);
		int pos1 = Integer.valueOf(a[1]);
		int pos2 = Integer.valueOf(a[2]);
		
		for(int i=0;i<8;i++){
			
			bp[i] = num%2;
			num = num/2;
			if(num == 0)
			{
				break;
			}
		}
		
		if( bp[pos1-1] == bp[pos2-1]){
			
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
	}
}
