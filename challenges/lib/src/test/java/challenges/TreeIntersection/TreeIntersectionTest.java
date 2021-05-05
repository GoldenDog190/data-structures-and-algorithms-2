package challenges.TreeIntersection;

import challenges.tree.Node;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.HashSet;



public class TreeIntersectionTest {
    @Test
    public void contains(){

        HashSet<Integer> tree1 = new HashSet<Integer>();

        tree1.root= new Node(1);
        tree1.root.left= new Node(5);
        tree1.root.right= new Node(3);
        tree1.root.left.left= new Node(10);
        tree1.root.left.right= new Node(9);
        tree1.root.right.right= new Node(6);
        tree1.root.left.right.left= new Node(8);
        int[] expected1 = {1, 5, 3, 10, 9, 6, 8};
        assertEquals(expected1, tree1);

        HashSet<Integer> tree2 = new HashSet<Integer>();

        tree2.root= new Node(1);
        tree2.root.left= new Node(5);
        tree2.root.right= new Node(3);
        tree2.root.left.left= new Node(10);
        tree2.root.left.right= new Node(9);
        tree2.root.right.right= new Node(6);
        tree2.root.left.right.left= new Node(8);

        int[] expected2 = {1, 5, 3, 10, 9, 6, 8};
        assertEquals(expected2, tree2);

        assertEquals("Trees have same values", tree1, tree2);

    }

}
