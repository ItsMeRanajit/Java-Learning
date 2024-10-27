public class butterlfy_pattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n * 2; i++) {
            if (i < n) {
                for (int k = 0; k <= i; k++) {
                    System.out.print("x");
                }
                for (int j = i; j < n - 1; j++) {
                    System.out.print("  ");
                }
                for (int k = 0; k <= i; k++)
                    System.out.print("x");

            } else {
                for (int k = n * 2; k > i; k--)
                    System.out.print("x");
                for (int j = n; j < i; j++)
                    System.out.print("  ");
                for (int k = n * 2; k > i; k--)
                    System.out.print("x");
            }
            System.out.println();

        }
    }
}
