package data_structures;

import java.util.HashMap;

public class Max_Subarray_With_Sum_0 {
	
	
	static int find(int[] arr)
	{
		
		HashMap<Integer, Integer> hash = new HashMap<Integer,Integer>();
		
		int sum=0, maxLength=0;
		
		// Traverse through the given array
        for (int i = 0; i < arr.length; i++)
        {
            // Add current element to sum
            sum += arr[i];
 
            System.out.println(sum);
            if (arr[i] == 0 && maxLength == 0)
                maxLength = 1;
 
            if (sum == 0)
                maxLength = i+1;
 
            // Look this sum in hash table
            Integer prev_i = hash.get(sum);
 
            // If this sum is seen before, then update max_len
            // if required
            if (prev_i != null)
               maxLength = Math.max(maxLength, i-prev_i);
            else  // Else put this sum in hash table
               hash.put(sum, i);
        }
 
        return maxLength;
	}
	
	
	public static void  main(String[] args)
	{
		int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
		
		int a = find(arr);
		
		System.out.println(a);
	}

}
