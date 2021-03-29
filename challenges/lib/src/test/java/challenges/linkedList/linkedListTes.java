package challenges.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;


public class LinkedListTest {

// Code Challenge 5
    @Test
    public void listEmptyTest(){
        linkedList l = new LinkedList<Integer>();
        assertEquals("new linked list is empty", l.isEmpty());
    }

    @Test public void listTestInsert(){
      linkedList l = new LinkedList<Integer>();
      l.insert("1");
      l.insert("2");
      assertTrue("contains first list", l.includes("1"));
      assertFalse("Linked list with element is empty", l.isEmpty("3"));
      assertEquals("should be empty", 2, l.length);
    }

    @Test public void linkedTestHead(){
       linkedList l = new LinkedList();
       l.insert("a");
       assertEquals("head value now a");
        l.insert("b");
        assertEquals("head value now b");
        l.insert("c");
        assertEquals("head value now c");

    }

    @Test public void linkListToString(){
        challenges.linkedList = new linkedList();
        l.insert("a");
        l.insert("b");
        l.insert("c");
        String expected = "{ a } -> { b } -> { c } -> NULL"

    }
    // Code Challenge 6
    @Test public void appendTest(){
         linkedList l = new LinkedList();
         
    }

    @Test public void insertBefore(){
        linkedList l = new LinkedList();
    }

    @Test public void insertAfter(){
        linkedList l = new LinkedList();

    }
}