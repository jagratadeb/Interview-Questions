// Find the second largest and second smallest element in the array.

// Approach:
// 1. Initialize variables to store the smallest, largest, second smallest, and second largest elements.
// 2. Traverse the array to find the smallest and largest elements.
// 3. Traverse the array again to find the second smallest and second largest elements by excluding the smallest and largest values.
// 4. Print the largest, second largest, smallest, and second smallest elements.

// Time Complexity: O(n) as the array is traversed twice.
// Space Complexity: O(1) as no extra space is used apart from variables.

class BetterApproach {

    public static void getElements(int arr[], int n) {
        if (n < 3) {
            System.out.println("-1 -1");
            return;
        }
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            smallest = Math.min(arr[i], smallest);
            largest = Math.max(arr[i], largest);
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < second_smallest && arr[i] != smallest) {
                second_smallest = arr[i];
            }
            if (arr[i] > second_largest && arr[i] != largest) {
                second_largest = arr[i];
            }
        }

        System.out.println("Largest Element: " + largest);
        System.out.println("Second Largest Element: " + second_largest);
        System.out.println("Smallest Element: " + smallest);
        System.out.println("Second Smallest Element: " + second_smallest);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 6, 7, 5};
        int n = arr.length;
        getElements(arr, n);
    }
}
