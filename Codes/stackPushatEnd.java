import java.util.ArrayList;

public class stackPushatEnd {

    static class Stack {
        ArrayList<Integer> arr = new ArrayList<>();

        public boolean isEmpty() {
            return arr.size() == 0;
        }

        public void pushEnd(int data) {
            if (isEmpty()) {
                arr.add(data);
                return;
            }
            int top = arr.remove(arr.size() - 1);
            pushEnd(data);
            arr.add(top);
        }

        public int pop() {
            if (isEmpty())
                return -1;
            return arr.remove(arr.size() - 1);
        }

        public int peek() {
            if (isEmpty())
                return -1;
            return arr.get(arr.size() - 1);
        }

        public void reverseStack() {
            if (isEmpty())
                return;
            int top = arr.remove(arr.size() - 1);
            reverseStack();
            pushEnd(top);
        }

        public void printStack() {
            System.out.print(arr);
            System.out.println("-- top");
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.pushEnd(1);
        s.pushEnd(2);
        s.pushEnd(3);
        s.pushEnd(4);

        s.printStack();
        s.reverseStack();
        System.out.println("after reverse");
        s.printStack();
        s.pop();
        s.pop();
        // s.pop();
        // s.pop();

        System.out.println(s.isEmpty());
        s.printStack();
        System.out.println(s.peek());

    }
}
