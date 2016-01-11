package learnings;

public class Sum_Of_Ints_Kadame_Algo {

	public static void main (String[] args)
	{
		
		String line = "-10,-2,-3,-2,-5,-15";
		fn(line);
	}
	
	public static void fn(String line ){
		
		String[] numbers = line.split(",");
	    // First convert Strings to integer array

	    int[] test = new int[numbers.length];
	    
	    int count = 0;
	    for (String number : numbers) {
	        test[count++] = Integer.parseInt(number);
	    }

        int highestSum = test[0];
     //   int higheststart = 0;
      //  int highestend = 0;

        for (int i = 0; i < test.length; i++) 
        {
            for (int j = 0; j < test.length; j++) 
            {
                if (i != j) 
                {
                    System.out.print("[ " + i + ", " + j );
                    System.out.print(" = "+findSum(i, j,test) +"]");

                    if(highestSum < findSum(i, j,test))
                    {
                        highestSum = findSum(i, j,test);
                       // higheststart = i;
                       // highestend = j;
                    }
                }
            }
            System.out.println("");

        }

        int maxno = test[0];
        for(int i=1;i<test.length;i++)
        {
        	if(maxno < test[i])
        	{
        		maxno = test[i];
        	}
        }
        
        if(highestSum ==0)
        {
        	System.out.println(maxno);
        }
        else
        {
            int max = Math.max(highestSum, maxno);
            System.out.println(max);
            //toString(higheststart, highestend,test);
        }

	}
	
	 public static int  findSum(int i, int j,int[] test) {

	        int sum =0;

	        for (int j2 = i; j2 <= j; j2++) 
	        {

	            sum = sum +test[j2];

	        }

	        return sum;
	    }


	    public static int  toString(int i, int j,int[] test) {

	        int sum =0;

	        for (int j2 = i; j2 <= j; j2++) {

	            System.out.print(" ,"+test[j2]);

	        }

	        return sum;
	    }
	
	
	
}
