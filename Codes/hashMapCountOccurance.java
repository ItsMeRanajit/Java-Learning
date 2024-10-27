import java.util.*;

public class hashMapCountOccurance {
    public static void main(String args[]) {
        int arr[] = { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 6, 7, 8, 9, 10 };
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i))
                map.put(i, map.get(i) + 1);
            else
                map.put(i, 1);
        }
        System.out.println(map.getOrDefault(2, 0));
        System.out.println(map);
    }
}
