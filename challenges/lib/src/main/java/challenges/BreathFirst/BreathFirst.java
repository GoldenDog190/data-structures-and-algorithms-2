package challenges.BreathFirst;

import java.util.Iterator;
import java.util.LinkedList;

public class BreathFirst {
    // https://www.geeksforgeeks.org/breadth-first-search-or-bfs-for-a-graph/
    String vertices;
    LinkedList<String> list;

    public void Graph(String v){
        vertices = v;
        list = new LinkedList<>();
    }

    public void AddEdge(String v, String e){
        list.add(e);
    }

    public void BreathFirstTraversal(String s){
        boolean[] visited = new boolean[Integer.parseInt(vertices)];

        LinkedList<String> queue = new LinkedList<String>();
        visited[Integer.parseInt(s)] = true;
        queue.add(s);

        while(queue.size() != 0){
            s = queue.poll();
            Iterator<String> i = list.listIterator();

            while(i.hasNext()){
                String n = i.next();
                if (!visited[Integer.parseInt(n)]){
                    visited[Integer.parseInt(n)] = true;
                    queue.add(n);
                }
            }
        }
    }
}
