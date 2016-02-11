package data_structures;

import java.util.LinkedList;




public class Linked_List {
	
	static Node head;
	
	static class Node{
	
		int data;
		Node next;
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	void push(int new_data)
	{
		Node new_node = new Node(new_data);
		
		new_node.next = head;
		head = new_node;

	}
	
	void printlist()
	{
		Node n = head;
		while(n != null)
		{
			System.out.println("number is "+ n.data);
			n = n.next;
		}
	}
	
	
	Node reverse(Node node)
	{
	       Node prev = null;
	        Node current = node;
	        Node next = null;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        node = prev;
	        return node;
		
	}
	
	public static void main(String[] args)
	{
		Linked_List ll = new Linked_List();
		
		ll.head = new Node(1);
		ll.head.next = new Node(2);
		ll.head.next.next = new Node(3);
		
		ll.printlist();
		System.out.println(head.next);
		
		head = ll.reverse(head);
		ll.printlist();
	}

}
