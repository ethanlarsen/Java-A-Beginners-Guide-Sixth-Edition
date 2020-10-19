// A simple disk-to-screen utility that demonstrates a FileReader

package Chapter_10_Using_IO;
import java.io.*;

class DtoS {
    public static void main(String args[]) {
        String s;

        // Create and use a FileReader wrapped in a BufferedReader.
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {  // Create a File Reader
            while((s = br.readLine()) != null) {
                System.out.println(s);
            }
        }
            catch(IOException exc) {
                System.out.println("I/O Error: " + exc);
            }
        }
    }
    
