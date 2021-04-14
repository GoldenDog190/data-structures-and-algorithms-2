package challenges.utilities;

import challenges.tree.Node;
import challenges.tree.Tree;
import com.sun.org.apache.xpath.internal.operations.String;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class FizzBuzzTreeTest {

//    If the value is divisible by 3, replace the value with “Fizz”
//    If the value is divisible by 5, replace the value with “Buzz”
//    If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
//    If the value is not divisible by 3 or 5, simply turn the number into a String.

    Tree<String> tree = new Tree<>();
    @Before
    public void createTree(){
        Tree tree = new Tree<>();
        tree.root = new Node<>('5');
        tree.root.left = new Node<>('15');
        tree.root.left.left = new Node<>('30');
        tree.root.left.left.left = new Node<>('60');
        tree.root.left.left.right = new Node<>('75');
        tree.root.right = new Node<>('9');
        tree.root.right.right = new Node<>('45');
        tree.root.right.left = new Node<>('60');
    }

    @Test
    public void breathTraversal(){
        List<String> result = tree.breadthTraversal();
        Character[] expected = {'5', '15', '30', '60', '75', '9', '45', '60'};
        assertArrayEquals(expected, result.toArray(new String[result.size()]));
    }

    Tree<String> treeNew = new Tree<>();
    @Before
    public void createNewTreeFizzBuzz(){
        Tree treeNew = new Tree<>();
        treeNew.root = new Node<>('Buzz');
        treeNew.root.left = new Node<>('FizzBuzz');
        treeNew.root.left.left = new Node<>('FizzBuzz');
        treeNew.root.left.left.left = new Node<>('FizzBuzz');
        treeNew.root.left.left.right = new Node<>('FizzBuzz');
        treeNew.root.right = new Node<>('Fizz');
        treeNew.root.right.right = new Node<>('FizzBuzz');
        treeNew.root.right.left = new Node<>('FizzBuzz');
    }

    @Test
    public void newTreeFizzBuzz(){
        List<String> result = treeNew.breadthTraversal();
        Character[] expected = {'Buzz', 'FizzBuzz', 'FizzBuzz', 'FizzBuzz', 'FizzBuzz', 'Fizz', 'FizzBuzz', 'FizzBuzz'};
        assertArrayEquals(expected, result.toArray(new String[result.size()]));
    }

}
