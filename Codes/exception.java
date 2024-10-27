public class exception {
    public static void main(String[] args) {

        System.out.println(4);
        System.out.println(4);
        int rr[] = { 1, 2, 4 };

        // exception
        // 1. runtime excep
        // 2. compile time "

        // try -- exception prone code
        // catch -- if exception what to do

        try {
            System.out.println(4 / 0);
            // exception is thrown
            System.out.println(rr[9]);
        }

        // // multiple catch block also possible.
        // catch (ArrayIndexOutOfBoundsException e) {
        // System.out.println(e);
        // } catch (ArithmeticException e) {
        // System.out.println("1st catch");
        // } catch (Exception e) {
        // System.out.println(e.getMessage());
        // }
        // there are many types of exception.but only exception can hold any type of
        // exception

        catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println(e);
        }
        // insted of writing many catch blocks we can use catch like this , also known
        // as multicatch block. but only exception will not work

        // finally --closing code/must do code. memory free code. it will run for sure
        finally {
            System.out.println("finally");
        }

        // nested try catch is also possible

    }
}