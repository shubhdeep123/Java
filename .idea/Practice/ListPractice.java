package Practice;

import java.util.*;

public class ListPractice {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // System.out.println(list.get(0)); // Output: 1
        // System.out.println(list.size()); // Output: 3

        // list.set(1, 5); // Replaces the element at index 1 with 5
        // System.out.println(list.get(1)); // Output: 5

        // list.remove(2); // Removes the element at index 2
        // System.out.println(list.size()); // Output: 2
        // System.out.println(list.get(1)); // Output: 5

        // list.addAll(Arrays.asList(6, 7, 8)); // Adds multiple elements to the list
        // System.out.println(list); // Output: [1, 5, 6, 7, 8]

        // ListIterator<Integer> listIterator = list.listIterator();
        // while (listIterator.hasNext()) {
        //     Integer element = listIterator.next();
        //     System.out.println("Element: " + element);
        // }

        // ListIterator<Integer> listIterator = list.listIterator(2); // Starts the iterator at index 2
        // while (listIterator.hasPrevious()) {
        //     Integer element = listIterator.previous();
        //     System.out.println("Element: " + element);
        // }

        List<Integer> subList = List.of(2, 3, 4); // Creates a view of the list from index 1 to 3
        // subList.add(10); // not supported, as List.of() returns an immutable list

        List<Integer> copyList = List.copyOf(subList); // Creates a new list that is a copy of the sublist
        copyList.add(10); // this will throw an UnsupportedOperationException, as copyOf() returns an unmodifiable list
        System.out.println(list); // Output: [1, 5, 10, 6, 7, 8]
    }
}
