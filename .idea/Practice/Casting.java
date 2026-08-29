package Practice;

public class Casting {
    public static void main(String[] args) {
        // upcasting
        String s = "hello";
        Object obj = s;

        System.out.println(obj);

        // Downcasting
        Object object1 = "Hello";
        String s2 = (String) object1;

        System.out.println(s2);

        // exception
        Object object2 = 10;
        String s3 = (String) object2;

        System.out.println(s3);
    }
}
