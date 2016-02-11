package leetCode;

import java.io.*;


public class Odd_Even_LL {
	
	ListNode head;
	  static public class ListNode 
	  {
		      int val;
		      ListNode next;
		      ListNode(int x) 
		      {
		    	  val = x; 
		    	  next = null;
		      }
		 }	
	
	
    public  static ListNode oddEvenList(ListNode head) 
    {
    	if(head == null)
    		return head;
    	
    	ListNode n = head;
    	ListNode odd = null;
    	ListNode even = null;
    	ListNode evenhead = null;
    	ListNode oddhead = null;
    	int i=0;
    	while(n != null)
    	{
    		i++;
    		if(i % 2 ==1)
    		{
    			if(odd ==null)
    			{
    				oddhead = n;
    				odd = n;
    			}
    			else
    			{
    				odd.next = n;
    				odd = odd.next;
    			}
    		}
    		else
    		{
       			if(even == null)
    			{
       				evenhead = n;
    				even = n;
    			}
    			else
    			{
    				even.next = n;
    				even = odd.next;
    			}
    		}
    		n= n.next;
    		
    	}
    	
    	even.next = null;
    	odd.next = evenhead;
    	return (oddhead);
    	
    }
    
    public static void print(ListNode head)
    {
    	if(head == null)
    		System.exit(0);
    	
    	while(head!= null)
    	{
    		System.out.println(head.val);
    		head = head.next;
    	}
    }
    
    public static void main(String[] args)
    {
    	Odd_Even_LL ll = new Odd_Even_LL();
    	
    	ll.head = new ListNode(1);
    	ll.head.next = new ListNode(2);
    	ll.head.next.next = new ListNode(3);
    	ll.head.next.next.next= new ListNode(4);
    	ll.head.next.next.next.next = new ListNode(5);
    	ll.head.next.next.next.next.next = new ListNode(6);
    	
    	ll.head.next.next.next.next.next.next = new ListNode(7);
    	ll.head.next.next.next.next.next.next.next = new ListNode(8);
    	
    	
    	Odd_Even_LL.print(oddEvenList(ll.head));
    	
    	
    }
    
    
}