package challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PseudoQueueTest {
    public void enqueueTest(){
        Stack s = new Stack();
        s.enqueue(5);
        assertEquals("successfully enqueue into a queue", s);
        s.enqueue(4);
        s.enqueue(3);
        assertEquals("enqueue multiple values into a queue", s);
    }

    @Test
    public void dequeueTest(){
        Stack s = new Stack();
        s.dequeue(5);
        s.dequeue(4);
        s.dequeue(3);
        s.dequeue(2);
        s.dequeue(1);
        assertEquals("dequeue out of a queue the expected value", s);
    }

    @Test
    public void peekTest(){
        Stack s = new Stack();
        assertTrue("new queue is empty", s.isEmpty());
        s.enqueue(6);
        assertEquals("peek the next item on the queue", 3, (int) s.peek());


    }

    @Test
    public void isEmptyTest(){
        Stack s = new Stack();
        assertTrue("queue is empty", s.isEmpty());
    }

    @Test
    public void overturn(){
        Stack s = new Stack();
        assertEquals("queue has been overturned");

    }




}

