import java.util.Scanner;

public class hollow_rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // for (int i = 0; i < n - 1; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == 0 || i == n - 2 || j == 0 || j == n - 1) {
        // System.out.print("x");
        // } else
        // System.out.print(" ");
        // }

        // for (int i = 0; i < n; i++) {
        // for (int j = n; j > i; j--) {
        // System.out.print("x");
        // }
        // System.out.println();
        // }
        // System.out.println();

        // for (int i = 0; i < n; i++) {
        // for (int j = n; j > i; j--) {
        // System.out.print(" ");
        // }
        // for (int k = 1; k <= i + 1; k++) {
        // System.out.print(k);
        // }
        int count = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
            }
            System.out.println();
        }
        sc.close();
    }

}
