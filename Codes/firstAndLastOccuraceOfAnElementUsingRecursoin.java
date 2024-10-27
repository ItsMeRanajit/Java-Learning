public class firstAndLastOccuraceOfAnElementUsingRecursoin {
    static int first = -1;
    static int last = -1;

    public static void main(String args[]) {
        String str = "ssfamsfgshfggfgigofmgosngaaalmd";
        checkString(str, 'a', 0, str.length() - 1);

        checkString(str, 0, 'a');
    }

    private static void checkString(String str, char ele, int left, int right) {
        if (left > right) {
            System.out.println("element not present");
            return;
        } else if (left == right && str.charAt(left) == ele) {
            System.out.println("the first and last occurance in string of " + ele + " is " + (left + 1));
            return;
        }
        if (str.charAt(left) == ele && str.charAt(right) == ele)
            System.out.println("the first and last occurance of " + ele + " is " + (left + 1) + " and " + (right + 1));
        else if (str.charAt(left) != ele)
            checkString(str, ele, left + 1, right);
        else if (str.charAt(right) != ele)
            checkString(str, ele, left, right - 1);
    }

    private static void checkString(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first + 1);
            System.out.println(last + 1);
            return;
        }
        if (str.charAt(idx) == element) {
            if (first == -1)
                first = idx;
            else
                last = idx;
        }
        checkString(str, idx + 1, element);
    }

}
