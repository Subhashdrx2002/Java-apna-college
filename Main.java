import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Count swaps for ascending order
        int ascendingSwaps = countSwaps(Arrays.copyOf(arr, n), true);
        // Count swaps for descending order
        int descendingSwaps = countSwaps(Arrays.copyOf(arr, n), false);

        // Output the minimum swaps required
        System.out.println(Math.min(ascendingSwaps, descendingSwaps));
    }

    public static int countSwaps(int[] arr, boolean isAscending) {
        int n = arr.length;
        int swaps = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if ((isAscending && arr[j] > arr[j + 1]) ||
                        (!isAscending && arr[j] < arr[j + 1])) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }
        }

        return swaps;
    }
}