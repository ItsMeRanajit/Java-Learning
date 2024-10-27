import java.util.Arrays;

public class quickSort {
    public static void main(String args[]) {
        int arr[] = { 2, 4, 5, 3, 2, 3, 5, 7, 5, 4, 3, 2, 554, 3, 6, 53 };
        quicksort(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));

    }

    private static void quicksort(int[] arr, int start, int end) {
        if (start < end) {
            int pivot_idx = partition(arr, start, end);
            quicksort(arr, start, pivot_idx - 1);
            quicksort(arr, pivot_idx + 1, end);
        }
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        i++;
        arr[end] = arr[i];
        arr[i] = pivot;
        return i;
    }
}
