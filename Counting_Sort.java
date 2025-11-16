public class Counting_Sort {

    // Counting Sort function
    public static void countingSort(int arr[]) {

        // Find the largest element
        int largest = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > largest) {
                largest = num;
            }
        }

        // Create count array
        int count[] = new int[largest + 1];

        // Count the occurrences
        for (int num : arr) {
            count[num]++;
        }

        // Sort the array
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};

        countingSort(arr); // Call the function

        // Print sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
