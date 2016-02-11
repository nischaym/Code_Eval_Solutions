package ctci_LinkedList;

public class Q_4 {

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
	
	public static Node part(Node head,int x)
	{
		Node left = null;
		Node right = null;
		Node current = head;
		Node righthead = null;
		Node lefthead = null;
		Node me = null;
		while (current != null)
		{
			if(current.data > x )
			{
				if(right == null)
				{
					right = new Node(current.data);
					righthead = right;
					
				}
				else
				{
					right.next = new Node(current.data);
					right = right.next;
				}
			}
			else if(current.data == x)
			{
				me = new Node(current.data);
			}
			else
			{
				if(left == null)
				{
					left = new Node(current.data);
					lefthead = left;
				}
				else
				{
					left.next = new Node(current.data);
					left = left.next;
				}
			}
			
			current = current.next;
		}
		
		
		left.next = me;
		me.next = righthead;
				
		 //Node all = left;
		return lefthead;
		
		
		
		
	}
	
	
	static void print(Node head)
	{
		Node n = head;
		while(n != null)
		{
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	
	public static void main(String[] args)
	{
		Q_4 ll = new Q_4();

		ll.head = new Node(10);
		ll.head.next = new Node(3);
		ll.head.next.next = new Node(11);
		ll.head.next.next.next = new Node(5);
		ll.head.next.next.next.next = new Node(6);
		ll.head.next.next.next.next.next = new Node(2);
		
		Node new1 = part(ll.head,5);
		//System.err.println("asfdasfsf");
		//System.out.println(new1.data);
		
		Q_4.print(new1);
		
	}
}
