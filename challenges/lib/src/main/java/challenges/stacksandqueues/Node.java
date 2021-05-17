package challenges.stacksandqueues;

 public class Node<T> {
//  public T value;
//  public Node<T> next;
//
//  public Node(T value, Node<T> head) {
//  }

  public T value;
     public Node left;
    public T right;
  public Node<T> next;

  public Node(T value, T right, T left){
       this.value= value;
      this.right = right;
       this.left = (Node) left;
    }

  public Node(T value, Node<T> head) {
  }

  public Node(Object value, Object head) {
  }
 }
