
//implementing q using array is not recomended bcz it has fixed size and the time complexity of removing a element is O(n)
import java.util.Arrays;

public class Queues {

    static class Queue {
        int arr[];
        int size;
        int rear = -1;
        int front = -1;

        Queue(int data) {
            this.arr = new int[data];
            this.size = data;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        public void add(int data) {
            if (rear == this.arr.length - 1) { // we can also use size instead of this.arr.length
                System.out.println("Queue is full");
                return;
            }
            rear++;
            arr[rear] = data;
        }

        public int remove() { // O(n)
            if (isEmpty()) {
                System.out.println("Queue has no element");
                return -1;
            }
            // size--;
            int front = arr[0];
            for (int i = 0; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            rear--;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }

        public void printq() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            for (int i = 0; i <= rear; i++)
                System.out.print(arr[i] + " ");
            System.out.println();
        }
    }

    public static void main(String a[]) {
        Queues.Queue q = new Queues.Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // q.add(5);

        q.printq();

        q.remove();

        q.printq();
        System.out.println(q.peek());

    }
}
