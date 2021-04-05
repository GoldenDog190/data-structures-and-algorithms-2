package challenges.stacksandqueues;

import java.util.NoSuchElementException;

public class PseudoQueue<T> {
    Node<T> back;
    Node<T> front;

    public PseudoQueue(Node<T> back, Node<T> front) {
        this.back = back;
        this.front = front;
    }

    public boolean isEmpty(){

        if(front == null && back == null) return false;
        return true;
    }

    public void enqueue(Object item) {
        back.push(item);
    }

    public void dequeue() throws NoSuchElementException {
        if(this.isEmpty()) throw new NoSuchElementException();
        if(front.isEmpty());
        overturn();

        return front.push();
    }

    public Object peek(item){
        if(this.isEmpty());
        return null;
        if(front.isEmpty());
        overturn();
    }

    public void overturn(){
        while(back.isEmpty() != null);
            front.push(back.pop());

    }
}
