// Read a string from console using a BufferedReader

package Chapter_10_Using_IO;
import java.io.*;

class ReadLines {
    public static void main(String args[]) throws IOException {
        // Create a BufferedReader using System.in
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;

        System.out.println("Enter lines of text.");
        System.out.println("Enter 'stop' to quit");

        do {
            str = br.readLine();
            System.out.println(str);
        }
        while(!str.equals("stop"));
    }
}