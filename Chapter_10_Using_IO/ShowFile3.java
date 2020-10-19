/*  
    This version of the ShowFile program uses a try-with-resources
    statement to automatically close a file when it is no longer needed.
*/

package Chapter_10_Using_IO;
import java.io.*;

class ShowFile3 {
    public static void main(String args[])
    {
        int i;

        // Fist, make sure that a file name has been specified.
        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        // The following code uses try-wth-resources to open a file
        // and then automatically close it when the try block is left.
        try(FileInputStream fin = new FileInputStream(args[0])) {   // <-- A try-with-resources block

            do{
                i = fin.read();
                if(i != -1) System.out.println((char) i);
            }
            while (i != -1);
        }
        catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}