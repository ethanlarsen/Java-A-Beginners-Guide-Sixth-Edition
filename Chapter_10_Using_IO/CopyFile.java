/*
    Copy a text file.
    To use this program, specify the name
    of the source file an dthe destination file.
    
    For example, to copy a file called FIRST.TXT
    to a file called SECOND.TXT, use the following
    command line.

    java CopyFile FIRST.TXT SECOND.TXT
*/

package Chapter_10_Using_IO;
import java.io.*;

class CopyFile {
    public static void main(String args[]) throws IOException {
        int i;
        FileInputStream fin = null;
        FileOutputStream fout = null;

        // First, make sure that both files have been specified.
        if(args.length != 2) {
            System.out.println("Usage: CoopyFile from to");
            return;
        }

        // Copy a File.
        try {
            // Attempt to open the file.
            fin = new FileInputStream(args[0]);
            fout = new FileOutputStream(args[1]);

            do {
                i = fin.read();             // <-- Read bytes from one file...
                if(i != -1) fout.write(i);  // <-- ... and write them to another
            }
            while(i != -1);
        }
        catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
        finally {
            try {
                if(fin != null) fin.close();
            }
            catch(IOException exc) {
                System.out.println("Error Closing Input File");
            }
            try {
                if(fout != null) fout.close();            
            }
            catch(IOException exc) {
                System.out.println("Error Closing Output File");
            }
        }
    }
}