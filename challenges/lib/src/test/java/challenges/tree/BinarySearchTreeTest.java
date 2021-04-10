package challenges.tree;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class BinarySearchTreeTest {

@Test
public void add(){
    BinarySearchTree<Character> binarySearchTree = new BinarySearchTree<>();

    binarySearchTree.add('a');
    binarySearchTree.add('d');
    binarySearchTree.add('c');
    binarySearchTree.add('g');
    binarySearchTree.add('f');
    binarySearchTree.add('i');
    binarySearchTree.add('l');
    binarySearchTree.add('m');
    binarySearchTree.add('k');
    binarySearchTree.add('j');
    binarySearchTree.add('p');
    binarySearchTree.add('n');
    binarySearchTree.add('h');

    List<Character> result = binarySearchTree.breadthTraversal();
    Character[] expected = {'h', 'f', 'c', 'a', 'd', 'g', 'n', 'p', 'j', 'i', 'k', 'm', 'l'};
    assertArrayEquals(expected, result.toArray(new Character[result.size()]));
}

@Test
public void contains(){
    BinarySearchTree<Character> binarySearchTree = new BinarySearchTree<>();

    binarySearchTree.add('a');
    binarySearchTree.add('d');
    binarySearchTree.add('c');

    assertTrue(binarySearchTree.contains('a'));
    assertTrue(binarySearchTree.contains('c'));
    assertTrue(binarySearchTree.contains('d'));
    assertTrue(binarySearchTree.contains('x'));
    assertTrue(binarySearchTree.contains('y'));
    assertTrue(binarySearchTree.contains('z'));


}

}
