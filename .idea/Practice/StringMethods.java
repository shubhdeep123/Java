package Practice;

public class StringMethods {
    public static void main(String[] args) {
        // length / Emptiness
        String str1 = new String("Hello");
        String str2 = "hello";
        // System.out.println(str1.length());
        // System.out.println(str1.isEmpty());
        // System.out.println(str1.isBlank()); //should have something except space

        // character access
        // System.out.println(str1.charAt(1));
        // System.out.println(str1.toCharArray());

        // comparison
        // System.out.println(str1.equals(str2));
        // System.out.println(str1.equalsIgnoreCase(str2));
        // System.out.println(str1.compareTo(str2));

        // searching
        // System.out.println(str1.contains("ello"));
        // System.out.println(str1.indexOf('e'));
        // System.out.println(str1.lastIndexOf("el"));
        // System.out.println(str1.startsWith("He"));

        // extraction / transformation
        // System.out.println(str1.substring(2,4));
        // System.out.println(str1.toUpperCase());
        // System.out.println(str1.toLowerCase());
        // System.out.println(str2.trim());
        // System.out.println(str1.strip()); //unicode friendly can print char out of ascii code
        // System.out.println(str2.repeat(6));
        // System.out.println(str1.replace('l','i'));
        // String str3 = "Aditya,Chirag,Honey";
        // String[] strArr = str3.split(",");
        // for (String s : strArr) {
        //     System.out.println(s);
        // }

        // String joinedString = String.join("--","chirag","noni");
        // System.out.println(joinedString);

        // conversion
        String str4 = new String(String.valueOf(10)); // converts 10 integer to string
        System.out.println(str4);

        byte[] byteArr = str2.getBytes();

        for (byte i : byteArr) {
            System.out.println(i);
        }

        // advance methods
        String str5 = new String("billboard");
        String str6 = str5.intern();
        System.out.println(str5 == str6);

        String name = "Chirag";
        int age = 27;
        System.out.println("Hello " + name +", " + "your age is " + age);
        System.out.println(String.format("Hello %s, your age is %s",name,age));
    }
}
