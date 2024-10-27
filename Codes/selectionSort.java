import java.util.Arrays;

public class selectionSort {
    public static void main(String args[]) {
        int i = 0;
        int arr[] = { 1, 2, 4, 5, 6, 4, 6, 7, 8, 6, 44, 5, 3 };
        for (int j = 0; j < arr.length - 1; j++) {
            int min = j;
            for (i = j + 1; i < arr.length; i++) {
                if (arr[min] > arr[i]) {
                    min = i;
                }
            }
            int temp = arr[j];
            arr[j] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
