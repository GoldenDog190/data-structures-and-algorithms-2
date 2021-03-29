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

    // Code Challenge 6
    public void append(value){
      Node newNode =  newNode(newValue," null");
      newNode.append(5);
      assertEquals("tail value should be 5", newNode.nowNode.value);
    }

    public String insertBefore(value, newVal){
     if(newVal == this.head.value)  return newVal;
     nowNode = this.head;
     while(nowNode != null){
         if(nowNode.next.value == newValue) return true;
         newValue.next = new Node (newValue, nowNode.next);
         return newValue;
     } else {
         if(Node = nowNode.next) return "it did not insert before" ;
        }

    }

    public boolean insertAfter(value, newval){
      nowNode = this.head;
      while(nowNode != null && nowNode.value = value){
          nowNode = nowNode.next;
          if(nowNode == "null") return "it did not insert after";
          if(newNode == newNode(newValue, value.next));
          nowNode.next = newNode;
      }
       return newNode;
    }

}

