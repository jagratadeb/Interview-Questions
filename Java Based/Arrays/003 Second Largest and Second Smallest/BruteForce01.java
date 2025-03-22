// Find the second largest and second smallest element in the array.

import java.util.Arrays;

// Approach:
// 1. Check if the array has less than 3 elements. If yes, print "-1 -1" and return.
// 2. Sort the array.
// 3. The second smallest element will be at index 1.
// 4. The second largest element will be at index n-2 (where n is the length of the array).

// 5. Print the second largest and second smallest elements.
// Time Complexity: O(n log n) due to sorting the array.
// Space Complexity: O(n) for the copy of the array.
class BruteForce01 {

    public static void getElements(int arr[]) {
        int n = arr.length;
        if (n < 3) {
            System.out.println("-1 -1");
            return;
        }
        Arrays.sort(arr);
        int secondSmallest = arr[1];
        int secondLargest = arr[n - 2];
        System.out.println("Second Largest:" + secondLargest);
        System.out.println("Second Smallest:" + secondSmallest);
    }

    public static void main(String[] args) {

        int[] Arr = {7, 5, 2, 1, 18, 15};
        // We are copying the array so that the original array doee not get modified.
        int[] copyArr = new int[Arr.length];
        for (int i = 0; i < Arr.length; i++) {
            copyArr[i] = Arr[i];
        }
        getElements(copyArr);
    }
}
