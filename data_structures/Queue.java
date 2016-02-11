package data_structures;

public class Queue {

	static int[] q = new int[10];
	static int start =0;
	static int end= 0;
	
	int dequeue()
	{
		int n = q[start];
		start++;
		return n;
	}

	void enqueue( int n)
	{
		q[end] = n;
		end++;
	}
	
	public static void main(String[] args)
	{
		Queue q1 = new Queue();
		q1.enqueue(10);
		q1.enqueue(20);
		q1.enqueue(30);
		System.out.println(q1.dequeue());
	}
}