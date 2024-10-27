import java.util.ArrayList;

public class heap {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String a[]) {
        // ArrayList<Integer> list = new ArrayList<>();
        int arr[] = { 60, 50, 40, 45, 5, 20, 30, 10, 30 };
        for (int i : arr)
            insert(i);
        System.out.println(list);
        // int val = removeFirst(list);
        // remove(list);
        heapSort();
    }

    public static void insert(int num) {
        list.add(num);
        upheap(list.size() - 1);
    }

    public static void upheap(int idx) {
        if (idx == 0)
            return;
        int p = idx / 2;
        if (list.get(p) < list.get(idx)) {
            swap(p, idx);
            upheap(p);
        }
    }

    public static int removeFirst() {
        if (list.isEmpty()) {
            System.out.println("list is empty");
            return -1;
        }
        int temp = list.get(0);
        int last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downHeap(0);
        }
        return temp;
    }

    public static void downHeap(int idx) {
        int min = idx;
        int left = idx * 2;
        int right = idx * 2 + 1;

        if (left < list.size() && list.get(min) > list.get(left)) {
            min = left;
        } else if (right < list.size() && list.get(min) > list.get(right)) {
            min = right;
        }
        if (min != idx) {
            swap(min, idx);
            downHeap(min);
        }
        return;
    }

    public static void heapSort() {
        ArrayList<Integer> arr = new ArrayList<>();
        while (!list.isEmpty()) {
            arr.add(removeFirst());
        }
        System.out.println(arr);
    }

    private static void swap(int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
}
