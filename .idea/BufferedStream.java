// BufferedStream

import java.io.*;

public class BufferedStream {

    public static void main(String[] args) throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        System.out.print("Enter your name: ");
        String name = br.readLine();
        System.out.println("Hello, " + name + "!");
    }
}