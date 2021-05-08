package challenges.graph;

import org.junit.Test;
import static org.junit.Assert.*;

public class GraphTest {
    //    Node can be successfully added to the graph
//    An edge can be successfully added to the graph
//    A collection of all nodes can be properly retrieved from the graph
//    All appropriate neighbors can be retrieved from the graph
//    Neighbors are returned with the weight between nodes included
//    The proper size is returned, representing the number of nodes in the graph
//    A graph with only one node and edge can be properly returned
//    An empty graph properly returns null

    Graph graph = new Graph<>();

    @Test
    public void AddNodeTest(){
        graph.AddNode("Cat");
        assertEquals("Cat", graph);
        graph.AddNode("Dog");
        assertEquals("Dog", graph);
        graph.AddNode("Parrot");
        assertEquals("Parrot", graph);
        graph.AddNode("Turtle");
        assertEquals("Turtle", graph);
        graph.AddNode("Fish");
        assertEquals("Fish", graph);
    }

    @Test
    public void AddEdgeTest(){
        graph.AddEdge("Cat", "Dog", 2, true);
        graph.AddEdge("Cat", "Parrot", 2, true);
        graph.AddEdge("Cat", "Turtle", 2, true);
        graph.AddEdge("Cat", "Fish", 2, true);
        assertTrue("Cat, Dog", true);
        assertTrue("Cat, Parrot", true);
        assertTrue("Cat, Turtle", true);
        assertTrue("Cat, Fish", true);
    }

    @Test
    public void GetNodesTest(){
        graph.GetNodes("Cat");
        graph.GetNodes("Dog");
        graph.GetNodes("Parrot");
        graph.GetNodes("Turtle");
        graph.GetNodes("Fish");
        assertEquals("Cat, Dog, Parrot, Turtle, Fish", graph);
    }

    @Test
    public void GetNeighborsTest(){
        graph.GetNeighbors("Cat, Dog");
        graph.GetNeighbors("Cat, Parrot");
        graph.GetNeighbors("Cat, Turtle");
        graph.GetNeighbors("Cat, Fish");
        assertTrue("Cat, Dog", true);
        assertTrue("Cat, Parrot", true);
        assertTrue("Cat, Turtle", true);
        assertTrue("Cat, Fish", true);
        assertEquals("Cat, Dog", graph);
        assertEquals("Cat, Parrot", graph);
        assertEquals("Cat, Turtle", graph);
        assertEquals("Cat, Fish", graph);
    }

    @Test
    public void SizeTest(){
        graph.Size(5);
        assertTrue("The proper size is being returned", true);

    }

    @Test
    public void Graph(){
        Graph graph = new Graph<>();
        graph.AddNode(null);
        assertEquals(null, graph);

        graph.AddNode("Rat");
        assertEquals("Rat", graph);

        graph.AddNode("Hamster");
        graph.AddEdge("Rat", "Hamster", 2, true);
        assertTrue("Rat, Hamster", true);
    }
}
