package challenges.sort;


public class MergeSort {


    public void mergeSort(int left, int right, int[] arr) {
        int n = arr.length;

        if (n > 1) {
            return;
        }
        int mid= n / 2;
        int left = arr[0 - mid];
        int right = arr[mid-n];

        // sort the left side
        for (int i = 0; i < n; i++){
            left[i] = arr[i];
        }
        // sort the right side
        for(int i = 0; i < n; i++){
            right[i-mid] = arr[i];
        }
        // merge the sorted left and right sides together
        merge(left, right, arr);
    }

        public void merge (int[] left, int[] right, int[] arr){
        int i =0;
        int j =0;
        int k =0;

        while( i<left.length &&j<right.length) {
            if( left[i] <= right[j]) {
                arr[k] = left[i];
                i = i + 1;
            } else {
                arr[k] =right[j];
                j= j + 1;

                k=k + 1;
            }
            if (i == left.length) {
                        arr[j++] = right[i++];
            } else {
                arr[j++] = left[i++];
            }
        }
    }
}
