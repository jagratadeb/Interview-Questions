// Find the largest element in an array.

// Approach
// 1. We take the 1st element of the array to be max
// 2. Iterate through the array starting from the first element
// 3. If the current element is larger than max, update max
// 4. Continue until the end of the array
// 5. Return the max value

// Time Complexity : O(n) - We need to traverse the entire array once.
// Space Complexity : O(1) - No extra space is used except for a few variables.

class Approach1 {

    static int largestElement(int arr[]) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]) {
        int arr1[] = {2, 5, 1, 3, 0};
        System.out.println("The largest element in the array is: " + largestElement(arr1));

        int arr2[] = {8, 10, 5, 7, 9};
        System.out.println("The largest element in the array is: " + largestElement(arr2));
    }
}
