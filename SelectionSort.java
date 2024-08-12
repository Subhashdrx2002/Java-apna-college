public class SelectionSort {
    // Method to print the array
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to perform selection sort
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        System.out.println("Original array:");
        printArr(arr);
        
        // Sort the array
        selectionSort(arr);
        
        System.out.println("Sorted array:");
        printArr(arr);
    }
}
