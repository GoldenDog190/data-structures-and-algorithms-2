package challenges.sort;

public class QuickSort {
    public void QuickSort(int arr[], int left, int right){
        if(left < right){
            int position = Partition(arr, left, right);
            QuickSort(arr, left, position - 1);
            QuickSort(arr, position + 1, right);
        }
    }

    private int Partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int low = left - 1;
        int i;
        for (i = low; i < right; i++){
            if (arr[i] <= pivot) {
                low++;
                Swap(arr, i, low);
            }
        }
        Swap(arr, right, low + 1);
        return low + 1;
    }

    private void Swap(int[] arr, int i, int low) {
        int temp;
        temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;
    }
}
