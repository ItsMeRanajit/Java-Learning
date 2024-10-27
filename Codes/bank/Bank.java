
public class Bank extends Account {
    public Bank(String name, String Acc) {
        super(name); // Call to superclass constructor
        this.Accno = Acc; // Set account number
        print(); // Print account details
    }

    public static void main(String args[]) {
        Account n = new Account();
        n.Accno = "94759346";
        n.setname("chaman");
        System.out.println(n.getname());
    }
}
// package bank;

class Account {
    private String name;
    public String Accno;

    Account(String nm) {
        this.name = nm;
    }

    Account() {
    }

    void print() {
        System.out.println("The name of the account holder is " + name + " and account number is " + Accno);
    }

    public void setname(String nm) {
        this.name = nm;
    }

    public String getname() {
        return this.name;
    }
}
