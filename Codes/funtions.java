import java.util.*;

public class funtions {
   public static int sum2(int a, int b) {
      int c;
      c = a + b;
      return c;
   }

   public static void sum(int a, int b) {
      System.out.print("the sum from the function is" + (a + b) + "\n");
      return;
   }

   public static int sum3(int a, int b) {
      return a + b;
   }

   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      int a, b;
      a = sc.nextInt();
      b = sc.nextInt();
      sum(a, b);
      System.out.print("the sum from the main is " + sum2(a, b) + "\n");
      System.out.print("the sum from the returned value is " + sum3(a, b));

      sc.close();
   }

}