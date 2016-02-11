
package data_structures;

import java.util.ArrayList;
import java.util.HashMap;
//import java.util;
import java.util.List;
import java.util.Map;
//import java.io.*;

public class No_of_Employee
{
	
	
	static Map<String, Integer> result = new HashMap<String,Integer>();
	
	public static void main(String[] args)
	{
		Map<String, String> dataSet = new HashMap<String, String>();
		
		
		dataSet.put("A", "C");
	    dataSet.put("B", "C");
	    dataSet.put("C", "F");
	    dataSet.put("D", "E");
	    dataSet.put("E", "F");
	    dataSet.put("F", "F");
		
	    System.out.println("sfnsdjfbjsfjsfd");
	    fn(dataSet);
	    	
	    System.out.println(result+" ");
	    
	}
	
	
	
	public static void fn(Map<String, String> dataSet)
	{
		Map<String,List<String>> MngrEmp = new HashMap<String, List<String>>();
		
		
		for(Map.Entry<String, String> entry: dataSet.entrySet() )
		{
			String emp = entry.getKey();
			String mngr = entry.getValue();
			
			if(!(emp.equals(mngr)))
			{
				List<String> directReport = MngrEmp.get(mngr);
				
				
				if(directReport == null)
				{
					directReport = new ArrayList<String>();
				}
				
				directReport.add(emp);
				
				
				MngrEmp.put(mngr, directReport);
				
			}
		}
		
		for(String mngr:dataSet.keySet())
		{
			populateResult(mngr,MngrEmp);
		}

	}



	private static int populateResult(String mngr, Map<String, List<String>> mngrEmp) 
	{
		int count =0;
		
		if(!mngrEmp.containsKey(mngr))
		{
			result.put(mngr, 0);
			return 0;
		}
		else if(result.containsKey(mngr))
		{
			count = result.get(mngr);
		}
		else
		{
			List<String> direct = mngrEmp.get(mngr);
			count = direct.size();
			for(String directemp:direct)
			{
				count+=populateResult(directemp,mngrEmp);
			}
			result.put(mngr, count);
		}
		
		return count;
	}
	
	
}
