import java.util.*;

// a class consists of different variables and methods(a function that does some operations for that class). a class can be accessed form the main and other classes of the program
class pen {
    String color;// these are the variables for class pen
    String type;// the variables are called as data of the class
    String brand;

    public static void write() { // this is the method that has a function.
        // the methods are called as the members of the class
        System.out.println("this is the method of that class");
    }

    public void printColor() {
        System.out.print("the color and the type of " + this.brand + " pens are (using this keyword) : ");
        System.out.print(this.color + " and ");
        System.out.println(this.type);// this.variable name.
        // 'this' is a keyword.
        // it prints the color and type(basicallly the values of the vars) of any
        // object.
        // which calls the printcolor.
    }
}

class student {
    String name;
    int roll;
    int age;
    String dept;

    public void studentInfo() {
        System.out.println("the details of the student is \nname - " + this.name + "\nroll - " + this.roll + "\nage - "
                + this.age + "\ndepartment - " + this.dept);
    }
}
// M A I N//

// every program has a main class that has same name as the file name.
// and it also consists a method.
public class classobjects {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print(" enter 1 for pen info or press other for student info : ");
        int key = sc.nextInt();

        if (key == 1) {
            pen pen1 = new pen();// creating object. just like we create while taking input
            pen1.color = "blue";// assinging the values of the class variables
            pen1.type = "dot";
            pen1.brand = "agni";

            // pen1.write();// calling method.-- varname/classname.methodname();

            pen pen2 = new pen();
            pen2.color = "black";
            pen2.type = "gel";
            pen2.brand = "cello";

            // pen2.write();// the warning for the write bcz to call method no object is
            // needed bcz
            // it is a static method. and static methods dont have any
            // work with objects.thats why if we also called write with class name it will
            // also work. bcz thats how static methods and vars are accessed

            pen.write();// but it wont work for the methods which has the operation with objects

            pen2.printColor();// method calling to print the color and type
            pen1.printColor();
        }

        else {
            student s1 = new student();// a memory has been allocated for making a new object . new is to create new
                                       // objects. the size of the allocation based on the class.

            // here student(); used as a funtion to create an object. this special type of
            // function is known as Constructor. which helps to create objects and it is the
            // work of Constructors
            s1.name = "Ranajit";
            s1.roll = 55;
            s1.age = 20;
            s1.dept = "computer science engineering";

            s1.studentInfo();

        }

        sc.close();

    }
}
