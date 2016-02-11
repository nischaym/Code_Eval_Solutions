package data_structures;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;

public class New_DS {


	ArrayList<Integer> arr;
	HashMap<Integer, Integer> hash;
	
	New_DS() {
		
		arr = new ArrayList<Integer>();
		hash = new HashMap<Integer,Integer>();
		
	}
	
	void insert(int n)
	{
		if(hash.get(n) != null)
		{
			return;
		}
		else
		{
			int s = arr.size();
		      arr.add(n);
		 
		      // And put in hash also
		      hash.put(n, s);
		}
	}
	
	void delete(int n)
	{
		Integer index = hash.get(n);
		if(index != null)
		{
			
			int temp =0;
			int s = arr.size();
			temp = arr.get(s);
			Collections.swap(arr, index, s-1);
			arr.remove(s-1);
			hash.remove(n);
			hash.put(temp, index);
			//arr[arr.size()-1] =  
		}
		else
		{
			return;
		}
	}
	
	
	Integer search(int n)
	{
		return hash.get(n);
		
	}
	
	
	int getRandom()
    {
       // Find a random index from 0 to size - 1
       Random rand = new Random();  // Choose a different seed
       int index = rand.nextInt(arr.size());
 
       // Return element at randomly picked index
       return arr.get(index);
    }
	
	public static void main(String[] args)
	{
		
		New_DS ds = new New_DS();
	}
	
}
