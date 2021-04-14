package challenges.utilities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FizzBuzzTree {

    Node root;

    class Node {
        String value;
        Node left;
        Node right;

        Node(String value) {
            this.value = value;
            right = null;
            left = null;
        }
    }

    public List treeOne(Node current, String value){
        List result =new ArrayList();
        Stack stack = new Stack();
        if (root != null) stack.push(this.root);
        while(!stack.isEmpty()){
            Node node = (Node) stack.pop();
            result.add(node.value);
            if(node.left != null); stack.push(node.left);
            if(node.right != null); stack.push(node.right);
        }
        return result;
    }

    public List order(String value){
        return treeOne(this.root, new String(value));
    }

    public Serializable switchValues(Node current, int value){
        if(current == null){
            return null;
        }

        if(value == value/3){ return "Fizz";}

        if(value == value/5){ return "Buzz";}

        if(!(!(value == value / 5) && !(value == value / 3))){ return "FizzBuzz";

        } else {
            if((value == value/5) || (value ==value/3)) return current.value;
        }
        return value;
    }



}
