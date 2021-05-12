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
    public void AddEdge(){
        graph.AddEdge("Pandora", "Arendelle",2, true);
        graph.AddEdge("Pandora", "Metroville", 2, true);
        graph.AddEdge("Arendelle", "Metroville", 2, true);
        graph.AddEdge("Arendelle", "Monstroplolis", 2, true);
        graph.AddEdge("Monstroplolis", "Naboo", 2, true);
        graph.AddEdge("Metroville", "Monstroplolis",2 , true);
        graph.AddEdge("Metroville", "Naboo",2 , true);
        graph.AddEdge("Metroville", "Arendelle",2 , true);
        graph.AddEdge("Metroville", "Narnia",2 , true);
        graph.AddEdge("Narnia", "Naboo", 2, true);
        graph.AddEdge("Naboo", "Monstroplolis", 2, true);
        assertTrue("Pandora, Arendelle", true);
        assertTrue("Pandora, Metroville", true);
        assertTrue("Arendelle, Metroville", true);
        assertTrue("Arendelle, Monstroplolis", true);
        assertTrue("Monstroplolis, Naboo", true);
        assertTrue("Metroville, Monstroplolis", true);
        assertTrue("Metroville, Naboo", true);
        assertTrue("Metroville, Arendelle", true);
        assertTrue("Metroville, Narnia", true);
        assertTrue("Narnia, Naboo", true);
        assertTrue(" Naboo, Monstroplolis", true);

    }

    @Test
    public void GetEdge(){
        graph.GetEdge("Pandora", "Metroville", 82);
        graph.GetEdge("Arendelle", "Metroville", 99);
        graph.GetEdge("Arendelle", "Monstroplolis", 42);
        graph.GetEdge("Monstroplolis", "Naboo", 73);
        graph.GetEdge("Metroville", "Monstroplolis",105);
        graph.GetEdge("Metroville", "Naboo",26);
        graph.GetEdge("Metroville", "Arendelle",99);
        graph.GetEdge("Metroville", "Narnia",37);
        graph.GetEdge("Narnia", "Naboo", 250);
        graph.GetEdge("Naboo", "Monstroplolis", 250);
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
