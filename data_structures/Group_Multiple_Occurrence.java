package data_structures;

//import java.security.acl.Group;
import java.util.HashMap;
import java.util.Map.Entry;

public class Group_Multiple_Occurrence {
	
	
	static void group(int[] arr)
	{
		HashMap<Integer, Integer> hash = new HashMap<Integer,Integer>();
		
		
		for(int i=0;i<arr.length;i++)
		{
			Integer exists = hash.get(arr[i]);
			//System.out.println(exists);
			if(exists != null)
			{
				hash.put(arr[i], exists+1);
			}
			else
			{
				hash.put(arr[i], 1);
			}
		}
		
//		for(int i=0;i< arr.length;i++)
//		{
//			for(int j=0; j< hash.get(arr[i]);j++)
//			{
//				System.out.print(arr[i]);
//			}
//		}
		
		for(int i: hash.keySet())
		{
			for(int j=0;j<hash.get(i);j++)
			{
				System.out.print(i);
			}
		}
		
		for (Entry<Integer,Integer> entry : hash.entrySet()) 
		{ 
			if (entry.getValue() == 2) 
			{ 
				System.out.println(entry.getKey()); 
			} 
		}
		
	}
	
	public static void main(String[] args)
	{
		int[] arr = {1,2,3,4,4,5};
		group(arr);
	}

}
