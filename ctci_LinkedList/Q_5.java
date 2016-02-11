package ctci_LinkedList;

public class Q_5 {

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
	
//	static void sum(Node head1, Node head2)
//	{
//		Node current1 = head1;
//		Node current2 = head2;
//		int num1 = 0;
//		int num2 = 0;
//		int count = 0;
//		while(current1 !=null)
//		{
//			num1 = (int) (num1 + current1.data * Math.pow(10, count));
//			count ++;
//			current1 = current1.next;
//		}
//		
//		count = 0;
//		while(current2 !=null)
//		{
//			num2 = (int) (num2 + current2.data * Math.pow(10, count));
//			count ++;
//			current2 = current2.next;
//		}
//		
//		System.out.println(num1+num2);
//	}

	static void sum(Node head1, Node head2)
	{
		Node current1 = head1;
		Node current2 = head2;
		int num1 = 0;
		int num2 = 0;
		int count = 0;
		while(current1 !=null)
		{
			//num1 = (int) (num1 + current1.data * Math.pow(10, count));
			count ++;
			current1 = current1.next;
		}
		count = count-1;
		while(head1 != null)
		{
			num1 = (int) (num1 + head1.data * Math.pow(10, count));
			count--;
			head1 = head1.next;
		}
		
		count = 0;
		while(current2 !=null)
		{
			count ++;
			current2 = current2.next;
		}

		count = count-1;
		while(head2 != null)
		{
			num2 = (int) (num2 + head2.data * Math.pow(10, count));
			count--;
			head2 = head2.next;
		}

		System.out.println(num1+num2);
	}

	
	
	public static void main(String[] args)
	{
		Q_5 ll = new Q_5();
		Q_5 ll1 = new Q_5();
		
		ll.head = new Node(7);
		ll.head.next = new Node(1);
		ll.head.next.next = new Node(6);
		
		ll1.head = new Node(5);
		ll1.head.next = new Node(9);
		ll1.head.next.next = new Node(2);
		
		Q_5.sum(ll.head,ll1.head);
		
	}
	
}
