public class gettersSetters {
    public static void main(String args[]) {
        getset g = new getset();
        g.name = "sgha";
        g.email = "hgashg";
        System.out.println(g.getpass());
    }
}

class getset {
    public String name;
    protected String email;
    private String password;

    // getters
    public String getpass() {
        setpass("sgh");
        return this.password;
    }

    private void setpass(String pass) {
        this.password = pass;
    }
}
