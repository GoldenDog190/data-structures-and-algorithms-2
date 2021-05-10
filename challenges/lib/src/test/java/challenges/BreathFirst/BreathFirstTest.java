package challenges.BreathFirst;

import challenges.graph.Graph;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BreathFirstTest {

    Graph graph = new Graph<>();

    @Test
    public void Graph(){
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
    public void edgeTest(){
        graph.AddEdge("Pandora", "Arendelle", 2, true);
        graph.AddEdge("Pandora", "Metroville", 2, true);
        graph.AddEdge("Pandora", "Monstroplolis", 2, true);
        graph.AddEdge("Pandora", "Narnia", 2, true);
        graph.AddEdge("Pandora", "Naboo", 2, true);
        assertTrue("Pandora, Arendelle", true);
        assertTrue("Arendelle, Metroville", true);
        assertTrue("Arendelle, Monstroplolis", true);
        assertTrue("Metroville, Narnia", true);
        assertTrue("Monstroplolis, Naboo", true);
    }

    @Test
    public void BreathFirstTraversal(){
        graph.GetNodes("Pandora");
        graph.GetNodes("Arendelle");
        graph.GetNodes("Metroville");
        graph.GetNodes("Monstroplolis");
        graph.GetNodes("Narnia");
        graph.GetNodes("Naboo");
        assertEquals("Pandora, Arendelle, Metroville, Monstroplolis, Narnia, Naboo", graph);
    }
}
