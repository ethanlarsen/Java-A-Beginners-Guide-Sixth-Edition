/* Try This 10-1 A File Comparison Utility

    This project develops a simple, yet useful comparison utility. 
    It works by opening both files to be compared and then reading 
    and comparing each corresponding set of bytes. If a mismatch is 
    found, the files differ. If the end of each file is reached at 
    the same time and if no mismatches have been foujnd, then the 
    files are the same. Notice that it uses a try-with-resources 
    statement to automatically close the files.

    Compart two files.

    To use this program, specify the names
    of the files to be compared on the command line.

    java CompFile FIRST.TXT SECOND.TXT
*/

package Chapter_10_Using_IO;
import java.io.*;

class CompFiles {
    public static void main(String args[]) {
        int i=0, j=0;

        // First, make sure that both files have been specified.
        if(args.length !=2) {
            System.out.println("Usage: CompFiles f1 f2");
            return;
        }

        // Compate the files.
        try (FileInputStream f1 = new FileInputStream(args[0]);
             FileInputStream f2 = new FileInputStream(args[1])) {
                 // Check the contents of each file.
                 do {
                     i = f1.read();
                     j = f2.read();
                     if(i != j) break;
                 }
                 while(i != -1 && j != -1);

                 if(i != j)
                    System.out.println("Files differ.");
                 else
                    System.out.println("Files are the same.");
             }
             catch(IOException exc) {
                 System.out.println("I/O Error: " + exc);
             }
    }
}



