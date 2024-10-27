import java.util.*;

public class Even_odd_without_opr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String num1 = String.valueOf(num);
        int value = num1.length();
        String num2 = " " + num1;
        if (num2.charAt(value) == '0' ||
                num2.charAt(value) == '2' ||
                num2.charAt(value) == '4' ||
                num2.charAt(value) == '6' ||
                num2.charAt(value) == '8') {
            System.out.println("the number is even");
        } else
            System.out.println("the number is odd");
        System.out.println(num2.charAt(value));
        sc.close();
    }
    // if ((15 & 1) == 0) {
    // System.out.println("even");
    // } else
    // System.out.println("odd");
    // }
    // Using and operator with bit manipulation
}