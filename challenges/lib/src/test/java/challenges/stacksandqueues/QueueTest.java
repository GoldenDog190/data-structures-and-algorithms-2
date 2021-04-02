package challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class QueueTest {
//    Can successfully enqueue into a queue
//    Can successfully enqueue multiple values into a queue
//    Can successfully dequeue out of a queue the expected value
//    Can successfully peek into a queue, seeing the expected value
//    Can successfully empty a queue after multiple dequeues
//    Can successfully instantiate an empty queue
//    Calling dequeue or peek on empty queue raises exception
    @Test
    public void enqueueTest(){
        Stack s = new Stack();
        s.enqueue(1);
        assertEquals("successfully enqueue into a queue", s);
        s.enqueue(2);
        s.enqueue(3);
        assertEquals("enqueue multiple values into a queue", s);
    }

    @Test
    public void dequeueTest(){
        Stack s = new Stack();
        s.dequeue(3);
        assertEquals("dequeue out of a queue the expected value", s);
        s.dequeue(2);
        s.dequeue(1);
        assertEquals("empty a queue after multiple dequeues", s);
    }

    @Test
    public void peekTest(){
        Stack s = new Stack();
        assertTrue("new queue is empty", s.isEmpty());
        s.enqueue(1);
        assertEquals("peek the next item on the queue", 3, (int) s.peek());
        s.dequeue(1);
        assertEquals("peek on empty stack raises exception", s.isEmpty());


    }

    @Test
    public void isEmptyTest(){
        Stack s = new Stack();
        assertTrue("queue is empty", s.isEmpty());
    }


}


