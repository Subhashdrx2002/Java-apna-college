public class BinarySearch {
    // function for binary search
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1; // Corrected end index

        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate mid index

            // Compare key with the middle element
            if (numbers[mid] == key) { // found
                return mid;
            } else if (numbers[mid] < key) { // search in the right half
                start = mid + 1;
            } else { // search in the left half
                end = mid - 1;
            }
        }

        return -1; // key not found
    }

    public static void main(String[] args) {
        int numbers[] = {2, 4, 6, 8, 10, 12, 14};
        int key = 10;
        System.out.println("Index of key is: " + binarySearch(numbers, key));
    }
}
