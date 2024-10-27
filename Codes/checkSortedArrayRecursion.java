public class checkSortedArrayRecursion {
    public static void main(String sr[]) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 457, 457 };
        checkSorted(arr, 0);
    }

    private static void checkSorted(int arr[], int i) {
        if (i + 1 == arr.length) {
            System.out.println(true);
            return;
        }
        if (arr[i] <= arr[i + 1])
            checkSorted(arr, i + 1);
        else {
            System.out.println(false);
            return;
        }
    }
}
