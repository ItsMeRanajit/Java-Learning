public class interfaces {
    public static void main(String arfs[]) {
        // laptop l = new laptop();
        // desktop desk = new desktop();
        devlop d = new devlop();

        // d.dev(l);
        // d.dev(desk); //error bcz dev only accept laptop type variabels
        // but what if we want to use desktop or laptop classes according to our need!!
        // to do this we can make the objects as computer type.
        // which is inherited by both desktop ans laptop

        computer l2 = new laptop();
        computer desk2 = new desktop();
        // they both are different type of objects but their type is same which is
        // computer.
        // it is possible only bcz we used inheritance here
        d.dev(l2);
        d.dev(desk2);

        // now both will run. both object will be accepted. bcz they are the same type
        // but the method will run based on which object is passed

    }
}

class devlop {
    public void dev(computer l) {
        l.code();
    }
}

abstract class computer {
    public abstract void code();
}

class laptop extends computer {
    public void code() {
        System.out.println("running the code..");
    }
}

class desktop extends computer {
    public void code() {
        System.out.println("running the code but faseter...");
    }
}
