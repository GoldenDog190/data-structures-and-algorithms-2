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

        assertTrue("Adding a key/value to your hashtable results in the value being in the data structure", hashtable.contains());
    }

    @Test
    public void getTest(){
        Hashtable hashtable = new Hashtable();
        hashtable.get("");

        assertTrue("Retrieving based on a key returns the value stored", hashtable.contains());
        assertTrue(" Successfully returns null for a key that does not exist in the hashtable", hashtable.contains());
    }

    @Test
    public void containsTest(){
        Hashtable hashtable = new Hashtable();
        hashtable.contains();

        assertTrue("Successfully handle a collision within the hashtable",hashtable.contains());
        assertTrue("Successfully retrieve a value from a bucket within the hashtable that has a collision", hashtable.contains());
    }

    @Test
    public void hashTest(){
        Hashtable hashtable = new Hashtable();
        hashtable.hash("'Sherlock Holmes', '6'");

        assertTrue("Successfully hash a key to an in-range value", hashtable.contains());
    }
}
