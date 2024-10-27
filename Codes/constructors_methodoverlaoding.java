public class constructors_methodoverlaoding {
    public static void main(String args[]) {
        student s1 = new student(21, 55); // parameterized cons
        s1.print("name"); // polymorphism , method overloading
        student s2 = new student(s1);// copy cons
        s2.print(); // poly
    }
}

class student {
    int age;
    int roll;

    student(int a, int r) { // assigning s1
        this.age = a;
        this.roll = r;
    }

    student(student s) { // assigning s2 with s1
        this.age = s.age;
        this.roll = s.roll;
    }

    void print(String name) {
        System.out.println("the name is " + name + " and roll and age is " + roll + "," + age);
    }

    void print() {
        System.out.println("the age and roll is " + age + roll);
    }
}