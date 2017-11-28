package ex1;
//mycut
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;
 
public class Cut {
	static int n;
	int m;
	 Vector<Integer> adj[];
	public Cut(int a) {
		n=a;
	  adj = new  Vector [a+1];
		for(int i=1;i<n;i++) {
			adj[i] = new  Vector<Integer>();
		}
	}
	
	void addEdge(int v,int w) {
		  adj[v].add(w);
	      adj[w].add(v); 
	}
	
	 @SuppressWarnings("unlikely-arg-type")
	Vector<Integer>[]  removedGraph(int a) {
		 Vector<Integer> adj1[]=adj.clone();

		for(int j=1;j<n;j++) {
			for(int i=0;i<adj1[j].size();i++) {
				if(adj1[j].get(i)==a) adj1[j].remove(i); 
			}
		}	
		adj1[a].clear();
		
		return adj1;
	}
	void printGraphEdjes( Vector<Integer> adj[]) {
	
	
		for(int j=1;j<adj.length;j++) {
			try {
		
			System.out.print("edge "+j+": ");
			if(!adj[j].isEmpty())
				for(Integer curI:adj[j]) {
					System.out.print(curI+ " ");
				}
			System.out.println();
			}catch(NullPointerException e) {
				
			}
		}
	} 
	static boolean[] visited =  new boolean[100];
	public void dfs(int a, Vector<Integer>[] adj1 ) {

        visited[a] = true;
     	

        Iterator<Integer> i = adj[a].iterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n]) {
                dfs(n, adj1);
              
            }
        }
	}
	public static void main(String[] args) {
		Cut graph = new Cut(6);
		graph.addEdge(4, 1);
		graph.addEdge(2, 1);
		graph.addEdge(3, 1);
		graph.addEdge(4, 5);
		graph.addEdge(5, 2);
		graph.addEdge(2, 3);
	//	graph.printGraphEdjes(graph.removedGraph(4));
		 Vector<Integer> cutpoints = new  Vector<Integer>();
		for(int i=2;i<n;i++) {
			for(int j =0;j<=n;j++) {
				visited[j]=false;
			}
			graph.dfs(1,graph.removedGraph(i));System.out.print(i+": ");
			for(int c=1;c<6;c++) {
				
				 System.out.print(c+"  "+visited[c]+"; ");
				
				}
			System.out.println();
			}
		/*	for(int v=1;v<n;++v) {	
				if(v!=i && visited[v]==false) {
				System.out.print(v+"  .");
					cutpoints.add(i);
				
				}
			}*/
			graph.dfs(1,graph.removedGraph(3));
for(int j=0;j<n;j++) {
	System.out.println(j+":"+visited[j]);
}
		}
	/*	for(Integer i: cutpoints) {
			System.out.print(" "+i);
		}*/
	
	}