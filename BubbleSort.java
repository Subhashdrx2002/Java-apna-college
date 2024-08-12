public class BubbleSort {
    // Method to perform bubble sort
    public static void bubbleSort(int arr[]) {
        for (int turn = 0; turn < arr.length - 1; turn++) {
            for (int j = 0; j < arr.length - 1 - turn; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to print array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main method to test the bubble sort
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        System.out.println("Original array:");
        printArr(arr);

        // Sorting the array
        bubbleSort(arr);

        System.out.println("Sorted array:");
        printArr(arr);
    }
}
