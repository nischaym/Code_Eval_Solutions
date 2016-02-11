
package data_structures;

import java.util.LinkedList;
//import java.util.LinkedList;
import java.io.*;
import java.util.*;



/// this is not a completely correct implementation but still works as a generic example


public class DFS_Impl {

	private int V;
	
	LinkedList<Integer> adj[] ;//= new LinkedList<Integer>();
	
	DFS_Impl(int v)
	{
		V=v;
		adj = new LinkedList[v];
		for(int i=0;i<v;++i)
		{
			adj[i] = new LinkedList();
		}
	}
	
	void addEdge(int v, int w)
	{
		adj[v].add(w);
	}

	void DFSUtil(int v,boolean[] visited)
	{
		visited[v] = true;
		System.out.println(v+" ");
		
		Iterator<Integer> i = adj[v].iterator();
		
		while(i.hasNext())
		{
			int n = i.next();
			if(!visited[n])
			{
				DFSUtil(n, visited);
			}
		}
	}
	
	void DFS()
	{
		boolean[] visited = new boolean[V];
		
	      for (int i=0; i<V; ++i)
	            if (visited[i] == false)
	                DFSUtil(i, visited);
	}
	
	  public static void main(String args[])
	    {
		  DFS_Impl g = new DFS_Impl(4);
	 
	        g.addEdge(0, 1);
	        g.addEdge(0, 2);
	        g.addEdge(1, 2);
	        g.addEdge(2, 0);
	        g.addEdge(2, 3);
	        g.addEdge(3, 3);
	 
	        System.out.println("Following is Depth First Traversal "+
	                           "(starting from vertex 2)");
	 
	        g.DFS();
	    }
	
	
	
	
}
