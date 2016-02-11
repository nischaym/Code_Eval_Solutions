package ctci_LinkedList;

import java.util.HashMap;

public class Q_6 {

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
	
	public static void check_circular(Node head)
	{
		Node cur = head;
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		
		while(cur != null)
		{
			if(hash.get(cur.data) != null)
			{
				
				System.out.println(cur.data);
				break;
			}
			else
			{
				hash.put(cur.data, 1);
				
			}
			cur = cur.next;
		}
	}
	
	
	
	public static void main(String[] args)
	{
		Q_6 ll= new Q_6();
		ll.head = new Node(1);
		ll.head.next = new Node(2);
		ll.head.next.next = new Node(3);
		ll.head.next.next.next = new Node(2);
		ll.head.next.next.next.next = new Node(0);
		
		Q_6.check_circular(ll.head);
		
	}
}
