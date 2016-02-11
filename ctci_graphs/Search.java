package ctci_graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

import ctci_graphs.BinaryTree.Node;
//import data_structures.Bfs_For_Graph;

public class Search {

	private int V;
	private LinkedList<Integer> adj[];
	
	Search(int v) 
	{
		
		V=v;
		adj = new LinkedList[v];
		for(int i =0 ;i<v;++i)
		{
			adj[i] = new LinkedList<Integer>();
		}
	}
	
	
	void addEdge(int v,int num)
	{
		adj[v].add(num);
	}

	boolean reachable(int source , int end)
	{
		if (source == end)
		{
			return true;
		}
		
		Integer[] visited = new Integer[V];
		for(int i=0;i<visited.length;i++)
		{
			visited[i] = 0;
		}
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited[source] = 0;
		queue.add(source);
		//Integer n;
		while(!queue.isEmpty())
		{
			 source = queue.poll();
			 
			 System.out.print(source+ "");
			 ListIterator<Integer> i = adj[source].listIterator();

			 if(visited[source] != null)
			 {
				 while(i.hasNext())
				 {
					 Integer n = i.next();
					 System.out.println(n);
					 if( visited[n] != 1 )
					 {
						 if(n == end)
						 return true;
						 else
						 {
							 //visited[n] = 1;
							 visited[n] = 2;
							 queue.add(n);
						 }
					 }
					 else
					 {
//						 visited[n] = 2;
//						 queue.add(n);
					 }
				 } 
				 
			 }
			 visited[source] = 1;
		}
		
		return false; 
		
	}
	
	
	public static void main(String[] args)
	{
		Search g = new Search(4);
		
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(3, 3);
		g.addEdge(1, 2);
		
		System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");
		
		System.out.println(g.reachable(2,1));
	}


}
