package ex5;
import java.io.*;
import java.util.*;
 

class Graph
{
    private int V;  
 
    private LinkedList<Integer> adj[];

    Graph(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w)
    {
        adj[v].add(w); 
        adj[w].add(v); 
 
    }
   static  Vector<Integer> prevs =  new Vector<Integer>();
    void DFSUtil(int v,boolean visited[])
    {

        visited[v] = true;
      System.out.print(v+" ");
        prevs.add(v);	

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n]) {
                DFSUtil(n, visited);
              
            }
            else {
            	
            	if(n!=prevs.get(prevs.size()-2)) {
            	 System.out.print("Cycle found ");
            	 System.exit(0);
            	}
            }       
        }

    }

    public static void main(String args[])
    {
        Graph g = new Graph(6);
 
        g.addEdge(1, 2);
        g.addEdge(2, 5);
        g.addEdge(5, 4);
        g.addEdge(1, 4);
        g.addEdge(1, 3);
   
        boolean visited[] = new boolean[6];

        g.DFSUtil(4, visited);

    }
}