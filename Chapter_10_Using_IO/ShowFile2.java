/*  This variation wraps the code that opens and 
    accesses the file within a single try block.
    The file is closed by the finally block.
*/

package Chapter_10_Using_IO;
import java.io.*;

class ShowFile2 {
    public static void main(String args[]) {
        int i;
        FileInputStream fin = null; // <-- Here, fin is initialized to null

        // First, confirm that a file name has been specified.
        if(args.length != 1) {
            System.out.println("Usage: ShowFile filename");
            return;
        }

        // The following code opens a file, reads characters until EOF
        // is encountered, and then closes the file via a finally block.
        try {
            fin = new FileInputStream(args[0]);

            do {
                i = fin.read();
                if(i != -1) System.out.print((char) i);
            }
            while (i != -1);
        }
        catch(FileNotFoundException exc) {
            System.out.println("File Not Found.");
        }
        catch(IOException exc) {
            System.out.println("An I/O Error Occurred");
        }
        finally {
            // Close file in all cases.
            
            try {
                if(fin != null) fin.close();    // <-- Close fin only if it is not null
            }
            catch(IOException exc) {
                System.out.println("Error Closing File");
            }
        }
    }
}