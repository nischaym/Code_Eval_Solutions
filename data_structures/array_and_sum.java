package data_structures;

import java.util.HashMap;

public class array_and_sum {

	
	class pair
	{
		int first,second;
		pair(int f,int s)
		{
			first = f;
			second = s;
		}
		
	}
	
	boolean findPairs(int arr[])
	{
		HashMap<Integer, pair> map = new HashMap<Integer,pair>();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int sum = arr[i]+arr[j];
				if(!map.containsKey(sum))
				{
					map.put(sum,new pair(i,j));
				}
				else
				{
					pair p = map.get(sum);
					// Since array elements are distinct, we don't
                    // need to check if any element is common among pairs
                    System.out.println("("+arr[p.first]+", "+arr[p.second]+
                                      ") and ("+arr[i]+", "+arr[j]+")");
                    //return true;
				}
			}
		}
		
		return false;
	}
	
	
	 // Testing program
    public static void main(String args[])
    {
        int arr[] = {3, 10, 7, 1, 2, 9, 8};
        array_and_sum a = new array_and_sum();
        a.findPairs(arr);
    }
	
}
