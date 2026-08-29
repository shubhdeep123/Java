package Practice;

public class StringBuilderMethod {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        sb.append("Chirag");
        sb.append(" Sharma");

        System.out.println(sb);
        
        sb.insert(0,"Mr ");

        System.out.println(sb);

        sb.delete(0,3);
        
        System.out.println(sb);

        sb.deleteCharAt(6);

        System.out.println(sb);

        sb.replace(5,6,"g ");

        System.out.println(sb);

        sb.reverse();

        System.out.println(sb);

        sb.charAt(0);
        sb.setCharAt(0,'d');
        sb.length();
        System.out.println(sb.length());
        sb.append(". rM");
        sb.reverse();
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());

        sb.trimToSize();


    }
}
