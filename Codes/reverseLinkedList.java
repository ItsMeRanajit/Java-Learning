public class reverseLinkedList {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            next = null;
        }
    }

    public void add(String data) {
        Node newNode = new Node(data);
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

    public void print() {
        if (head == null) {
            System.out.println("nothing to print");
            return;
        }
        Node curr = this.head;
        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.println(curr);
    }

    public void reverse() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.next == null) {
            System.out.println("List has only one element. which is already reversed");
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    // recursive method
    public Node reverseRecursion(Node head) {
        if (head == null || head.next == null)
            return head;
        Node newNode = reverseRecursion(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public static void main(String a[]) {
        reverseLinkedList rev = new reverseLinkedList();
        rev.add("2");
        rev.add("3");

        rev.add("4");
        rev.add("5");
        rev.add("6");
        rev.print();

        rev.head = rev.reverseRecursion(rev.head);
        System.out.println(rev.head.data);
        rev.print();
    }
}
