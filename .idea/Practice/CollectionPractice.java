package Practice;

import java.util.*;

public class CollectionPractice {
    public static void main(String[] args) {
        // Collection is an interface in Java that represents a group of objects, known as elements.
        // It is the root interface in the collection hierarchy and provides basic operations for adding, removing, and querying elements.

        // List is an interface that extends Collection and represents an ordered collection of elements.
        // It allows duplicate elements and provides methods for positional access and insertion of elements.

        // Set is an interface that extends Collection and represents a collection of unique elements.
        // It does not allow duplicate elements and provides methods for checking membership and performing set operations.

        // Map is an interface that represents a collection of key-value pairs.
        // It allows mapping keys to values and provides methods for adding, removing, and retrieving values based on keys.

        // Queue is an interface that extends Collection and represents a collection designed for holding elements prior to processing.
        // It follows the First-In-First-Out (FIFO) principle and provides methods for adding, removing, and inspecting elements.

        // Deque is an interface that extends Queue and represents a double-ended queue.
        // It allows insertion and removal of elements from both ends and provides additional methods for manipulating the deque.

        Collection<Integer> collection = new ArrayList<>();
        collection.add(1);
        collection.add(2);
        collection.add(3);

        // size() method returns the number of elements in the collection
        System.out.println("Size of collection: " + collection.size());

        // isEmpty() method checks if the collection is empty
        System.out.println("Is collection empty? " + collection.isEmpty());
        //collection.size() == 0

        // contains() method checks if the collection contains a specific element
        // boolean -> contains(Object o) -> 1,2,3 -> equals() method of the object is used to compare the elements
        System.out.println("Does collection contain 2? " + collection.contains(2));

        // iterator() method returns an iterator over the elements in the collection
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
            System.out.println("Element: " + element);
        }

        // toArray() method returns an array containing all the elements in the collection
        Object[] array = collection.toArray();
        System.out.println("Array: " + Arrays.toString(array));

        // T[] toArray(T[] a) method returns an array containing all the elements in the collection,
        // the runtime type of the returned array is that of the specified array
        Integer[] intArray = collection.toArray(new Integer[0]);
        System.out.println("Integer Array: " + Arrays.toString(intArray));

        // boolean add(E e) method adds the specified element to the collection
        collection.add(4);
        System.out.println("Collection after adding 4: " + collection);
        // if the collection is a Set, the add() method will return false if the element already exists in the set
        // collection.add(2);
        // System.out.println("Collection after adding 2 again: " + collection);

        // boolean remove(Object o) method removes a single instance of the specified element from the collection, if it is present
        collection.remove(2);

        // boolean addAll(Collection<? extends E> c) method adds all the elements in the specified collection to this collection
        Collection<Integer> anotherCollection = new ArrayList<>();
        anotherCollection.addAll(Arrays.asList(5, 6, 7));
        System.out.println("Another Collection: " + anotherCollection);

        // boolean containsAll(Collection<?> c) method checks if this collection contains all the elements in the specified collection
        System.out.println("Does collection contain all elements of anotherCollection? " + collection.containsAll(anotherCollection));

        // boolean removeAll(Collection<?> c) method removes all the elements in this collection that are also contained in the specified collection
        collection.removeAll(anotherCollection);
        System.out.println("Collection after removing all elements of anotherCollection: " + collection);

        // boolean retainAll(Collection<?> c) method retains only the elements in this collection that are contained in the specified collection
        collection.retainAll(anotherCollection);
        System.out.println("Collection after retaining only elements of anotherCollection: " + collection);

    }
}
