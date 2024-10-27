import java.util.*;

public class pattern_solid_rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of terms");
        int n = sc.nextInt();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();

    }
}