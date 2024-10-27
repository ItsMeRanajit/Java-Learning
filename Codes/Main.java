
public class Main {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 5) {
            System.out.println(i);
        }
        int a = 5;
        int b = a;
        a = 4;
        System.out.println(b);
    }
}