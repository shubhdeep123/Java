package Practice;

import java.util.ArrayList;
import java.util.List;

public class WildCard {
    public static void main(String[] args) {
        List<Uncle> uncles = new ArrayList<>();
        uncles.add(new Uncle());
        uncles.add(new Uncle());
        uncles.add(new Uncle());
        uncles.add(new Uncle());

        // fun(uncles);

        List<Relatives> relatives = new ArrayList<>();
        relatives.add(new Relatives());
        relatives.add(new Relatives());
        relatives.add(new Relatives());
        relatives.add(new Relatives());

        // fun(uncles);
        // fun(relatives);

        func2(uncles);


    }

    // static void fun(List<Relatives> relatives) {
    //     for (Relatives relative : relatives) {
    //         relative.eat();
    //     }
    // }

    // generic method with wildcard
    static void fun(List<?> values) {
        for (Object obj : values) {
            System.out.println(obj.getClass().getName());
        }
    }

    // wildcars with upper bound (extends)
    static void func2(List<? extends Relatives> values) {
        Relatives a = values.get(0);
        a.eat();
        for (Relatives relative : values) {
            relative.eat();
        }
    }
}

class Relatives {
    void eat () {
        System.out.println("Relatives Eating");
    }

    void walk() {
        System.out.println("Relatives Walking");
    }
}


class Uncle extends Relatives {
    void bark () {
        System.out.println("Uncle barking");
    }
}