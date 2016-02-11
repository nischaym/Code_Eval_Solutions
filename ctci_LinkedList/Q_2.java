package ctci_LinkedList;

public class Q_2 {
	
	Node head;
	static class Node
	{
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
			
		}
	}
	
	static public int kth_to_last(Node head, int k)
	{
		if(head == null )
		{
			return 0;
		}
		if( k == 0 )
		{
			
		}
		
		int i = kth_to_last(head.next,k)+1;
		if(i == k)
		{
			System.out.println(head.data);
		}
		return i;
	}
	
	public static void main(String[] args)
	{
		Q_2 ll = new Q_2();
		
		ll.head = new Node(1);
		ll.head.next = new Node(2);
		ll.head.next.next = new Node(3);
		
		System.out.println(ll.kth_to_last(ll.head, 0));
		
		
	}

}
