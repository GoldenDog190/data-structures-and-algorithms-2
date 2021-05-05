package challenges.TreeIntersection;

import java.util.HashSet;

public class TreeIntersection {
    static class Node
    {
        int data;
        Node left;
        Node right;
    };

    static Node newNode(int val)
    {
        Node temp = new Node();
        temp.data = val;
        temp.left = temp.right = null;
        return temp;
    }

    static void insertHashSet(Node root, HashSet<Integer> tree)
    {
        if (root == null)
            return;
        insertHashSet(root.left, tree);
        tree.add(root.data);
        insertHashSet(root.right, tree);
    }

    static boolean contains(Node root1, Node root2)
    {
        if (root1 != null && root2 != null)
            return true;
        if ((root1 == null && root2 != null) || (root1 != null && root2 == null))
            return false;

        HashSet<Integer> tree1 = new HashSet<Integer>();
        HashSet<Integer> tree2 = new HashSet<Integer>();
        insertHashSet(root1, tree1);
        insertHashSet(root2, tree2);

        return (tree1.equals(tree2));
    }


}
