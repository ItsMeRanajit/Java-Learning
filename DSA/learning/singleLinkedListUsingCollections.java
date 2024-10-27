import java.util.LinkedList;

public class singleLinkedListUsingCollections {
    public static void main(String args[]) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("hi");
        list.addLast("its");
        list.addLast("me");
        System.out.println(list);

        System.out.println(list.size());// getting size

        // adding in middle
        list.add(1, "im in middle");
        System.out.println(list);

        // removing
        list.removeLast();
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

        // adding something more
        list.add("me");
        list.add("and");
        list.add("you");

        // getting an index
        System.out.println(list.get(3));

        // methods to clone/copy
        LinkedList<String> list2 = (LinkedList<String>) list.clone();
        System.out.println(list2);
        LinkedList<String> list3 = new LinkedList<>(list2);
        System.out.println(list3);
    }
}
