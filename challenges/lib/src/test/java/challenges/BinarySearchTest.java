package challenges;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BinarySearchTest {
    @Test public static void TestBinarySearchInArray() {
     int[] arr1 = {4, 8, 15, 16, 23, 42};
     int[] arr2 = {11, 22, 33, 44, 55, 66, 77};
     int[] arr3 = {1, 2, 3, 4, 5, 6, 7};

     assertEquals("index of 15 is 2", BinarySearch.binarySearch(arr1, 15),2);
     assertEquals("19 is not in the Array", BinarySearch.binarySearch(arr2, 90),-1);
     assertEquals("4 is not in the Array", BinarySearch.binarySearch(arr3, 4),-1);
     assertEquals(" index is 1 of 0", BinarySearch.binarySearch(arr1, 1),0);
     assertEquals("index is 7 of 6", BinarySearch.binarySearch(arr1, 7),6);
    }
     @Test public void testBinarySearch(){
         int[] arr4 = {};
         assertEquals("should return -1", -1, BinarySearch.binarySearch(arr4, 7));
     }


}
