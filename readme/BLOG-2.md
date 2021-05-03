# Blog 2

## Merge Sort
* Sorting an single array by splitting it in half several times until they are sorted and can merge, and then merge it.

## Psuedocode
ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left

## Trace
* Sample Array: [8,4,23,42,16,15]

* Pass 1
  - First will pass through the array, and then split the array in two.
  ![00CFDDB3-0032-4741-A3EB-DF7DEE8C944E_4_5005_c](https://user-images.githubusercontent.com/65562053/116313197-4dde9b00-a762-11eb-8df0-4b289dc2fba4.jpeg)

* Pass 2
  - The array is split into two seperate arrays.
![31E5C625-77AA-4DAD-8DA6-6E4F73378E75_4_5005_c](https://user-images.githubusercontent.com/65562053/116313216-533be580-a762-11eb-874a-14ea2ac4713e.jpeg)

* Pass 3
  - The two arrays will split again.
![F93D7836-1373-4F3D-90D4-C542D6B6557C_4_5005_c](https://user-images.githubusercontent.com/65562053/116313243-5df67a80-a762-11eb-8bbc-affd3a08a8d8.jpeg)

* Pass 4
  - The left side will be sorted.
![4B58A87B-8BCA-44F7-9BD1-AF238141605C_4_5005_c](https://user-images.githubusercontent.com/65562053/116313283-6bac0000-a762-11eb-85b5-3b5ef4bfb83b.jpeg)

* Pass 5
  - The right side will be sorted.
![265E2FA7-95EA-4BD5-B282-21BC7F01E302_4_5005_c](https://user-images.githubusercontent.com/65562053/116313300-71a1e100-a762-11eb-8d30-9a5ac945c8f2.jpeg)
![BC22EB04-7D9B-4C91-924A-521E772FCD71_4_5005_c](https://user-images.githubusercontent.com/65562053/116313314-76669500-a762-11eb-9c2c-c2844d96abaf.jpeg)

* Pass 6
  - Both sides will merge once the sorting is done.
![B73FB641-889D-49CF-8FC3-D8177D11615E_4_5005_c](https://user-images.githubusercontent.com/65562053/116313323-7b2b4900-a762-11eb-859c-90b3501d3bae.jpeg)

* Pass 7
  - Final iteration will the finished merged array.
![FE92C3F3-538B-4817-BAEA-0908AD80C890_4_5005_c](https://user-images.githubusercontent.com/65562053/116313330-7cf50c80-a762-11eb-9d0d-9c727c96e97d.jpeg)

## Efficiency
* Time: O(nlogn)
* Space: O(nlogn)
