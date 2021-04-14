package challenges.tree;

import com.google.common.collect.ImmutableList;
import org.junit.Before;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TreeTest {

    //--------------------Code Challenge 17------------------------------------
    Tree<Integer> tree = new Tree<>();
    @Before
    public void createTree(){
        Tree tree = new Tree<>();
        tree.root= new Node(2);
        tree.root.left= new Node(7);
        tree.root.right= new Node(5);
        tree.root.left.left= new Node(2);
        tree.root.left.right= new Node(6);
        tree.root.right.right= new Node(9);
        tree.root.left.right.left= new Node(5);
        tree.root.left.right.right= new Node(11);
        tree.root.right.right.left= new Node(4);
    }

    @Test
    public void levelOrder(){
        List<Integer> result = tree.breadthTraversal();
        Integer[] expected = {2,7,5,2,6,9,5,11,4};
        assertEquals(expected, result);
    }

    @Test
    public void height(){
        List<Integer> result = tree.breadthTraversal();
        Integer[] expected = {2,7,5,2,6,9,5,11,4};
        assertEquals(expected, result);
    }

    @Test
    public void printLevel(){
        List<Integer> result = tree.breadthTraversal();
        Integer[] expected = {2,7,5,2,6,9,5,11,4};
        assertEquals(expected, result);
    }

    //--------------------------------------------------------------------------


    // -------------------Code challenge 15 ----------------------------------
//Tree<Character> tree = new Tree<>();
//    @Before
//    public void createTree(){
//        Tree tree = new Tree<>();
//        tree.root = new Node<>('h', null, null);
//        tree.root.left = new Node<>('f', null, null);
//        tree.root.left.left = new Node<>('c', null, null);
//        tree.root.left.left.left = new Node<>('a', null, null);
//        tree.root.left.left.right = new Node<>('d', null, null);
//        tree.root.left.right = new Node<>('g', null, null);
//        tree.root.right = new Node<>('n', null, null);
//        tree.root.right.right = new Node<>('p', null, null);
//        tree.root.right.left = new Node<>('j', null, null);
//        tree.root.right.left.left = new Node<>('i', null, null);
//        tree.root.right.left.right = new Node<>('k', null, null);
//        tree.root.right.left.right.right = new Node<>('m', null, null);
//        tree.root.right.left.right.right.left = new Node<>('l', null, null);
//    }
//
//    @Test
//    public void breathTraversal(){
//        List<Character> result = tree.breadthTraversal();
//        Character[] expected = {'h', 'f', 'c', 'a', 'd', 'g', 'n', 'p', 'j', 'i', 'k', 'm', 'l'};
//        assertArrayEquals(expected, result.toArray(new Character[result.size()]));
//    }
//
//    @Test
//    public void preOrder(){
//        List<Character> result = tree.breadthTraversal();
//        Character[] expected = {'a','b'};
//        assertArrayEquals(expected, result.toArray(new Character[result.size()]));
//    }
//
//    @Test
//    public void inOrder(){
//        List<Character> result = tree.breadthTraversal();
//        Character[] expected = {'a','b'};
//        assertArrayEquals(expected, result.toArray(new Character[result.size()]));
//    }
//    @Test
//    public void postOrder(){
//        List<Character> result = tree.breadthTraversal();
//        Character[] expected = {'h', 'f', 'n', 'c', 'g', 'j', 'p', 'a', 'd', 'i', 'k', 'm', 'l'};
//        assertArrayEquals(expected, result.toArray(new Character[result.size()]));
//    }
//
//    // -------------------Code challenge 16 ----------------------------------
//
//    @Before
//    public void createTreeTwo(){
//        Tree tree = new Tree<>();
//        tree.root = new Node(2, null, null);
//        tree.root.left = new Node<Integer>(7, null, null);
//        tree.root.left.left = new Node<Integer>(2, null, null);
//        tree.root.left.right = new Node<Integer>(6, null, null);
//        tree.root.left.right.left = new Node<Integer>(5, null, null);
//        tree.root.left.right.right = new Node<Integer>(11, null, null);
//        tree.root.right = new Node<Integer>(5, null, null);
//        tree.root.right.right.right = new Node<Integer>(9, null, null);
//        tree.root.right.right.left = new Node<Integer>(4, null, null);
//    }
//
//
//    @Test
//    public void breathTraversalTwo(){
//        List result = tree.breadthTraversal();
//        Integer[] expected = {2, 7, 2, 6, 5, 2, 6, 5, 11, 5, 9, 4};
//        assertEquals(expected, result);
//    }
//
//    @Test
//    public void findMaximumValue(){
//        List result = tree.breadthTraversal();
//        Integer expected = 11;
//        assertEquals(expected, result);
//
//    }
//
//    //-------------------------------------------------------------------------
}
