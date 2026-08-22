import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
