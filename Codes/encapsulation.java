// import java.util.*;

class me {
    private int number = 7770919;
    private String place = "behala";
    int age = 20;

    public int Number() {
        return number;

    }

    public String place() {
        return place;

    }
}

public class encapsulation {
    public static void main(String[] args) {
        me sc = new me();
        // sc.number = 458544426;
        // sc.place = "behala"; // clear comments to understand the concept
        // they are not visible because we used encapsulation and make the variable of
        // me class private that cannot be accessable from outside.
        System.out.println("my age is" + sc.age);
        // the varible is'nt made private so it can be accessed

        // but theres a way to access them i.e. defining a method in the class and call
        // the method.
        System.out.println("my number is " + sc.Number() + sc.place());

    }
}