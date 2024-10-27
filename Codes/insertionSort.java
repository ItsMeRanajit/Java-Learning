import java.util.Arrays;

public class insertionSort {
    public static void main(String args[]) {
        int arr[] = { 1, 2, 4, 5, 6, 4, 6, 7, 8, 6, 44, 5, 3 };
        for (int i = 0; i < arr.length; i++) {
            int j = i - 1;
            int a = arr[i];
            while (j >= 0 && a < arr[j]) { // breaks when element is less than a . so j points to lesser element than a
                                           // and j+1 is the correct spot to place a
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = a; // finally adding the original element to its ideal spot

        }
        System.out.println(Arrays.toString(arr));
    }
}
