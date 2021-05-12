package challenges.GetEdge;

import challenges.graph.Graph;
import org.apache.commons.math3.geometry.spherical.twod.Edge;

import javax.xml.soap.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static javax.swing.UIManager.get;

public class GetEdge {
    String source1;
    String source2;
    String destination;
    int weight;
    int vertices;
    LinkedList<Node> [] adjacencyList;


    public void Edge(String source1, String source2, String destination, int weight){
        this.source1 = source1;
        this.source1 = source2;
        this.destination = destination;
        this.weight = weight;
    }

    void Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    public void AddEdge(String source1, String source2, String destination, int weight){
       Edge edge = new Edge(source1, destination, weight);
        adjacencyList[Integer.parseInt(source1)].addFirst((Node) edge);
        adjacencyList[Integer.parseInt(source2)].addFirst((Node) edge);
    }

    public void GetEdge(String source1, String source2, String destination, int weight) {
        List<List<String>> nodes = graph.GetNodes();
        if(nodes.size() < 2 || places.size() < 2) return;
        int weight 0;
        for (int i = 0; i < vertices; i++) {
            LinkedList<Node> list = adjacencyList[i];
            for (int j = 0; j < list.size(); j++) {
                Node<String> node = nodes.get(j);
                if (node.weight.equals(places.get(i)) && i < places.size()-1){
                    Boolean hasNext = false;
                    for(int k = 0; k < destination.size(); k++){
                        if(node.destination.get(k).source1.value.equals(get(i)) && node.destination.get(k).source1.value.equals(get(j))){
                            cost += node.destination.get(k).weight;
                            hasNext = true;
                        }
                        if(node.destination.get(k).source2.value.equals(get(i)) && node.destination.get(k).source2.value.equals(get(j))){
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
