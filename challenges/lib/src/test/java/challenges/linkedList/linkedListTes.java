package challenges.linkedList;

import org.junit.Test;

import java.util.Arrays;

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
    // Code Challenge 6 -------------------------------------------
//    Can successfully add a node to the end of the linked list
//    Can successfully add multiple nodes to the end of a linked list
//    Can successfully insert a node before a node located i the middle of a linked list
//    Can successfully insert a node before the first node of a linked list
//    Can successfully insert after a node in the middle of the linked list
//    Can successfully insert a node after the last node of the linked list
    @Test public void appendTest(){
        linkedList<String> l = new LinkedList<>();
        Iterable range = Arrays.asList(1, 2, 3, 4, 5);
        l.append(range);
        for (int i = 1; i < 6; i++) {
            assertEquals("append the values in order", i);
        }
    }

    @Test public void insertBefore(){

        linkedList<String> l = new LinkedList<>();
        l.append(Arrays.asList(1, 3, 2, 5));
        l.insertBefore(1,5,3,2);
        assertTrue("insert a node before a node located i the middle of a linked list", 5, l.append());
        assertEquals("insert a node before the first node of a linked list", l.append();
        assertTrue(l.isEmpty());
    }

    @Test public void insertAfter(){
        linkedList<String> l = new LinkedList<>();
        l.append(Arrays.asList(1, 3, 2, 2, 5));
        assertTrue("insert after a node in the middle of the linked list", 6, l.append());
        assertEquals("insert a node after the last node of the linked list", 7, l.append();
        assertTrue(l.isEmpty());
    }
}