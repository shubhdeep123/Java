package Practice;

import java.util.*;

public class MapAndSet {
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<>();
        // set.add(1);
        // set.add(2);
        // set.add(3);
        // set.add(2); // Duplicate element, will not be added
        // System.out.println(set); // Output: [1, 2, 3]

        Set<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("banana"); // Duplicate element, will not be added
        System.out.println(set); // Output: [banana, orange, apple] (order may vary)

        System.out.println(set.contains("banana")); // Output: true

        Map<String, Integer> map = new HashMap<>();
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);
        System.out.println(map); // Output: {banana=2, orange=3, apple=1} (order may vary)

        System.out.println(map.get("banana")); // Output: 2
        System.out.println(map.containsKey("orange")); // Output: true
    }
}