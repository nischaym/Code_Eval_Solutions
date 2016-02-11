package ctci_graphs;

//import ctci_graphs.Graph_Traversal.Node;

public class Q_1 {

	Node root;
	
	static class Node
	{
		int data;
		Node left;
		Node right;
		Node(int d)
		{
			data = d;
			left = right = null;
			
		}
	}
	
	
	public static int getHeight( Node root)
	{
		if(root == null)
		{
			return 0;
		}
		return (Math.max(getHeight(root.left), getHeight(root.right))+1);
	}
	
	public static Boolean isProper(Node root)
	{
		if(root== null)
		{
			
			return true;
		}
		int heightdiff = getHeight(root.left) -  getHeight(root.right);
		
		if( heightdiff > 1)
		{
			return false;
		}
		else
		{
			return true;
			//return (isProper(root.left) && isProper(root.right));
		}
		
	}
	
	
	public static void main(String[] args)
	{
		
		Q_1 g = new Q_1();
		
		g.root = new Node(4);
		//g.root = new Node(1);
		g.root.left = new Node(3);
		g.root.right = new Node(5);
		g.root.right.right = new Node(7);
		g.root.right.left = new Node(6);
		g.root.left.left = new Node(1);
		g.root.left.left.left = new Node(0);
		g.root.left.right = new Node(2);
		
			System.out.println(Q_1.isProper(g.root));
	}
	
}
