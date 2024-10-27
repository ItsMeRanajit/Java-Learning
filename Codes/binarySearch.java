import java.util.Scanner;

public class binarySearch {
    public static void main(String args[]) {
        int array[] = { 2, 4, 5, 6, 7, 9, 12, 56, 78, 89, 98, 99, 123, 234, 345 };
        Scanner sc = new Scanner(System.in);
        String str = "";
        do {
            System.out.println("Enter key to find in the array");
            int key = sc.nextInt();
            int index = BinarySearch(array, key);
            if (index == -1)
                System.out.println("element not found");
            else
                System.out.println("element found at " + index + "th position");
            System.out.println("Do you want to find something else?");
            str = sc.next();
        } while (str.equals("yes") || str.equals("YES"));
        sc.close();
    }

    private static int BinarySearch(int[] array, int key) {
        int left = 0;
        int right = array.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2; // = (left + right) / 2. that was written bcz if left and right both
                                                 // becomes some large value in futher opr. then their addition may
                                                 // surpass max int level.
            if (array[mid] == key)
                return mid + 1;
            if (array[mid] < key)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }
}
// O(logn)