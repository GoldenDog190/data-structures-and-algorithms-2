package challenges.tree;

import java.util.LinkedList;
import java.util.List;


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
            if (node == null) return result;
            result.add(node.value);
            result.add(postOrderTree(node.left, result));
            result.add(postOrderTree(node.right, result));
            return result;
            //-------------------------------------------------------------------------
        }

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

        
        //-----------------Code Challenge 17--------------------------------------
        // https://www.geeksforgeeks.org/level-order-tree-traversal/
        Node<T> root;

        public List<Integer> breadthTraversal(){
            root = null;
            return null;
        }

        public void levelOrder(){
            int h = height(root);
            int i;
            for(i = 1; i <= h; i++) printLevel(root, i);
        }


        int height(Node root){

            if(root == null) return 0;
            else{
                int h1 = height(root.left);
                int h2 = height(root.left);
                if(h1 > h2) return (h1 + 1);
                else return (h2 + 1);
            }

        }

        private void printLevel(Node<T> root, int level) {
            if(root == null) return;
            if(level == 1)
                System.out.println(root.value + "");
            else if(level > 1){
                printLevel(root.left, level-1);
                printLevel(root.right, level-1);

            }
        }

        //------------------------------------------------------------------------
    }
    }


