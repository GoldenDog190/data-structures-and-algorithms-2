package linkedList;

import org.junit.Test;

import org.junit.Assert.*;



public class LinkedListTest {

    @Test
    public void listEmptyTest(){
        linkedList l = new LinkedList<Integer>();
        assertEquals("new linked list is empty", l.isEmpty());
    }

    @Test public void listTestInsert(){
      linkedList l = new LinkedList<Integer>();
      l.insert("1");
      l.insert("2");
      assertTrue("contains first list", ll.includes("1"));
      assertFalse("Linked list with element is empty", l.isEmpty("3"));
      assertEquals("should be empty", 2, ll.length);
    }

    @Test public void linkedTestHead(){
       linkedList ll = new LinkedList();
       l.insert("a");
       assertEquals("head value now a");
        l.insert("b");
        assertEquals("head value now b");
        l.insert("c");
        assertEquals("head value now c");

    }

    @Test public void linkListToString(){
        linkedList = new linkedList();
        l.insert("a");
        l.insert("b");
        l.insert("c");
        String expected = "{ a } -> { b } -> { c } -> NULL"

    }
}