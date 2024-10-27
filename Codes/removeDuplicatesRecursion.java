public class removeDuplicatesRecursion {
    public static boolean map[] = new boolean[26];

    public static void main(String args[]) {
        String str = "aabbccdeeeeefffghhhhhhhiiijjklmnnnoooppqrssttttuuvvwxyyzz";
        removeDuplicate(str, 0, "");
    }

    private static void removeDuplicate(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        if (map[str.charAt(idx) - 'a'] == true)
            removeDuplicate(str, idx + 1, newString);
        else {
            map[str.charAt(idx) - 'a'] = true;
            newString += str.charAt(idx);
            removeDuplicate(str, idx + 1, newString);
        }
    }
}
// O(n)