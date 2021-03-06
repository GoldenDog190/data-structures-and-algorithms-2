package challenges.sortTest;

import challenges.sort.MergeSort;
import org.junit.Test;

import static challenges.sort.MergeSort.*;
import static org.junit.Assert.assertEquals;

public class MergeSortTest {
    @Test
    public void mergeSortTest(){
        int[] actual = {8,4,23,42,16,15};
        int[] expected = {4,8,15,16,23,42};
        MergeSort.mergeSort(actual, actual.length);
        assertEquals(expected, actual);
    }
}
