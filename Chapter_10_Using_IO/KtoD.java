// A simple key-to-disk utility that demonstrates a FileWriter

package Chapter_10_Using_IO;
import java.io.*;

class KtoD {
    public static void main(String args[]) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter text ('stop' to quit)");
        
        try (FileWriter fw = new FileWriter("test.txt")) {  // <-- Create a FileWriter
            do {
                System.out.print(": ");
                str = br.readLine();

                if(str.compareTo("stop") != 0) break;

                str = str + "\r\n"; // add newLine
                fw.write(str);  // <-- Write strings to the file
            }
            while(str.compareTo("stop") !=0);
        } 
        catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}