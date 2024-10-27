import java.util.Stack;

public class queueWith2Stacks {

    Stack<Integer> s1;
    Stack<Integer> s2;

    queueWith2Stacks() {
        this.s1 = new Stack<>();
        this.s2 = new Stack<>();
    }

    public boolean isEmpty() {
        return s1.isEmpty();
    }

    public void push(int data) { // O(n)
        while (!s1.isEmpty())
            s2.push(s1.pop());
        s1.push(data);
        while (!s2.isEmpty())
            s1.push(s2.pop());
    }

    public void remove() {
        if (s1.isEmpty())
            return;
        System.out.println(s1.pop() + " is popped");
    }

    public void peek() {
        if (s1.isEmpty())
            return;
        System.out.println(s1.peek());
    }

    public void printStack() {
        System.out.print("rear -->");
        System.out.print(s1);
        System.out.println("--> front");
    }

    public static void main(String ar[]) {
        queueWith2Stacks q = new queueWith2Stacks();
        q.push(0);
        q.push(1);
        q.push(2);
        q.push(3);

        q.printStack();
        q.remove();
        q.peek();
        q.printStack();

        queueWith2Stacks q2 = new queueWith2Stacks();
        q2.push(2);
        q2.push(2);
        q2.push(2);
        q2.push(2);
        q2.printStack();

        q.remove();
        q.printStack();
    }
}
