public class recusion1 {
    public static void main(String args[]) {
        // printsum(1, 0, 100); //sum
        // System.out.println(fact(6));
        // System.out.print("0 1");
        // fibbonacci(0, 1, 7);

        System.out.println(power(3, 5));
    }

    // sum
    /*
     * private static void printsum(int val, int sum, int limit) {
     * sum += val;
     * val++;
     * if (val <= limit)
     * printsum(val, sum, limit);
     * else {
     * System.out.println(sum);
     * return;
     * }
     * }
     */

    // factorial
    /*
     * private static int fact(int n) {
     * if (n == 0 || n == 1)
     * return 1;
     * return n * fact(n - 1);
     * }
     */
    // fibbonacci
    //
    // private static void fibbonacci(int a, int b, int n) {
    // if (n == 0)
    // return;
    // System.out.print(" " + (a + b));
    // fibbonacci(b, a + b, n - 1);
    // }

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        // else {
        // int p = power(x, n - 1);
        // int ans = p * x;
        // return ans;
        // }
        if (n % 2 == 0)
            return power(x, n / 2) * power(x, n / 2);
        else
            return power(x, n / 2) * power(x, n / 2) * x;
    }
}