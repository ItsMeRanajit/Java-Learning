public class placeTilesRecursion {
    public static void main(String args[]) {
        int n = 4;
        int m = 2;
        System.out.println(placeTiles(n, m));
    }

    static int placeTiles(int n, int m) {
        if (n == m)
            return 2;
        if (n < m)
            return 1;
        return placeTiles(n - m, m) + placeTiles(n - 1, m);
    }
}
