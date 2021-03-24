package challenges;

public class BinarySearch {
    public static int binarySearch(int[] array, int target){
        if(array.length == 0) return -1;
      int high = array.length-1;
      int low = 0;
      int mid = (high+low/2);

      while(high != low+1){
          if(array[mid] == target) return mid;
          if(array[mid] > target ) high = mid;
          if(array[mid] < target ) low = mid;

          mid = (high+low)/2;
      }

      if(array[low] == target) return low;
      if(array[high] == target) return high;

      return -1;
    }
}
