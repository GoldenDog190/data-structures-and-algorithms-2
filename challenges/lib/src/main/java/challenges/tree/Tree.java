package challenges.tree;

import challenges.stacksandqueues.Node;
import challenges.stacksandqueues.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class Tree<T> {

    Node<T>root;
    private Queue<Object> queue;

    public List<T> breadthTraversal(){
       List<T> result = new LinkedList<>();
        Queue<Node<T>> queue = new Queue<>();
        if(root != null) queue.enqueue(this.root);
        while(!queue.isEmpty()){
            Node<T> node = (Node<T>) queue.dequeue();
            result.add(node.value);
            if(node.left != null); queue.enqueue(node.left);
            if(node.right != null); queue.enqueue(node.right);
        }
        return result;
    }

    public List<T> preOrder(){
        List<T> result = new ArrayList<>();
        Stack<T> stack = new Stack<>();
        if(root != null) stack.push((T) this.root);
        while(!stack.isEmpty()){
            Node<T> node = (Node<T>) stack.pop();
            result.add(node.value);
            if(node.left != null); stack.push(node.left);
            if(node.right != null); stack.push(node.right);
        }


    private List<T> preOrderTree(Node<T> node, List<T> result){
       if(node == null) return result;
       result.add(node.value);
       result.add(preOrderTree(node.left, result));
       result.add(preOrderTree(node.right, result));
       return result;
    }

    public void inOrder(){
            return inOrderTree(this.root, new LinkedList<>());
    }

    private List<T> inOrderTree(Node<T> node, List<T> result){
            if(node == null) return result;
            result.add(node.value);
            result.add(inOrderTree(node.left, result));
            result.add(inOrderTree(node.right, result));
            return result;
        }

    public void postOrder(){
        return postOrderTree(this.root, new LinkedList<>());
    }

        private List<T> postOrderTree(Node<T> node, List<T> result){
            if(node == null) return result;
            result.add(node.value);
            result.add(postOrderTree(node.left, result));
            result.add(postOrderTree(node.right, result));
            return result;
        }
}


