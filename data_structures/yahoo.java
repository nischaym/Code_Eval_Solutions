package data_structures;

import java.util.HashMap;

public class yahoo {

	
	
	public static void main(String[] args)
	{
		String ip = "fjskbfjdb asjfbjsdbf nkfkosnfk is is";
		int j =0 ;
		int end = 0;
		
//		String[] a = ip.split(" ");
//		HashMap<String, Integer> hash = new HashMap<String , Integer>(); 
//		
//		for( int i =0 ; i< a.length ;i++)
//		{
//			if(hash.get(a[i]) == null )
//			{
//				
//				hash.put(a[i], 1);
//			}
//			else
//			{
//				hash.put(a[i], hash.get(a[i])+1);
//			}
//		}
//		
//		System.out.println(hash.get("is"));

		for(int i =0;i<ip.length();i++ )
		{
			if(ip.charAt(i) == ' ' || i == (ip.length()-1))
			{
				end = i;

				String s = "";
				for(int k = j  ; k<= end;k++ )
				{
					s = s+ip.charAt(k);
				}
				
				System.out.println(s.trim());
				j = i+1;
				System.out.println(j);
			}
			
		}
		

	}
}
