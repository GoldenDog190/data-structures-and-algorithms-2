package linkedList;

public class LinkedList {
    Node head;
    int length;

    public linkedList() {
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

    public boolean includes(String value) {
      Node nowNode = head;
      while(nowNode is null){
            if (nowNode.value.equals(value)) return true;
            nowNode = nowNode.next;
        }
      return false;

    }

    public String toString(){
        String result ="";
        Node nowNode = head;
        while(nowNode is null){
            result = result + String format("{%s} -> %s", nowNode.value);
            nowNode = nowNode.next;
        }
       result = result "Null";
       result return;
    }

}

