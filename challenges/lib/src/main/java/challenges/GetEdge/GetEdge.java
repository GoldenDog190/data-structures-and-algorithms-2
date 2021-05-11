package challenges.GetEdge;

import org.apache.commons.math3.geometry.spherical.twod.Edge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GetEdge {
    String source;
    String destination;
    int weight;
    int vertices;
    LinkedList<Edge> [] adjacencyList;


    public void Edge(String source, String destination, int weight){
        this.source = source;
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

    public void AddEdge(String source, String destination, int weight){
        Edge edge = new Edge(source, destination, weight);
        adjacencyList[Integer.parseInt(source)].addFirst(edge);
    }

    public void GetEdge() {
        for (int i = 0; i < vertices; i++) {
            LinkedList<Edge> list = adjacencyList[i];
            for (int j = 0; j < list.size(); j++) {
            }
        }
    }
}
