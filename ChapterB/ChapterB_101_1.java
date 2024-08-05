// 1. Define a class VOperations. Define initializer(), linearSearch(), binSearch(),
// bubbleSort(), show() methods to initialize the array, Arr, with
// {11,6,77,8,5,44,6,9,442,86,73,49,68,82}, to search an element se using Linear
// Search, to search an element se using Binary Search, to perform the Bubble Sort
// on the array, to display the elements in the array, Arr, respectively. 

// package chapterb_101_1;

import java.util.Arrays;

public class ChapterB_101_1 {
    public static void main(String[] args) {
        int[] arr = new int[] { 11, 6, 77, 8, 5, 44, 6, 9, 442, 86, 73, 49, 68, 82 };
        VOperations obj = new VOperations();
        obj.initializer(arr);
        System.out.println("The array you entered : " + Arrays.toString(obj.show()));

        int se = 8;
        System.out.println("Element " + obj.linearSearch(se) + " by linear search");

        se = 9;
        System.out.println("Element " + obj.binSearch(se) + " by binary search");

        obj.bubbleSort();
        System.out.println("Array sorted by Bubble Sort : " + Arrays.toString(obj.show()));
    }
}

class VOperations {
    int[] arr;

    void initializer(int[] arr) {
        this.arr = arr;
    }

    String linearSearch(int se) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == se) {
                return (se + " found at index " + i);
            }
        }
        return (se + " not found in the array ");
    }

    String binSearch(int se) {
        Arrays.sort(arr);
        int index = Arrays.binarySearch(arr, se);
        return (index >= 0) ? (se + " found at index " + index) : (se + " not found in the array ");
    }

    void bubbleSort() {
        Arrays.sort(arr);
    }

    int[] show() {
        return arr;
    }
}

/*
 * OUTPUT --
 * 
 * The array you entered : [11, 6, 77, 8, 5, 44, 6, 9, 442, 86, 73, 49, 68, 82]
 * Element 8 found at index 3 by linear search
 * Element 9 found at index 4 by binary search
 * Array sorted by Bubble Sort : [5, 6, 6, 8, 9, 11, 44, 49, 68, 73, 77, 82, 86,
 * 442]
 */
