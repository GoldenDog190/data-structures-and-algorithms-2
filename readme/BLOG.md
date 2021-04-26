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
![73142529-280E-4DDA-9708-9B2B86A2B637_4_5005_c](https://user-images.githubusercontent.com/65562053/116155823-836e8000-a69f-11eb-86fd-2211bcb4f1aa.jpeg)

* Pass 2
  - The second pass will swap the 4 and the 8.
  ![497FD5DC-C1B8-4CDD-8D98-4B0C78D02A26_4_5005_c](https://user-images.githubusercontent.com/65562053/116155876-94b78c80-a69f-11eb-9c13-e7c5b5596eae.jpeg)

* Pass 3
  - The third pass will swap the 42 and 16.
  ![2BC81A76-457E-4573-9A10-9F6FA6A9E30A_4_5005_c](https://user-images.githubusercontent.com/65562053/116155892-9b460400-a69f-11eb-886e-cdb2728245d3.jpeg)

* Pass 4
  - The fourth pass will swap the 23 and 16.
  ![96B1F11B-0D5D-438C-9015-65A4667A6448_4_5005_c](https://user-images.githubusercontent.com/65562053/116155911-a39e3f00-a69f-11eb-84c5-3a171fead1ab.jpeg)

* Pass 5
  - The fifth pass will swap 42 and 15.
  ![72ADD857-4B58-4DAE-9434-E62814634921_4_5005_c](https://user-images.githubusercontent.com/65562053/116155923-a731c600-a69f-11eb-9c52-e8da2ffefe8e.jpeg)

* Pass 6
  - The sixth pass will swap 23 and 15.
  ![1130452D-DE54-48FE-9449-2539170D9990_4_5005_c](https://user-images.githubusercontent.com/65562053/116155959-b6187880-a69f-11eb-9f80-4676d00652dc.jpeg)

* Pass 7
  - The seventh pass will swap 15 and 16.
  ![3B53A8F1-BC0B-42F8-B4EE-2F789D1B2A77_4_5005_c](https://user-images.githubusercontent.com/65562053/116155970-bca6f000-a69f-11eb-8476-bd91787f701f.jpeg)

* Pass 8
  - Final iteration of the array will finish the sorting of the numbers, and all of the numbers will be from smallest to largest.
![3845FF61-BB3B-4C2A-A8AB-5E7799361B05_4_5005_c](https://user-images.githubusercontent.com/65562053/116155994-c2043a80-a69f-11eb-8f18-e67f2be33ab7.jpeg)

## Efficiency
* Time: O(n^2)
* Space: O(1)
