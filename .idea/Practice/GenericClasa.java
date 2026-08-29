package Practice;


public class GenericClasa {
    public static void main(String[] args) {
        RegularBox b1 = new RegularBox(10);
        System.out.println(b1.getValue());

        GenericBox b2 = new GenericBox("Hello");
        GenericBox b3 = new GenericBox(10);
        GenericBox b4 = new GenericBox(90.0);

        // System.out.println(b2.getValue() + 5); // compile time error ->  need to do down cast

        // downCasting is required if universal Object type is used
        Integer int3 = (Integer) b3.getValue();
        String str2 = (String) b2.getValue();
        Double double4 = (double) b4.getValue();

        // to solve this generic types classes where introduced
        Box<Integer> box1 = new Box<>(10); //type argument
        System.out.println(box1.getValue() + 5);

        Box<String> str1 = new Box<>("hello");
        System.out.println(str1.getValue());

        Box<Boolean> bool1 = new Box<>(true);
        System.out.println(bool1.getValue());


        // Pair class
        Pair<Integer, Integer> p1 = new Pair<>(23,34);
        System.out.println(p1.toString());
        Pair<String,Integer> p2 = new Pair<>("Chirag",27);
        System.out.println(p2.toString());

        // go to generic method class file to check generic methods

    }
}

// more generic with more data types
class Pair<T,U> {
    T first;
    U second;

    Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return new String (first + "," + second);
    }
}


// generics

class Box<T> { //type paramenter
    private T value;

    Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue (T value) {
        this.value = value;
    }

}



class GenericBox {
    private Object value;

    GenericBox(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return this.value;
    }

    public void setValue (Object value) {
        this.value = value;
    }

}


class RegularBox {
    private int value;

    RegularBox(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue (int value) {
        this.value = value;
    }
}
