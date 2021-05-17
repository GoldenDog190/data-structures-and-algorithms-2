package challenges.stacksandqueues;

import java.util.EmptyStackException;

public class Stack<T> {

      private Node<T> head;


    public void push(T value){
    head = new Node<T>(value, head);

    }

    public T pop(int i){
        if (head == null) throw new EmptyStackException();
            T result = head.value;
            head =head.next;
            return result;

    }

    public T peek(){
       if(head == null) throw new EmptyStackException();
           return head.value;

    }

    public boolean isEmpty(){
        if(head == null) return false;
        return true;
    }


}


