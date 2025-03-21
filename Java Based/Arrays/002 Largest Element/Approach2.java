// Find the largest element in an array.

// Approach
// 1. Sort the array
// 2. Return the last element of the sorted array

// Time Complexity : O(n log n) - Sorting the array
// Space Complexity : O(1) - No extra space is used except for a few variables.

import java.util.Arrays;

class Approach2 {

    public static int sortArr(int arr[]) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static void main(String args[]) {
        int arr1[] = {2, 5, 1, 3, 0};
        System.out.println("The largest element in array is: " + sortArr(arr1));

        int arr2[] = {8, 10, 5, 7, 9};
        System.out.println("The largest element in array is: " + sortArr(arr2));
    }
}
