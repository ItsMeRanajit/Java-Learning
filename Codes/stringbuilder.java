public class stringbuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hi its me");
        // System.out.println(str);

        str.insert(2, "_");
        str.delete(2, 3);
        str.append(" ranajit");
        // System.out.println(str);
        // System.out.println(str.reverse());
        for (int i = 0; i < str.length() / 2; i++) {
            char front = str.charAt(i);
            char back = str.charAt(str.length() - 1 - i);
            str.setCharAt(i, back);
            str.setCharAt(str.length() - 1 - i, front);
        }
        System.out.println(str);
    }
};