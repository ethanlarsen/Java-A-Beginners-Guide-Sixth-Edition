/*
    Copy a text file, substituting hyphens for spaces.

    This version uses character streams.

    To use this program, specify the name
    of the source file and the destination file.
    
    For example,

    java Hyphen 2 source target
*/

package Chapter_10_Using_IO;
import java.io.*;

class Hyphen2 {
    public static void main(String args[]) throws IOException {
        int i;

        // first make sure that both files have been specified.
        if(args.length != 2) {
            System.out.println("Usage: CopyFile From To");
            return;
        }

        // Copy the file and substitute hyphens.
        // Use the try-with-resources statement
        try (FileReader fin = new FileReader(args[0]); FileWriter fout = new FileWriter(args[1])) {

        do {
            i = fin.read();
            // convert speace to a hyphen
            if((char) i == ' ') i = '-';

            if(i != -1) fout.write(i);
        }
        while(i != -1);
        }
        catch(IOException exc) {
        System.out.println("I/O Error: " + exc);
        }
    }
}
