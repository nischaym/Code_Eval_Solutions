package ctci_graphs;

public class Tree_Traversal {

	static class Node 
	{
		int data;
		Node left,right;
		
		Node (int d)
		{
			data = d;
			left=right =null;
		}
	}
	
	Node root;
	
	Tree_Traversal() {
		root = null;
	}
	
	
	void printPostOrder(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		printPostOrder(root.left);
		printPostOrder(root.right);
		
		System.out.print(root.data+ " ");
	}
	

	void printPreOrder(Node root)
	{
		if(root == null)
		{
			return;
		}
		System.out.print(root.data+ " ");
		
		printPreOrder(root.left);
		
		printPreOrder(root.right);
		
		
	}
	
	void printInOrder(Node root)
	{
		if(root == null)
		{
			return;
		}
		
		
		printInOrder(root.left);
		
		System.out.print(root.data+ " ");
		
		printInOrder(root.right);
		
		
	}
	public static void main(String[] args)
	{
		Tree_Traversal g = new Tree_Traversal();
		g.root = new Node(1);
		g.root.left = new Node(2);
		g.root.right = new Node(3);
		g.root.left.left = new Node(4);
		g.root.left.right = new Node(5);
		g.printPostOrder(g.root);
		System.out.println(" ");
		g.printPreOrder(g.root);

		System.out.println(" ");
		g.printInOrder(g.root);
	}
	
	
}
