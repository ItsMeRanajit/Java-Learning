import java.util.ArrayList;

public class printSubsetsRecursion {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        printSubset(3, list);
    }

    public static void printSubset(int n, ArrayList<Integer> list) {

        if (n == 0) {
            show(list);
            return;
        }

        // if element is added
        list.add(n);
        printSubset(n - 1, list);

        // if not
        list.remove(list.size() - 1);
        printSubset(n - 1, list);
    }

    static void show(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++)
            System.out.print(list.get(i) + " ");
        System.out.println();

    }
}
