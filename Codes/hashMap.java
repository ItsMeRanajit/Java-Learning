// has mainly 2 feilds , key and value
// key is always unique but values can have dupticates. each key maps a specific value uniquely
//map also stores value unordered

import java.util.*;

public class hashMap {
    public static void main(String a[]) {
        // country(key) String, population(value) int
        HashMap<String, Integer> map = new HashMap<>();

        // insert
        System.out.println("----------insert-----------");
        map.put("India", 140);
        map.put("China", 130);
        map.put("USA", 75);

        System.out.println(map);

        map.put("USA", 40);
        // if key already exists then it gets updated. 75 becomes 40
        // if key doesnot exists then new key created and inserted

        System.out.println(map);

        // search - map.containsKey(key)
        System.out.println("-----------search-----------");
        if (map.containsKey("India"))
            System.out.println("present in map " + map.get("India"));// if key present
        System.out.println(map.containsKey("UK"));// if doesnt exists then false

        // get value - map.get(key);
        System.out.println("---------getvalue-----------");
        System.out.println(map.get("India"));// if key exists
        System.out.println(map.get("UK"));// if not then null

        // iteration
        System.out.println("-----------iteration---------");
        for (Map.Entry<String, Integer> i : map.entrySet())// its a foreach loop
            // entryset creates a hashset of all the pairs. and i goes to each pair and
            // prints it. i contains each pair. where getvalue gets the key from the pair
            System.out.println(i.getKey() + " " + i.getValue());

        // getting only the keys
        System.out.println("------- getting the keys----------");
        Set<String> keys = map.keySet(); // keyset makes a set only of keys
        for (String key : keys) {
            System.out.print(key + " ");
            System.out.println(map.get(key));// if we want we can also get the values with the keys. its another way to
                                             // iterate
        }

        // remove
        System.out.println("----------remove-----------");
        map.remove("China");
        System.out.println("removed china " + map);
    }
}
