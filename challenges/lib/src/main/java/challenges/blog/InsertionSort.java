package challenges.blog;

public class InsertionSort {
    public void InsertionSort(int[] arr){

        int n = arr.length;
        for(int i = 1; i < n; ++i){
            int temp = arr[i];
            int j = i - 1;

            while(j>= 0 && temp > arr[j]){
                arr[j +1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = temp;
        }
    }
}
