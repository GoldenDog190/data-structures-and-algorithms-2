package challenges.tree;

import challenges.stacksandqueues.Node;
import challenges.stacksandqueues.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


public class Tree<T> {
//----------------Code Challenge 15--------------------------------
    challenges.tree.Node root;
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

    public void preOrder(){
        List<T> result = new ArrayList<>();
        Stack<T> stack = new Stack<>();
        if(root != null) stack.push((T) this.root);
        while(!stack.isEmpty()){
            Node<T> node = (Node<T>) stack.pop();
            result.add(node.value);
            if(node.left != null); stack.push(node.left);
            if(node.right != null); stack.push(node.right);
        }


//    private List<T> preOrderTree(Node<T> node, List<T> result){
//       if(node == null) return result;
//       result.add(node.value);
//       result.add(preOrderTree(node.left, result));
//       result.add(preOrderTree(node.right, result));
//       return result;
//    }
//
//    public void inOrder(){
//            return inOrderTree(this.root, new LinkedList<>());
//    }
//
//    private List<T> inOrderTree(Node<T> node, List<T> result){
//            if(node == null) return result;
//            result.add(node.value);
//            result.add(inOrderTree(node.left, result));
//            result.add(inOrderTree(node.right, result));
//            return result;
//        }
//
//    public void postOrder(){
//        return postOrderTree(this.root, new LinkedList<>());
//    }
//
//        private List<T> postOrderTree(Node<T> node, List<T> result){
//            if(node == null) return result;
//            result.add(node.value);
//            result.add(postOrderTree(node.left, result));
//            result.add(postOrderTree(node.right, result));
//            return result;
 }
 //-------------------------------------------------------------------------

    //-----------------Code Challenge 17--------------------------------------

    

    //------------------------------------------------------------------------

 // -------------------Code challenge 16 ----------------------------------

    public Integer breadthTraversalTwo(){
        Integer result = new Integer<>();
        Stack<T> stack = new Stack<>();
        if(root == null) {
            stack.push((T) this.root);
        }
        while(!stack.isEmpty()){
            Node<T> node = (Node<T>) stack.pop();
            result.add(node.value);
            if(node.left != null); stack.push((T) node.left);
            if(node.right != null); stack.push(node.right);
        }
        return result;

    }

    public int findMaximumValue(Node node){
        if(node == null)
            return Integer.MAX_VALUE;
        int result = (int) node.value;
        int resultOne = findMaximumValue(node.left);
        int resultTwo = findMaximumValue((node.right);
        if(resultOne > result)
            result = resultOne;
        if(resultTwo > result)
            return result;

        return result;
    }

    //-------------------------------------------------------------------------
}


