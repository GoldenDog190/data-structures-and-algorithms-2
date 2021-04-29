package challenges.sortTest;

import challenges.sort.InsertionSort;
import challenges.sort.QuickSort;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class QuickSortTest {
    @Test
    public void quickSortTest(){
        int[] actual = {8,4,23,42,16,15};
        int[] expected = {4,8,15,16,23,42};
        QuickSort sort = new QuickSort();
        assertEquals("[4,8,15,16,23,42]", sort);
    }
}
