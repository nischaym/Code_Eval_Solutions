package ctci_LinkedList;

import java.util.HashMap;

public class Q_1 {

	public static Node head;
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
	
	static void removedups()
	{
		//return head;
		
		HashMap<Integer, Integer> hash = new HashMap<Integer,Integer>();
		
		Node current = head;
		
		Node previous = head;
		
		while(current!=null)
		{
			if(hash.get(current.data) != null)
			{
				if(current == head)
				{
					head = current.next;
					current = head;
					previous = head;
				} 
				else 
				{
					previous.next = current.next;
					current = current.next;
				}
			}
			else
			{
				hash.put(current.data, 1);
				previous = current;
				current = current.next;
			}
		}
		
	}
	
	static void print()
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
		Q_1 ll = new Q_1();
		
		ll.head = new Node(1);
		ll.head.next = new Node(1);
		ll.head.next.next = new Node(3);
		ll.head.next.next.next = new Node(3);
		ll.removedups();
		
		ll.print();
		System.out.println("asfbsudifbiudsfbui");
	}

	
}
