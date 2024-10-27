public class keypadCombinationRecursion {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void main(String srgs[]) {
        String str = "67";
        printCombination(str, 0, "");
    }

    private static void printCombination(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }
        char curr = str.charAt(idx);
        String map = keypad[curr - '0'];
        for (int i = 0; i < map.length(); i++)
            printCombination(str, idx + 1, combination + map.charAt(i));
    }
}
