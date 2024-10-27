public class inheritance_methodoverriding {
    public static void main(String args[]) {
        shape s = new shape();
        s.circumference(); // its 0 bcz the side is not initiated with any value
        s.area();
        circle c = new circle(5); // here were passing 5, for circumference
        c.area(5);
        c.circumference();// bcz were calling the circumference, so itll trigger and print the value
                          // passed to the constructor for that obj.
        square sq = new square(3);
        sq.circumference();
    }
}

// parent
class shape {
    int side;

    public void area() {
        System.out.println("the area is here");
    }

    public void circumference() {
        System.out.println("its the circumference " + side);
    }
}

class circle extends shape { // single ingeritance
    circle(int side) {
        this.side = side;
    }

    circle() {
    }

    public void area(int radius) {
        System.out.println("the area is " + 3.14 * radius * radius); // method overriding
    }
}

class semicircle extends circle { // multilevel inheritance, shape -> circle -> semicircle
    @Override // we can write it to mention a overriding is used here.
    public void area(int radius) { // method overriding
        System.out.println(" the area is " + 0.5 * 3.141 * radius * radius);
    }
}

class square extends shape { // hierarchical inheritance, shape -> circle , shape -> square
    int len;
    int br;

    square(int length) {
        this.len = length;
        System.out.println("circumference " + 4 * length); // using method inside the constructor
        area();// calling another method from inside of a constructor, no parameter so calling
               // the method of its parent shape.
        area(length);// calling overridden method of this class
    }

    public void circumference() {
        System.out.println(" the circumference is " + 4 * len);
    }

    public void area(int length) {
        System.out.println("the area is " + length * length);
    }
}

// this program consists mulitple types of inheritance which is a hybrid
// thats why it is known as hybrid inheritance.