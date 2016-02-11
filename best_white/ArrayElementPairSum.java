package best_white;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ArrayElementPairSum {
	private static class Pair{
		int p1;
		int p2;
		public Pair(int p1, int p2){
			this.p1 = p1;
			this.p2 = p2; 
		}
		
		public int hashCode(){
			return Integer.valueOf(p1 +p2).hashCode();
		}

		public boolean equals(Object obj){
			return obj!=null ? obj.hashCode() == this.hashCode()  ?  p1 == ((Pair)obj).p1|| p1== ((Pair)obj).p2? true : false : false :false;
			}

		public String toString(){
			return " [ "+this.p1+", "+this.p2+" ]";
		}
	}
	
	public static void main(String[] args) {
		
	int[] nums ={1,2,3,4,5,6,7,8,9};
	int final1 = 6;
	Map<Integer,Set<Pair>> resultMap = new HashMap<>();
	int outerCount = 0;
	for(int i :nums) {
		int innerCount = 0 ;
		for(int j:nums){
			
			if(outerCount == innerCount++){
				continue;
			}
			int sum = i+j;
			Set<Pair> holder = resultMap.get(sum);
			if(holder == null) {
				holder = new HashSet<>();
			} 
			if(holder.add(new Pair(i,j)))			
				resultMap.put(sum,holder);
		}
		outerCount++;
	}

	System.out.println(resultMap);
	}
}