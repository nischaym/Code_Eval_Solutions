package best_white;

public class Reverse{

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
    

    public static Node makereverse(Node head)
    {

    	Node current = null;
        Node previous = null;
        Node future = null;
        current = head;
        
        while (current != null)
        {
            future = current.next;
            current.next = previous;
            
            previous = current;
            
            current = future;
        }
        
        head = previous;
        return head;
    }
    
    public static void print(Node head)
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
    
        Reverse r = new Reverse();
        
        r.head = new Node(1);
        r.head.next = new Node(2);
        r.head.next.next = new Node(3);
        r.head.next.next.next = new Node(4);
        r.head.next.next.next.next = new Node(5); 
        
        Reverse.print(r.head);
        System.out.println(" ****** ++ ****** ");
        Node a = Reverse.makereverse(r.head);
        Reverse.print(a);
    }
    
    
    

}