package challenges.tree;

public class BinarySearchTree<T> extends Tree<T> {

    public void add(T value, Node<T> root) {
        if (this.root == null) {
            this.root = new challenges.stacksandqueues.Node<>(value);
            return;
        }
        add(value, this.root);
    }

    private void add(char c){
        if(root.value.compareTo(value) > 0){
            if(node.right == null){
                node.right = new Node<>(value);
                return;
            }
            add(value, node.right);
            return;
        } if(node.left ==null){
            node.left = new Node<>(value);
            return;;
        }
        add(root.value, node.left);
        return;
    }
    public boolean contains(T value){
        Node<T> node =this.root;
        while(node != null){
            if(node.value == value) return true;
            if(node.value.comparedto(value) < 0){
                node = node.right;
                continue;
            }
            node =node.left;
        }
        return false;
    }

}
