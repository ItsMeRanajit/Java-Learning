public class bitmanipulation {
    public static void main(String[] args) {
        // getbit - to get a bit
        // setbit - to set a bit . any to 1
        // clearbit - to clear a bit. any to 0
        // updatebit - 0 to 1 or 1 to 0

        // getbit---
        int n = 5;
        int pos = 3;
        int bitmsk = 1 << pos;
        // System.out.println(bitmsk);
        if ((bitmsk & n) == 0) {
            System.out.println(0);
        } else
            System.out.println(1);

        // --setbit--
        int r = bitmsk | n;
        if ((bitmsk & r) == 0) {
            System.out.println(0);
        } else
            System.out.println(1);
        // System.out.println(r);

        // clearbit --
        int k = ~(bitmsk);
        r = k & r;
        if ((bitmsk & r) == 0) {
            System.out.println(0);
        } else
            System.out.println(1);
        System.out.println(r);

        // updatebit --
        r = ~(k ^ r);// xnor
        if ((bitmsk & r) == 0) {
            System.out.println(0);
        } else
            System.out.println(1);
        System.out.println(r);
        int a[] = { 1 };
        System.out.println(a.length);
    }
}