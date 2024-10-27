import java.util.HashSet;
import java.util.Iterator;

// only unique elements are stored. no duplicates are stored.
// hashset doesnot have any indexing like arrays. so getting by index not possible
// hash set doesnot store variables in order.
public class Hashing {
    public static void main(String a[]) {
        HashSet<Integer> set = new HashSet<>();
        // insert - O(1)
        set.add(1);
        set.add(3);
        set.add(3);
        set.add(1);
        // means only contains one 1 and one 3

        // searching O(1)
        if (set.contains(1))
            System.out.println(true);
        if (!set.contains(5))
            System.out.println(false);

        // remove - O(1)
        set.remove(1);
        if (!set.contains(1))
            System.out.println(false);

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);
        // size
        System.out.println(set.size());

        // print
        System.out.println(set);

        // set doesnot support any indexing
        // to iterate in set we need to import iterator();
        Iterator i = set.iterator();
        // iterator has 2 main methods next(); and hasnext();

        // i.next(); gives the next values of a set. like 1 2 3 ...

        // i.hasnext(); returns if any next value is there in the set or not.
        // say after 1, 2 is left so it gives true. but when i at 2 theres no next value
        // in set. so it returns false

        // printing the elements
        while (i.hasNext()) {
            System.out.println(i.next());
        }
        // iteration order is not set

    }
}
