public class towerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        towerofhanoi(n, 'S', 'H', 'D');
    }

    private static void towerofhanoi(int n, char source, char helper, char dest) {
        if (n == 1) {
            System.out.println("Transfer disk " + n + " from " + source + " to " + dest + " directly");
            return;
        }
        towerofhanoi(n - 1, source, dest, helper);
        System.out.println("Transfer disk " + n + " from " + source + " to " + dest);
        towerofhanoi(n - 1, helper, source, dest);
    }
}
// O(2^n)