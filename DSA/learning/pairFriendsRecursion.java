public class pairFriendsRecursion {
    public static void main(String args[]) {
        int frnd = 7;
        int ways = pairFrnds(frnd);
        System.out.println(ways);
    }

    static int pairFrnds(int n) {
        if (n <= 1)
            return 1;
        int single = pairFrnds(n - 1);
        int pair = (n - 1) * pairFrnds(n - 2);
        return single + pair;
    }
}