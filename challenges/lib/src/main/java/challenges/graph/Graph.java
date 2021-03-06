package challenges.graph;


import javax.xml.soap.Node;
import java.util.*;

import static javax.swing.UIManager.get;

public class Graph<V, M> {

    int vertices;
    List<V> vertexes = new ArrayList<>();
    List<List<M>> matrix = new ArrayList<>();


    public V AddNode(V value) {
        if (vertexes.contains(value)) {
            List<M> addVertexes = new ArrayList<>();
            addVertexes.add(null);
            for (List<M> list : matrix) {
                list.add(null);
                addVertexes.add(null);
            }
            matrix.add(addVertexes);
            vertexes.add(value);
            return value;
        }

        return value;
    }

    public void AddEdge(V value1, V value2, M edge, boolean b) {
        int index1 = vertexes.indexOf(value1);
        int index2 = vertexes.indexOf(value2);
        matrix.get(index1).set(index2, edge);
        if (!b) matrix.get(index2).set(index1, edge);
    }

    public List<V> GetNodes(String s) {
        return vertexes;
    }

    public Set<V> GetNeighbors(V vert) {
        int index = vertexes.indexOf(vert);
        Set<V> result = new HashSet<>();
        for (int i = 0; i < vertexes.size(); i++) {
            if (matrix.get(index).get(i) == null) continue;
            result.add(vertexes.get(i));
        }
        return result;
    }

    public int Size(int i) {
        return vertexes.size();
    }

    public Graph(int vertices) {
        this.vertices = vertices;
        LinkedList[] adjacencylist = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjacencylist[i] = new LinkedList<>();
        }
    }

    public void GetEdge(String source, String destination, int weight) {
        if(vertexes.size() < 2 || destination.size() < 2) return;
        int weight = 0;
        for (int i = 0; i < vertices; i++) {
            LinkedList<Node> list = LinkedList(i);
            for (int j = 0; j < list.size(); j++) {
                Node<String> node = vertexes.get(j);
                if (node.weight.equals(destination.get(i)) && i < destination.size()-1){
                    Boolean hasNext = false;
                    for(int k = 0; k < destination.size(); k++){
                        if(node.destination.get(k).source.value.equals(get(i)) && node.destination.get(k).source.value.equals(get(j))){
                            cost += node.destination.get(k).weight;
                            hasNext = true;
                        }
                        if(node.destination.get(k).source.value.equals(get(i)) && node.destination.get(k).source.value.equals(get(j))){
                            cost += node.destination.get(k).weight;
                            hasNext = true;
                        }
                    }
                    if (hasNext == false && i != places.size()-1){
                        return;
                    }
                }
            }
        }
    }
}
}
