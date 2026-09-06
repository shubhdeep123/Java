package Practice;

import java.util.*;

public class IteratorImp {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "David"};
        NameContainer nameContainer = new NameContainer(names);

        Iterator<String> it = nameContainer.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Enhanced for loop using the Iterable interface
        for (String name : nameContainer) {
            System.out.println(name);
        } 
    }
}


class NameContainer implements Iterable<String> {
    private String[] names;
    private int size;

    NameContainer(String[] names) {
        this.names = names;
        this.size = names.length;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            // anonymous inner class that implements the Iterator interface
            int pos = 0;

            @Override
            public boolean hasNext() {
                return pos < size;
            }

            @Override
            public String next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return names[pos++];
            }
        };
    }


    // nested class that implements the Iterator interface
    // private class NameIterator implements Iterator<String> {
    //     int pos = 0;
    //     @Override
    //     public boolean hasNext() {
    //         return pos < size;
    //     }

    //     @Override
    //     public String next() {
    //         if (!hasNext()) {
    //             throw new NoSuchElementException();
    //         }
    //         return names[pos++];
    //     }
    // }

}