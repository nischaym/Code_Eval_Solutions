package best_white;

public class Right_most_Node {

	
	Node head;
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		
		Node(int d)
		{
			data = d;
			left = null;
			right = null;
		}
	}
	
	
	 public static int rightmost(Node head)
	 {
		 Node n = head;
		 //Node Previous = null; 
		 while(n.right != null)
		 {
			 //Previous = n;
			 n = n.right;
			 rightmost(n);
			 
		 }
		 return n.data;
	 }
	
	
	
	public static void main(String[] args)
	{
		Right_most_Node t = new Right_most_Node();
		
		t.head = new Node(1);
		t.head.left = new Node(2);
		t.head.right = new Node(3);
		
		System.out.println(Right_most_Node.rightmost(t.head));
				
	}
}
