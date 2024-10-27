import java.util.*;

public class bubblesort {
    public static void main(String args[]) {
        int arr[] = { 2, 3, 5, 6, 7, 4, 3, 2, 4, 432, 42, 2, 1, 343, 4354, 64, 3, 4232, 534, 54, 64, 353, 4, 43, 4, 3,
                46, 5, 7675, 6, 42, 4, 36, 5768, 7, 543, 53, 53, 43, 5, 44, 54, 5, 5, 45, 45, 4, 34, 34, 3, 4, 34, 3,
                43, 43, 5, 5, 43, 4, 4, 64, 6, 454, 4, 4, 54, 5, 45, 4, 3, 545, 767, 87, 8, 68, 989, 798, 90, 0, 00,
                4545, 4, 64, 5, 4, 3, 526476980, 7, 74, 5, 4, 343, 4, 657, 68, 6, 75, 4, 53434 };

        // bubble sort
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
// time complexity - O(n^2)
