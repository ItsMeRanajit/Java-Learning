import java.util.ArrayList;;

public class stackUsingArrayList {
    static class Stack {
        ArrayList<Integer> arr = new ArrayList<>();

        public boolean isEmpty() {
            return arr.size() == 0;
        }

        public void push(int data) {
            arr.add(data);
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

        public void printStack() {
            System.out.println(arr);
        }
    }

    public static void main(String args[]) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        s.printStack();
        s.pop();
        s.pop();
        s.pop();
        s.pop();

        System.out.println(s.isEmpty());
        s.printStack();
        System.out.println(s.peek());
    }
}
