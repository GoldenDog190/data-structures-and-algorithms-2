package challenges.hashtable;

import org.junit.Test;
import static org.junit.Assert.*;

public class HashtableTest {

//    Adding a key/value to your hashtable results in the value being in the data structure
//    Retrieving based on a key returns the value stored
//    Successfully returns null for a key that does not exist in the hashtable
//    Successfully handle a collision within the hashtable
//    Successfully retrieve a value from a bucket within the hashtable that has a collision
//    Successfully hash a key to an in-range value

    @Test
    public void addTest(){
        Hashtable hashtable = new Hashtable();
        hashtable.add("Harry Potter", "1");
        hashtable.add("Scooby Doo", "2");
        hashtable.add("Jack Skellington", "3");

        assertTrue("Adding a key/value to your hashtable results in the value being in the data structure", hashtable.contains());
    }

    @Test
    public void getTest(){
        Hashtable hashtable = new Hashtable();
        hashtable.get("1");
        hashtable.get("2");
        hashtable.get("3");

        assertEquals("Retrieving based on a key returns the value stored", "1", hashtable.contains());
        assertEquals("Successfully returns null for a key that does not exist in the hashtable", "4",hashtable.contains());
    }

    @Test
    public void containsTest(){
        Hashtable hashtable = new Hashtable();
        hashtable.add("Zero", "3");
        hashtable.get("3");

        assertEquals("Successfully handle a collision within the hashtable", "3",hashtable.contains());
        assertEquals("Successfully retrieve a value from a bucket within the hashtable that has a collision", "3", hashtable.contains());
    }

    @Test
    public void hashTest(){
        Hashtable hashtable = new Hashtable();
        hashtable.add("Sherlock Holmes", "4");
        hashtable.get("4");
        hashtable.hash("'Sherlock Holmes', '4'");

        assertEquals("Successfully hash a key to an in-range value","'Sherlock Holmes', '4'" , hashtable.contains());
    }
}
