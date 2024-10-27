public class stackUsingLL {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        Node head;

        public boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("stack is empty");
                return -1;
            }
            Node dummyNode = head;
            head = head.next;
            dummyNode.next = null;
            return dummyNode.data;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("stack is empty");
                return -1;
            }
            return head.data;
        }

        public void printStack() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return;
            }
            Node curr = head;
            while (curr != null) {
                System.out.print(curr.data + " --> ");
                curr = curr.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String a[]) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.printStack();
        System.out.println(stack.pop() + " is popped");
        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        stack.printStack();

    }
}
