package challenges.linkedList;

import javax.xml.soap.Node;

import static java.lang.String.format;

// Code Challenge 5
public class LinkedList {
    Node head;
    //Node tail;
    int length;
    private Object is;

    public void linkedList() {
        length = 0;
    }

    public void insert(String value) {
        Node newNode = new Node(value);
        length++;

        if(head == null){
            head = new Node(value);
            return;
        }
        newNode.next = head;
        head = newNode;
        return;
    }

    // Code Challenge 6 ------------------------------------------------------
    public void append(Iterable<value> items){
       for(value item: items) insert (item);
    }

    public String insertBefore(value find, value item){
        if (head == null) return "Value doesn't exist in this list.";
        if (head.item.equals(find)) {
            insert(item);
            return null;
        }
        Node<value> node = head;
        while (node.next != null && !node.next.item.equals(find)) node = node.next;
        if (node.next == null) return "Value doesn't exist in this list.";

        node.next = new Node<>(item, node.next);
        value++;
        return null;
    }

    public void insertAfter(value find, value item){
        Node<value> node = head;
        while (node != null && !node.item.equals(find)) node = node.next;
        if (node == null) return "Element does not exist in list.";

        assert (node.item == find);
        node.next = new Node<>(item, node.next);
        if (node == head) {
            head = node.next;
        }
        value++;
        }

//------------------------------------------------

    public boolean includes(String value) {
      Node nowNode = head;
      while(nowNode == null){
            if (nowNode.value.equals(value)) return true;
            nowNode = nowNode.next;
        }
      return false;

    }

    public String toString(){
        String result ="";
        Node nowNode = head;
        while(nowNode == null){
            result = result + String format("{%s} -> %s", nowNode.value);
            nowNode = nowNode.next;
        }
       result = result +4 "Null";
        return result;
    }


}

