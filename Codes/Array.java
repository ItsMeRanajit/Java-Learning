import packages.calc2;

// import java.util.*;
public class Array {
    public static void main(String[] args) {
        Arr sc = new Arr(4);
        sc.assign(3);
        sc.assign(5);
        sc.assign(7);
        System.out.println("the element at the index 1 is " + sc.get(1));
        System.out.println("the size is " + sc.size());
        calc2 k = new calc2();
        k.print();

    }
}

class Arr {
    private int[] arr;
    private int index;

    public Arr(int size1) {
        arr = new int[size1];
        index = 0;
    }

    public void assign(int element) {
        if (index >= 0 && index < arr.length) {
            arr[index++] = element;
            System.out.println("item " + element + "added in the array at the index" + index);
        }
    }

    public int get(int index1) {
        if (index1 >= 0 && index1 < index) {
            return arr[index1];
        } else {
            System.out.println("index out of bound");
            return -1;
        }
    }

    public int size() {
        return index;
    }

}
