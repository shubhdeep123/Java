package Practice;

public class Calculator {
    public static void main(String[] args) {
        AddCalculator addCalculator = new AddCalculator();

        System.out.println("Addition of 2 and 3: " + addCalculator.add(2, 3));
        System.out.println("Addition of 2, 3 and 4: " + addCalculator.add(2, 3, 4));
        System.out.println("Addition of 2.5 and 3.5: " + addCalculator.add(2.5, 3.5));
        System.out.println("Concatenation of 'Hello' and 'World': " + addCalculator.add("Hello", "World"));
    }
}

class AddCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public String add(String a, String b) {
        return a + b;
    }


}
