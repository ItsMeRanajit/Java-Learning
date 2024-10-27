// all subsequence of string abc - a,b,c,ab,ac,bc,abc;

import java.util.HashSet;

public class printUniqueSubseqHashsetRecursion {
    public static void main(String args[]) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        printUniqSubseq(str, 0, "", set);
    }

    private static void printUniqSubseq(String str, int idx, String newString, HashSet<String> set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        printUniqSubseq(str, idx + 1, newString + str.charAt(idx), set);
        printUniqSubseq(str, idx + 1, newString, set);
    }
}
