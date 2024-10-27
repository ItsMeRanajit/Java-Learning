
public class queueUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        static Node head;
        static Node tail;

        public boolean isEmpty() {
            return head == null && tail == null;
        }

        // public boolean isFull() {
        // }
        // no need for isFull. bcz linkedlist doesnt have a fixed size like arrays

        public void add(int data) {
            Node newNode = new Node(data);
            if (tail == null)
                tail = head = newNode;
            tail.next = newNode;
            tail = newNode;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue has no element");
                return -1;
            }
            int res = head.data;
            if (head == tail) {
                tail = null;
            }
            head = head.next;

            return res;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }

        public void printq() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            Node curr = head;
            System.out.print("front --> ");
            while (curr != null) {
                System.out.print(curr.data + " --> ");
                curr = curr.next;
            }
            System.out.println("rear");
        }
    }

    public static void main(String a[]) {
        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        q.printq();

        q.remove();
        q.add(6);
        q.printq();
        q.remove();

        q.printq();
        System.out.println(q.peek());

    }

}
