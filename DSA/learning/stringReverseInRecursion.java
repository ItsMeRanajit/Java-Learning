public class stringReverseInRecursion {
    public static void main(String args[]) {
        String str = "abcd";
        reverse(str, str.length() - 1);
    }

    private static void reverse(String str, int i) {
        if (i < 0)
            return;
        System.out.print(str.charAt(i));
        reverse(str, i - 1);
    }
}
