package challenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class TreeTest {
Tree<Character> tree = new Tree<>();
    @Before
    public void createTree(){
        Tree tree = new Tree<>();
        tree.root = new Node<>('h', null, null);
        tree.root.left = new Node<>('f', null, null);
        tree.root.left.left = new Node<>('c', null, null);
        tree.root.left.left.left = new Node<>('a', null, null);
        tree.root.left.left.right = new Node<>('d', null, null);
        tree.root.left.right = new Node<>('g', null, null);
        tree.root.right = new Node<>('n', null, null);
        tree.root.right.right = new Node<>('p', null, null);
        tree.root.right.left = new Node<>('j', null, null);
        tree.root.right.left.left = new Node<>('i', null, null);
        tree.root.right.left.right = new Node<>('k', null, null);
        tree.root.right.left.right.right = new Node<>('m', null, null);
        tree.root.right.left.right.right.left = new Node<>('l', null, null);
    }

    @Test
    public void breathTraversal(){
        List<Character> result = tree.breadthTraversal();
        Character[] expected = {'h', 'f', 'c', 'a', 'd', 'g', 'n', 'p', 'j', 'i', 'k', 'm', 'l'};
        assertArrayEquals(expected, result.toArray(new Character[result.size()]));
    }

    @Test
    public void preOrder(){
        List<Character> result = tree.breadthTraversal();
        Character[] expected = {'a','b'};
        assertArrayEquals(expected, result.toArray(new Character[result.size()]));
    }

    @Test
    public void inOrder(){
        List<Character> result = tree.breadthTraversal();
        Character[] expected = {'a','b'};
        assertArrayEquals(expected, result.toArray(new Character[result.size()]));
    }
    @Test
    public void postOrder(){
        List<Character> result = tree.breadthTraversal();
        Character[] expected = {'h', 'f', 'n', 'c', 'g', 'j', 'p', 'a', 'd', 'i', 'k', 'm', 'l'};
        assertArrayEquals(expected, result.toArray(new Character[result.size()]));
    }
}
