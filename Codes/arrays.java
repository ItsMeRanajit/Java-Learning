
import java.util.*;

public class arrays {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int i;
        try (Scanner sc = new Scanner(System.in)) {
            int arr[] = { 1, 2, 3, 4 };
            int[] arr3 = new int[4];
            int arr2[] = new int[4];
            arr2[0] = 5;
            arr2[1] = 6;
            arr2[2] = 7;
            arr2[3] = 8;
            System.out.print(" enter the elements : ");
            for (i = 0; i < 4; i++) {
                arr3[i] = sc.nextInt();
            }

            for (i = 0; i < 4; i++) {
                System.out.print(" " + arr[i]);
            }

            for (i = 0; i < 4; i++) {
                System.out.print(" " + arr2[i]);
            }

            for (i = 0; i < arr3.length; i++) {
                System.out.print(" " + arr3[i]);
            }
            System.out.println();
            System.out.print("enter the key ot find");
            int key = sc.nextInt();

            for (i = 0; i < arr3.length; i++) {
                if (arr3[i] == key) {
                    System.out.print("key found");
                    break;
                }
            }
            if (i == arr3.length) {
                System.out.print("key is not found");
            }
            sc.close();
        }
    }

}