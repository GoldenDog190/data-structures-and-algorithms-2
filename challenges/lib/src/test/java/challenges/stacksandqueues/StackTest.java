package challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StackTest {
//    Can successfully push onto a stack
//    Can successfully push multiple values onto a stack
//    Can successfully pop off the stack
//    Can successfully empty a stack after multiple pops
//    Can successfully peek the next item on the stack
//    Can successfully instantiate an empty stack
//    Calling pop or peek on empty stack raises exception
    @Test
    public void pushTest(){
        Stack s = new Stack();
        s.push(1);
        assertEquals("successfully pushed onto a stack", s);
        s.push(2);
        s.push(3);
        assertEquals("successfully pushed multiple values onto a stack", s);
    }

    @Test
    public void popTest(){
        Stack s = new Stack();
        s.pop(3);
        assertEquals("pop off the stack", s);
        s.pop(2);
        s.pop(1);
        assertEquals("empty a stack after multiple pops", s.isEmpty());
    }

    @Test
    public void peekTest(){
        Stack s = new Stack();
        assertTrue("new stack is empty", s.isEmpty());
        s.push(1);
        s.push(2);
        s.push(3);
        assertEquals("peek the next item on the stack", 3, (int) s.peek());
        s.pop(3);
        s.pop(2);
        s.pop(1);
        assertEquals("peek on empty stack raises exception", s.isEmpty());


    }

    @Test
    public void isEmptyTest(){
        Stack s = new Stack();
        assertTrue("stack is empty", s.isEmpty());
    }


}
