package challenges.DepthFirst;

import java.util.Iterator;
import java.util.LinkedList;

public class DepthFirst {
    int vertices;
    LinkedList<String> adj[];

    public void Graph(int v){
        vertices = v;
        adj = new LinkedList[Integer.parseInt(String.valueOf(v))];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    public void addEdge(String v, String e){
        adj[Integer.parseInt(v)].add(e);
    }

    public void DepthFirstUtil(String v, boolean visited[]){
        visited[Integer.parseInt(v)] = true;
        Iterator<String> i = adj[Integer.parseInt(v)].listIterator();
        while (i.hasNext())
        {
            String n = i.next();
            if (!visited[Integer.parseInt(n)])
                DepthFirstUtil(n, visited);
        }

    }

    public void DepthFirstTraversal(String v){
        boolean[] visited = new boolean[vertices];
        DepthFirstUtil(v, visited);
    }


}
