import java.util.ArrayList;

public class heap2 {
    static ArrayList<Integer> list = new ArrayList<>();

    public static void main(String ar[]) {
        // list.add(999);
        int arr[] = { 20, 34, 78, 35, 45, 32, 89, 2234, 865, 2, 2, 2, 1 };
        for (int i : arr)
            insert(i);
        System.out.println(list);
        removeHeap();
        System.out.println(list);
        heapSort();
    }

    public static void insert(int num) {
        list.add(num);
        int idx = list.size() - 1;
        while (idx > 1) {
            int parent = idx / 2;
            if (list.get(parent) > list.get(idx)) {
                swap(parent, idx);
                idx = parent;
            } else
                return;

        }
    }

    public static int removeHeap() {
        if (list.size() <= 1) {
            System.out.println("nothing to delete");
            return -1;
        }
        int first = list.get(1);
        int last = list.remove(list.size() - 1);
        if (list.size() != 1) {
            list.set(1, last);
            int idx = 1;
            while (idx < list.size()) {
                int left = idx * 2;
                int right = idx * 2 + 1;
                int larger = idx;
                if (left < list.size() && list.get(left) < list.get(idx))
                    larger = left;
                if (right < list.size() && list.get(right) < list.get(idx))
                    if (list.get(right) < list.get(larger))
                        larger = right;
                if (idx < list.size() && idx != larger) {
                    swap(idx, larger);
                    idx = larger;
                } else
                    break;
            }
        }
        return first;
    }

    public static void heapSort() {
        if (list.size() <= 1) {
            System.out.println("list is empty");
            return;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        while (list.size() > 1) {
            arr.add(removeHeap());
        }
        System.out.println("HeapSorted Array is " + arr);
    }

    public static void swap(int firstidx, int secondidx) {
        int temp = list.get(firstidx);
        list.set(firstidx, list.get(secondidx));
        list.set(secondidx, temp);
        return;
    }
}
