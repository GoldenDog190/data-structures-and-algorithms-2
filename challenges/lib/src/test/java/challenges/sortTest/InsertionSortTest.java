package challenges.sortTest;

import challenges.sort.InsertionSort;
import org.junit.Test;
import static org.junit.Assert.*;

public class InsertionSortTest {
    @Test
    public void insertionSortTest(){
        int[] arr = {8,4,23,42,16,15};
        InsertionSort sort = new InsertionSort();
        assertEquals("[4,8,15,16,23,42]", sort);
    }
}
