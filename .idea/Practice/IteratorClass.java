package Practice;

import java.util.*;

public class IteratorClass {

    public static void main(String[] args) {
        // List<Integer> numbers = new ArrayList<>();
        List<Integer> numbers = new LinkedList<>();
        // any data structure can be used here, as long as it implements the Iterator interface
    
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Iterator<Integer> it = numbers.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
