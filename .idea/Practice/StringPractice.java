package Practice;

public class StringPractice {
    public static void main (String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        System.out.println(s1 == s2); // true, because both s1 and s2 refer to the same string literal in the string pool

        String s3 = new String("Hello");
        System.out.println(s1 == s3); // false, because s3 refers to a new String object in the heap, not the string pool

        String s4 = "Ja" + "va";
        String s5 = "Java";
        String s6 = new String("Java");
        System.out.println(s4 == s5); // true, because the compiler optimizes the concatenation of string literals at compile time, so both s4 and s5 refer to the same string literal in the string pool
        System.out.println(s5 == s6); // false, because s6 refers to a new String object in the heap, not the string pool
    }
}
