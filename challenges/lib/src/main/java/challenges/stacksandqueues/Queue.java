package challenges.stacksandqueues;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Queue<T> {
    Node<T> head;
    Node<T> tail;

    public void enqueue(Object value){
        if(head == null){
            head = new Node<T>( value, null);
            tail = head;
        } else {
            tail.next = new Node<T>(value, null);

        }
    }

    public Object dequeue() throws NoSuchElementException{
        if(head == null) throw new NoSuchElementException();
        T value = head.value;
        head = head.next;
        if(head == null) tail = null;
        return value;
    }

    public Object peek(){
        return head == null ? null : head.value;
    }

    public boolean isEmpty(){
        return head == null;
    }


}
