package challenges.TreeIntersection;

import java.util.HashMap;
import java.util.Stack;

public class TreeIntersection {
    // https://www.geeksforgeeks.org/print-common-nodes-in-two-binary-search-trees/
    // https://www.geeksforgeeks.org/hashmap-treemap-java/
    static class Node{
        int key;
        Node left, right;
    }

     static Node newNode(int value){
        Node temp = new Node();
        temp.key = value;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    static void commonValue(Node root1, Node root2){
        HashMap<Integer, Integer> hashMap1 = new HashMap<Integer, Integer>();
        HashMap<Integer,  Integer> hashMap2 = new HashMap<Integer, Integer>();

        while (true) {
            if (root1 != null){
                hashMap1.get(root1);
                root1 = root1.left;
            }
            else if (root2 != null){
                hashMap2.get(root2);
                root2 = root1.left;
            }
            else if (){

            }
        }
    }
}
