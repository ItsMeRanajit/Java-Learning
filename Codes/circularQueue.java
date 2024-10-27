import java.util.Arrays;

public class circularQueue {
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
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front; // to give a circular property
            // size = 5. idx 0 to 4.
            // when idx 2 then next idx is 3. 3%5 =3
            // when 4 then next idx 5 is not possible.
            // so here 4+1 = 5 % 5 = 0. so again back to starting
        }

        public void add(int data) {
            if (isFull()) { // we can also use size instead of this.arr.length
                System.out.println("Queue is full");
                return;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
            if (front == -1)
                front++;
        }

        public int remove() { // O(1) it is less complexity than linear q
            if (isEmpty()) {
                System.out.println("Queue has no element");
                return -1;
            }
            // size--;
            int res = arr[front];
            if (front == rear) {
                rear = -1;
                front = -1;
            } else
                front = (front + 1) % size;
            // same as front. while deleting we reach the end of the q and still theres some
            // element left at the start bcz rear < front

            return res;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[front];
        }

        public void printq() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return;
            }
            // if (rear >= front)
            // for (int i = front; i <= rear; i++)
            // System.out.print(arr[i] + " ");
            // else {
            // for (int i = front; i < size; i++)
            // System.out.print(arr[i] + " ");
            // for (int i = 0; i <= rear; i++)
            // System.out.print(arr[i] + " ");
            // }
            System.out.println(Arrays.toString(arr));

        }
    }

    public static void main(String a[]) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        // q.add(5);

        q.printq();

        q.remove();
        q.add(6);
        q.printq();
        q.remove();
        q.remove();
        q.add(7);
        q.add(8);

        q.printq();
        // System.out.println(q.front);
        System.out.println(q.peek());
        // q.peek();

    }
}
