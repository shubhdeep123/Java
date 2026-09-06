package Practice;

import java.util.*;

public class ConcurrentModification {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        
        Iterator<Integer> it = numbers.iterator();
        while (it.hasNext()) {
            Integer number = it.next();
            // System.out.println(number);
            if (number == 2) {
                // numbers.remove(2); // This will cause ConcurrentModificationException
                it.remove(); // This is the correct way to remove an element while iterating
            }
        }

        // Iterator<Integer> it2 = numbers.iterator();
        // while (it2.hasNext()) {
        //     Integer number = it2.next();
        //     System.out.println(number);
        // }
    }
}
