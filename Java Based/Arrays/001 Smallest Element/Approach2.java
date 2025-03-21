// Find the smallest element in an array.

// Approach
// 1. Sort the array
// 2. Return the first element of the sorted array

// Time Complexity : O(n log n) - Sorting the array
// Space Complexity : O(1) - No extra space is used except for a few variables.

import java.util.Arrays;

class Approach2 {

    static int sortArr(int arr[]) {
        Arrays.sort(arr);
        return arr[0];
    }

    public static void main(String args[]) {
        int arr1[] = {2, 5, 1, 3, 0};
        System.out.println("The smallest element in array is: " + sortArr(arr1));

        int arr2[] = {8, 10, 5, 7, 9};
        System.out.println("The smallest element in array is: " + sortArr(arr2));
    }
}
