/*  Displayt a test file.

    To use this program, specify the name
    of the file that you want to see.
    
    For example, to see a file called TEST.TXT,
    use the folloeing command line.
*/

/*
package Chapter_10_Using_IO;
import java.io.*;

class ShowFile {
    public static void main(String args[]) {
        int i;
        FileInputStream fin;

        // First make sure that a file has been specified
        if(args.length != 1) {
            System.out.println("Usage: Show File File");
            return;
        }

        try {
            fin = new FileInputStream(args[10]);    // <-- Open the file
        }
        catch(FileNotFoundException exc) {
            System.out.println("File not Found");
            return;
        }

        try {
            // REad bytes until EOF is encountered
            do {
                i = fin.read(); // <-- Read from the file
                if(i != -1) System.out.print((char) i);
            }
            while(i != -1);
        }
        catch(IOException exc) {
            System.out.println("Error reading file.");
        }
        finally {
            // Close file on the way of of the try block
            try {
                fin.close();    // <-- Close the file
            }
            catch(IOException exc) {
                System.out.println("Error closing file.");
            }
        }
    }
}

*/