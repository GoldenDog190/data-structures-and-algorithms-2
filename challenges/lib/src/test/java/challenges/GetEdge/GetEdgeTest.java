package challenges.GetEdge;

import challenges.graph.Graph;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GetEdgeTest {
    int vertices = 6;
    Graph graph = new Graph<>(vertices);

    @Test
    public void Graph() {
        graph.AddNode("Pandora");
        assertEquals("Pandora", graph);
        graph.AddNode("Arendelle");
        assertEquals("Arendelle", graph);
        graph.AddNode("Metroville");
        assertEquals("Metroville", graph);
        graph.AddNode("Monstroplolis");
        assertEquals("Monstroplolis", graph);
        graph.AddNode("Narnia");
        assertEquals("Narnia", graph);
        graph.AddNode("Naboo");
        assertEquals("Naboo", graph);

    }

    @Test
    public void addEdge(){
        graph.AddEdge("Pandora", "Arendelle",150, true);
        graph.AddEdge("Pandora", "Metroville", 82, true);
        graph.AddEdge("Arendelle", "Metroville", 99, true);
        graph.AddEdge("Arendelle", "Monstroplolis", 42, true);
        graph.AddEdge("Monstroplolis", "Naboo", 73, true);
        graph.AddEdge("Metroville", "Monstroplolis",105 , true);
        graph.AddEdge("Metroville", "Naboo",26 , true);
        graph.AddEdge("Metroville", "Arendelle",99 , true);
        graph.AddEdge("Metroville", "Narnia",37 , true);
        graph.AddEdge("Narnia", "Naboo", 250, true);
        graph.AddEdge("Naboo", "Monstroplolis", 250, true);
        assertTrue("Pandora, Arendelle, 150", true);
        assertTrue("Pandora, Metroville, 82", true);
        assertTrue("Arendelle, Metroville, 99", true);
        assertTrue("Arendelle, Monstroplolis, 42", true);
        assertTrue("Monstroplolis, Naboo, 73", true);
        assertTrue("Metroville, Monstroplolis, 105", true);
        assertTrue("Metroville, Naboo, 26", true);
        assertTrue("Metroville, Arendelle, 99", true);
        assertTrue("Metroville, Narnia, 37", true);
        assertTrue("Narnia, Naboo, 250", true);
        assertTrue(" Naboo, Monstroplolis, 250", true);

    }

}
