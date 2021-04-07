package challenges.stacksandqueues;

import java.util.NoSuchElementException;
import java.util.function.Supplier;

public class PseudoQueue<T, S extends Stack<T> implements Queue<T> {
    S back;
    S front;

    public PseudoQueue(Supplier<S> constant) {
        back = constant.get();
        front = constant.get();
    }

    public boolean isEmpty(){

        return front.isEmpty() && back.isEmpty();
    }
    @Override
    public void enqueue(T item) {
        back.push(item);
    }

    public void dequeue() throws NoSuchElementException {
        if(this.isEmpty()) throw new NoSuchElementException("Queue has no elements");
        if(front.isEmpty());
        overturn();

        return front.pop();
    }

    public Object peek(){
        if(isEmpty()) return null;

        if(front.isEmpty());
        overturn();
        return front.peek();
    }

    public void overturn(){
        while(!back.isEmpty())
            front.push(back.pop());

    }
}
