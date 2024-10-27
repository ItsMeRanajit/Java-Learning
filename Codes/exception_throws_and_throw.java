// public class exception_throws_and_throw {
//     public static void main(String[] args)  {
//         try {
//             great();
//         } catch (Exception e) {
//             // TODO Auto-generated catch block
//             e.printStackTrace();
//         }
//     }

//     public static void great() throws Exception {
//         System.out.println(4 / 0);
//     }
// }
// aded try catch 

import java.util.Scanner;

public class exception_throws_and_throw {
    public static void main(String[] args) throws Exception {
        great();
        Myexception.throwexp();

    }

    public static void great() throws Exception {
        System.out.println(4);
    }

}
// we can use thorws exception to handle the exception automatically.

// here im calling exception prone method from main. so if exception ocuurs itll
// ocuur on main too thats why we are also using it on main.

// so in quick fix itll give us 2 options are to surround the main with throws
// exception and add try catch calling the geat method.

// throws handle the exception
// throw throws/create an exception
class Myexception extends Exception {
    public static void throwexp() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to divide 18");
        int i = sc.nextInt();
        try {
            int j = 18 / i;
            if (j == 0) {
                throw new ArithmeticException("passing massage from throw"); // we intentionally created an exception.
                // done by just calling an catch
                // we can also pass some massage
            } else {
                System.out.println(j);
                throw new excep("this is custom exception");
            }
        } catch (ArithmeticException e) {
            System.out.println("thrown exp using throw keyword");
            System.out.println(e);// printing the passed massage
        } catch (excep e) {

        } finally {
            sc.close();
        }
    }

}

class excep extends Exception {
    public excep(String s) {
        System.out.println(s);
    }
}