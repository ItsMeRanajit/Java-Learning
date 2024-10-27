import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class queueUsingCollectionframework {
    public static void main(String a[]) {
        Queue<Integer> q = new LinkedList<>();

        // here linked list is used bcz in collection framework q is not a class like
        // stack or linked list.
        // q is a interface and object cant be created for interfaces
        // but linkedlist collection has all the features of q. thats why we are
        // implementing using ll

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.remove();
        q.add(6);
        q.remove();

        // System.out.println(q.peek());

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }

        Deque<Integer> q2 = new ArrayDeque<>();
        // we can also implement Dq with ArrayDeque.
        // arraydq is a class that implements dqueue interface which implements q
        // interface. and implements dq features
        // but for normal q we use linkedlist

        q2.add(1);
        q2.add(2);
        q2.add(3);
        q2.add(4);
        q2.add(5);

        q2.remove();
        q2.add(6);
        q2.remove();
        System.out.println(q2);

    }
}
