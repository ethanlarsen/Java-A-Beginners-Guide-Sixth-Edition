// Use a BufferedReader to reach characters from the console.

package Chapter_10_Using_IO;
import java.io.*;

class ReadChars {
    public static void main(String args[]) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter characters, period to quit.");

        // Read characters
        do {
            c = (char) br.read();
            System.out.println(c);
        }
        while(c != '.');
    }
}
