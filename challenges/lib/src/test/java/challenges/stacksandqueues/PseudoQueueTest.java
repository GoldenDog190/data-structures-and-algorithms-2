package challenges.stacksandqueues;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void dequeueAndEnqueueTest(){
        Queue<Integer> s = new PseudoQueue<Integer, Stack<Integer>>(Stack<Integer>);
        s.dequeue(1);
        assertEquals("dequeue pulls elements out of order", 1, (int) s.dequeue());
        s.dequeue(2);
        s.dequeue(3);
        assertEquals("dequeue pulls elements out of order", 2, (int) s.dequeue());
        s.dequeue(4);
        assertEquals("dequeue pulls elements out of order", 3, (int) s.dequeue());
        s.dequeue(5);
        assertEquals("dequeue pulls elements out of order", 4, (int) s.dequeue());
        assertEquals("dequeue pulls elements out of order", 5, (int) s.dequeue());
    }

    @Test
    public void peekTest(){
        Queue<Integer> s = new PseudoQueue<Integer, Stack<Integer>>(Stack<Integer>);
        assertTrue("new queue is null", s.isEmpty());
        s.enqueue(5);
        assertEquals("peek gets the front item on the queue", 5, (int) s.peek());
        s.enqueue(3);
        s.enqueue(4);
        assertEquals("peek gets the front item on the queue after adding a new item", 5, (int) s.peek());

    }

    @Test
    public void isEmptyTest(){
        Queue<Integer> s = new PseudoQueue<Integer, Stack<Integer>>(Stack<Integer>);
        assertThrows("queue is empty", NoSuchElementException.class, ()-> s.dequeue());
        s.enqueue(6);
        s.dequeue();
        assertThrows("empty queue is thrown",NoSuchElementException.class, ()-> s.dequeue());
    }

    @Test
    public void overturn(){
        Queue<Integer> s = new PseudoQueue<Integer, Stack<Integer>>(Stack<Integer>);
        assertEquals("queue has been overturned", s);

    }




}

