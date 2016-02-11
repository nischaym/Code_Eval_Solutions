package ctci_graphs;

public class Merge_sort {
	
	
	   private int[] array;
	    int[] tempMergArr;
	    private int length;

	public static void main(String[] args) {
		
		int[] a = {10,2,3,1};
		
		Merge_sort ms = new Merge_sort();
		ms.mergesort(a);

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	
	
	public void mergesort(int[] a)
	{
		this.length = a.length;
		int lower = 0;
		this.array = a;
		this.tempMergArr = new int[a.length];
		domerge(lower,length-1);
	}
	
	public  void domerge(int lower , int higher)
	{
		if(lower < higher)
		{
			int middle = lower + ((higher-lower)/2);
		
			domerge(lower , middle);
			
			domerge(middle+1,higher);
			
			mergeparts(lower,middle,higher);
		}
		
	}
	
	public void mergeparts(int lower,int middle,int higher)
	{
		for(int i=lower;i<= higher;i++)
		{
			tempMergArr[i] = array[i];
		}
		
		int i =lower;
		int j = middle+1;
		int k = lower;
		
		
		while (i <= middle && j  <= higher)
		{
			if(tempMergArr[i] <= tempMergArr[j])
			{
				array[k] = tempMergArr[i];
				i++;
			}
			else
			{
				array[k] = tempMergArr[j];
				j++;
			}
			k++;
		}
		
        while (i <= middle) {
            array[k] = tempMergArr[i];
            k++;
            i++;
        }			
		
	}
	
}
