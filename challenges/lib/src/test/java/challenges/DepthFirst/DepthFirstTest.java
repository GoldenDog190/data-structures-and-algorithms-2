package challenges.DepthFirst;

import challenges.graph.Graph;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class DepthFirstTest {


    @Test
    public void Graph(){
        Graph graph1 = new Graph<>();
        graph1.AddNode("A");
        assertEquals("A", graph1);
        graph1.AddNode("B");
        assertEquals("B", graph1);
        graph1.AddNode("C");
        assertEquals("C", graph1);
        graph1.AddNode("G");
        assertEquals("G", graph1);
        graph1.AddNode("D");
        assertEquals("D", graph1);
        graph1.AddNode("E");
        assertEquals("E", graph1);
        graph1.AddNode("H");
        assertEquals("H", graph1);
        graph1.AddNode("F");
        assertEquals("F", graph1);

    }

    @Test
    public void edgeTest(){
        DepthFirst graph = new DepthFirst();
        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.addEdge("C", "G");
        graph.addEdge("G", "D");
        graph.addEdge("D", "E");
        graph.addEdge("E", "H");
        graph.addEdge("H", "F");
        assertTrue("A, B", true);
        assertTrue("B, C", true);
        assertTrue("C, G", true);
        assertTrue("G, D", true);
        assertTrue("D, E", true);
        assertTrue("E, H", true);
        assertTrue("H, F", true);
    }

    @Test
    public void DepthFirstTraversal(){
        DepthFirst graph = new DepthFirst();
        graph.DepthFirstTraversal("A");
        graph.DepthFirstTraversal("B");
        graph.DepthFirstTraversal("C");
        graph.DepthFirstTraversal("G");
        graph.DepthFirstTraversal("D");
        graph.DepthFirstTraversal("E");
        graph.DepthFirstTraversal("H");
        graph.DepthFirstTraversal("F");
        assertEquals("A, B, C, G, D, E, H, F", graph);
    }
}
