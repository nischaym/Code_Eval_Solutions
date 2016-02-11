package data_structures;

//import java.util.LinkedList;

public class Union_Inter_Of_Linked_List
{

	Node head;
	
	class Node
	{
		int data;
		Node next;
		
		Node(int t)
		{
			data = t;
			next = null;
		}
	}
	
	void getUnion(Node head1,Node head2)
	{
		Node head = null;
		Node t1 = head1, t2 = head2;
		
		while (t1.next != null)
		{
			push(t1.data);
			t1 = t1.next;
			
		}
		
		while (t2.next != null)
		{
			if(isPresent(head, t2.data));
			{
				push(t2.data);
			}
			t2 = t2.next;
		}
	}
		

	void printList()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	void getIntersection(Node head1, Node head2)
	{
		Node result = null;
		Node t1 = head1;
		
		while(t1 != null)
		{
			if(isPresent(head2,t1.data))
			{
				push(t1.data);
			}
			t1 = t1.next;
		}
	}
	
	void push (int t)
	{
		Node new_node = new Node(t);
		
		new_node.next = head;
		head = new_node;
	}
	
	
	static boolean isPresent(Node head, int data)
	{
		Node t = head;
		while(t != null)
		{
			if(t.data == data)
			{
				return true;
			}
			t = t.next;
		}
		return false;
	}

	
	public static void main(String args[])
    {
		Union_Inter_Of_Linked_List llist1 = new Union_Inter_Of_Linked_List();
		Union_Inter_Of_Linked_List llist2 = new Union_Inter_Of_Linked_List();
		Union_Inter_Of_Linked_List unin = new Union_Inter_Of_Linked_List();
		Union_Inter_Of_Linked_List intersecn = new Union_Inter_Of_Linked_List();
 
        /*create a linked lits 10->15->5->20 */
        llist1.push(20);
        llist1.push(4);
        llist1.push(15);
        llist1.push(10);
 
        /*create a linked lits 8->4->2->10 */
        llist2.push(10);
        llist2.push(2);
        llist2.push(4);
        llist2.push(8);
 
        intersecn.getIntersection(llist1.head, llist2.head);
        unin.getUnion(llist1.head, llist2.head);
 
        System.out.println("First List is");
        llist1.printList();
 
        System.out.println("Second List is");
        llist2.printList();
 
        System.out.println("Intersection List is");
        intersecn.printList();
 
        System.out.println("Union List is");
        unin.printList();
    }

}
