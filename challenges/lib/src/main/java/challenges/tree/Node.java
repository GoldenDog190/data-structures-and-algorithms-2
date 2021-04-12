package challenges.tree;

public class Node<T> {

    private T value;
    Node<T> left;
    Node<T> right;

    public Node( Node<T> value, Node<T> left, Node<T> right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(T value) {

    }

    public Node(int i, Object left, Object right) {
    }

}
