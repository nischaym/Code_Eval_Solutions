package data_structures;

import java.util.LinkedList;
import java.io.*;
import java.util.*;

class Bfs_For_Graph {

	private int V;
	private LinkedList<Integer> adj[];
	
	Bfs_For_Graph(int v) {
		
		V=v;
		adj = new LinkedList[v];
		for(int i =0 ;i<v;++i)
		{
			adj[i] = new LinkedList();
		}
	}
	
	void addEdge(int v,int num)
	{
		adj[v].add(num);
	}
	
	void BFS (int source)
	{
		Boolean[] visited = new Boolean[V];
		
		for(int i=0;i<V;i++)
		{
			visited[i] = false;
		}
		
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		visited[source] = true;
		queue.add(source);
		
		while(queue.size() != 0)
		{
			//System.out.println("sfdsf");
			source = queue.poll();
			System.out.print(source+" ");
			
			Iterator<Integer> i = adj[source].listIterator();
			
			while(i.hasNext())
			{
				
				int n = i.next();
				//System.out.println(n);
				if(! visited[n])
				{
					visited[n] = true;
					queue.add(n);
				}
			}
		}
		
		
	}
	
	public static void main(String[] args)
	{
		Bfs_For_Graph g = new Bfs_For_Graph(4);
		
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(3, 3);
		g.addEdge(1, 2);
		
		System.out.println("Following is Breadth First Traversal "+
                "(starting from vertex 2)");
		
		g.BFS(2);

	}

	
	
	
}
