import java.util.Arrays;

public class mergeSort {
    public static void main(String args[]) {
        int array[] = { 6, 5, 6, 7, 5, 4, 3, 4, 7, 8, 76, 433, 343, 5, 4, 3 };
        divide(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    private static void divide(int[] array, int start, int end) {
        if (start >= end)
            return;
        int mid = start + (end - start) / 2;
        divide(array, start, mid);
        divide(array, mid + 1, end);
        conqure(array, start, mid, end);
    }

    private static void conqure(int[] array, int start, int mid, int end) {
        int i = start;
        int j = mid + 1;
        int idx = 0;
        int merge[] = new int[end - start + 1]; // creating an array of the cuurent sub array size
        while (i <= mid && j <= end) {
            if (array[i] <= array[j])
                merge[idx++] = array[i++];
            else
                merge[idx++] = array[j++];
        }
        while (i <= mid)
            merge[idx++] = array[i++];
        while (j <= end)
            merge[idx++] = array[j++];

        for (int k = 0, l = start; k < merge.length; k++, l++)
            array[l] = merge[k];
    }
}
// O(logn)
// to divide the array is logn
// then to merge the array the no of steps are logn and for each step n to sort
// the elements
