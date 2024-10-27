
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {

    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add(1, "Date"); // Insert "Date" at index 1

        // Display the ArrayList
        System.out.println("ArrayList: " + list);

        // Get an element from the ArrayList
        String fruit = list.get(2);
        System.out.println("Element at index 2: " + fruit);

        // Set an element in the ArrayList
        list.set(2, "Blueberry");
        System.out.println("Updated ArrayList: " + list);

        // Remove an element from the ArrayList
        list.remove("Date"); // Remove by object
        System.out.println("After removing 'Date': " + list);

        // Remove element at a specific index
        list.remove(2); // Remove by index
        System.out.println("After removing element at index 2: " + list);

        // Check if the ArrayList contains an element
        boolean contains = list.contains("Banana");
        System.out.println("Contains 'Banana': " + contains);

        // Get the size of the ArrayList
        int size = list.size();
        System.out.println("Size of the ArrayList: " + size);

        // Iterate through the ArrayList
        System.out.println("Iterating through the ArrayList:");
        for (String item : list) {
            System.out.println(item);
        }

        // Sort the ArrayList
        Collections.sort(list);
        System.out.println("Sorted ArrayList: " + list);

        // Clear all elements from the ArrayList
        list.clear();
        System.out.println("Cleared ArrayList: " + list);

        // Check if the ArrayList is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is the ArrayList empty? " + isEmpty);
    }
}
