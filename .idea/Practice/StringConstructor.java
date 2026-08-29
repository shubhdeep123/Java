package Practice;

public class StringConstructor {
    public static void main(String[] args) {
        // constructor
        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = str2.intern(); // Interning the string

        System.out.println(str1 == str2); // false, because str2 is a new String object in the heap
        System.out.println(str1 == str3); // true, because str3 refers to the interned string in the string pool

        byte[] arr = {72, 101, 108, 108, 111};
        String str4 = new String(arr); // Creating a string from a byte array
        System.out.println(str4); // Output: Hello

        char[] nameCharArr = {'c','h','i','r','a','g', ' ', 's', 'h', 'a', 'r', 'm', 'a'};
        String str5 = new String(nameCharArr); // Creating a string from a char array
        System.out.println(nameCharArr); // Output: Chirag Sharma
        System.out.println(new String(nameCharArr,0,6));

        // stringbuilder
        StringBuilder sb = new StringBuilder("Hello");
        String str6 = new String(sb);
        StringBuffer sbuff = new StringBuffer(" World");
        String str7 = new String(sbuff);

        System.out.println(str6 + str7);

    }
}
