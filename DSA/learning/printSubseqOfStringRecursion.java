// all subsequence of string abc - a,b,c,ab,ac,bc,abc;

public class printSubseqOfStringRecursion {
    public static void main(String args[]) {
        String str = "babgbag";
        printSubseq(str, 0, "");
    }

    private static void printSubseq(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        printSubseq(str, idx + 1, newString + str.charAt(idx));
        printSubseq(str, idx + 1, newString);
    }
}
