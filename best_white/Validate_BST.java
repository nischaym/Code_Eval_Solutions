package best_white;

public class Validate_BST {

	TreeNode root;
	 public static class TreeNode 
	 {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x)
		      { 
		    	  val = x; 
		      }
	  }

	    public static boolean isBST(TreeNode node) 
	    {
	        return (isBSTUtil(node,Integer.MIN_VALUE,Integer.MAX_VALUE));
	    }
	     
	    /* Returns true if the given tree is a BST and its 
	   values are >= min and <= max. */
	    static boolean isBSTUtil(TreeNode node, int min, int max)
	    {
	        /* an empty tree is BST */
	        if(node == null)
	            return true;
	         
	        /* false if this node violates the min/max constraints */
	        if(node.val < min || node.val > max)
	            return false;
	         
	        /* otherwise check the subtrees recursively
	        tightening the min/max constraints */
	        
	        return (isBSTUtil(node.left, min, node.val-1) &&  // Allow only distinct values
	        		isBSTUtil(node.right, node.val+1, max));  // Allow only distinct values 
	        
	    }
	    
	 public static void main(String[] args)
	 {
		 Validate_BST tree = new Validate_BST();
		 tree.root = new TreeNode(4);
		 tree.root.left = new TreeNode(3);
		 tree.root.right = new TreeNode(5);
		 System.out.println(Validate_BST.isBST(tree.root));
		 
	 }
}
