public class singleLinkedList {
    Node head;
    private int size;

    singleLinkedList() {
        System.out.println("the new list is --");
        this.size = 0;
    }

    class Node {
        String data;
        Node next; // variable of the same class. so next will have same property as node class

        Node(String data) { // assigning the values

            this.data = data;
            this.next = null; // by default next is null
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Nothing to Delete, list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void deleteLast() {
        if (head == null) {
            System.out.println("Nothing to Delete, list is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;

    }

    public int getSize() {
        return size;
    }

    public void print() {
        if (head == null) {
            System.out.println("nothing in the list");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " --->");
            curr = curr.next;
        }
        System.out.print("null");
    }

    public static void main(String a[]) {
        singleLinkedList node = new singleLinkedList();
        node.addFirst("1");
        node.addFirst("0");
        node.addLast("2");

        node.deleteLast();

        node.addLast("4");
        node.print();
        System.out.println();
        node.addLast("67");
        node.print();
        System.out.println();
        System.out.println(node.getSize());

        singleLinkedList node2 = new singleLinkedList();
        node2.addFirst("788");
        node2.addFirst("78");
        node2.addFirst("7");
        node2.print();
        System.out.println();
        System.out.println(node2.getSize());
    }
}
