# Blog 3

## Quick Sort
* Quick Sort is a divide and conquer algorithm, and it picks an element as pivot and partitions the given array around the picked pivot. 

## Psuedocode
ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value 
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right. 
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp

## Trace
* Sample Array: [8,4,23,42,16,15]

* Pass 1
  - First will pass through the array, and then partition the array in two.
![E3915A47-6D59-4103-94FB-8BB4CDF49535_4_5005_c](https://user-images.githubusercontent.com/65562053/116494687-32ed5300-a856-11eb-8803-acc328b8e393.jpeg)

* Pass 2
  - Sort the left side.
![FE88DBE6-13F9-4868-A777-E09DC823EF8A_4_5005_c](https://user-images.githubusercontent.com/65562053/116494841-8c558200-a856-11eb-8732-c1ead24e98a4.jpeg)

* Pass 3
  - Sort the right side, if needed.
![649ADC28-E053-4C98-A616-410F91D0231A_4_5005_c](https://user-images.githubusercontent.com/65562053/116494853-91b2cc80-a856-11eb-8495-7cb5b29622ce.jpeg)

* Pass 4
  - Swap the lowest number.
![DAAE9A44-9B7D-442D-80D1-DABF32C14FA0_4_5005_c](https://user-images.githubusercontent.com/65562053/116494867-9a0b0780-a856-11eb-8c7f-a2b43f376688.jpeg)

* Pass 5
  - Both sides will merge once the sorting is done.
![94B14E28-6CAA-4806-A322-CF53B30DDCF6_4_5005_c](https://user-images.githubusercontent.com/65562053/116494872-9d05f800-a856-11eb-96c0-40f109520c8c.jpeg)

* Pass 6
  - Final iteration will be the finished merged array.
![02C9F8AA-481C-4C4E-949A-14BB74C47347_4_5005_c](https://user-images.githubusercontent.com/65562053/116494875-a000e880-a856-11eb-8e13-7eacfb1bfdac.jpeg)

## Efficiency
* Time: O(n^2)
* Space: O(n^2)
