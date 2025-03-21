// Find the smallest element in an array.

// Approach
// 1. We take the 1st element of the array to be min
// 2. Iterate through the array starting from the second element
// 3. If the current element is smaller than min, update min
// 4. Continue until the end of the array
// 5. Return the min value

// Time Complexity : O(n) - We need to traverse the entire array once.
// Space Complexity : O(1) - No extra space is used except for a few variables.

class Approach1 {

    public static int smallestElement(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String args[]) {

        int arr1[] = {2, 5, 1, 3, 0};
        System.out.println("The smallest element in array is: " + smallestElement(arr1));

        int arr2[] = {8, 10, 5, 7, 9};
        System.out.println("The smallest element in array is: " + smallestElement(arr2));
    }
}
