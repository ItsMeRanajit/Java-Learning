// we can use interface in computer class. which only needed to declare some thing

public class interfaces2 {
    public static void main(String arfs[]) {
        devlop d = new devlop();
        computer l2 = new laptop();
        computer desk2 = new desktop();

        d.dev(l2);
        d.dev(desk2);

    }
}

class devlop {
    public void dev(computer l) {
        l.code();
    }
}

interface computer {
    void code(); // by default it is public abstract
}

class laptop implements computer {
    public void code() {
        System.out.println("running the code..");
    }
}

class desktop implements computer {
    public void code() {
        System.out.println("running the code but faseter...");
    }
}
