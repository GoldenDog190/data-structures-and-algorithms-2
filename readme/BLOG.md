# Blog

## Insertion Sort
* Sorts array elements from the smallest to largest number using insertion sort.

## Pseudocode
InsertionSort(int[] arr)
  
    FOR i = 1 to arr.length
    
      int j <-- i - 1
      int temp <-- arr[i]
      
      WHILE j >= 0 AND temp < arr[j]
        arr[j + 1] <-- arr[j]
        j <-- j - 1
        
      arr[j + 1] <-- temp

## Trace
* Sample array: [8,4,23,42,16,15]

* Pass 1
  - First will pass through the array, and compare the numbers in the array. The array will be split into sorted and unsorted parts. The unsorted numbers will be picked and placed in the correct spots in the next several passes.
  ![]()

* Pass 2
  - The second pass will swap the 4 and the 8.
  ![]()

* Pass 3
  - The third pass will swap the 42 and 16.
  ![]()

* Pass 4
  - The fourth pass will swap the 23 and 16.
  ![]()

* Pass 5
  - The fifth pass will swap 42 and 15.
  ![]()

* Pass 6
  - The sixth pass will swap 23 and 15.
  ![]()

* Pass 7
  - The seventh pass will swap 15 and 16.
  ![]()

* Pass 8
  - Final iteration of the array will finish the sorting of the numbers, and all of the numbers will be from smallest to largest.
  ![]()

## Efficiency
* Time: O(n^2)
* Space: O(1)