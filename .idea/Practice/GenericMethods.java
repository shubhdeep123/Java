package Practice;

public class GenericMethods {
    public static void main(String[] args) {
        Integer y = getResult(67);
        System.out.println(y);

        String s = getResult("Hello");
        System.out.println(s);

        printPairs(y,s); //type inference -> java dedeuces type of parameters by it self by judging the values of parameters
    }

    public static <T> T getResult(T x) { //<T> Type Parameter
        return x;
    }

    public static <T,U> void printPairs(T first, U second) {
        System.out.println(first + ", " + second);
    }
}
