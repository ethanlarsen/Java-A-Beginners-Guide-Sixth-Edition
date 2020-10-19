// Write and then read back binary data.

package Chapter_10_Using_IO;
import java.io.*;

class RWData {
    public static void main(String args[]) {
        int i = 10;
        double d = 1023.56;
        boolean b = true;

        // Write some values.
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("testdata"))) 
            {
                System.out.println("Writing " + i);
                dataOut.writeInt(i);                                // <-- Write binary data

                System.out.println("Writing " + d);
                dataOut.writeDouble(d);                             // <-- Write binary data

                System.out.println("Writing " + b);
                dataOut.writeBoolean(b);                            // <-- Write binary data

                System.out.println("Writing " + 12.2 * 7.4);
                dataOut.writeDouble(12.2 * 7.4);                    // <-- Write binary data
        }
        catch(IOException exc) {
            System.out.println("Write error.");
            return;
        }

        System.out.println();

        // Now, read them back.
        try (DataInputStream dataIn = new DataInputStream(new FileInputStream("testdata")))
            {
                i = dataIn.readInt();
                System.out.println("Reading " + i);

                d = dataIn.readDouble();
                System.out.println("Reading " + d);

                b = dataIn.readBoolean();
                System.out.println("Reading " + b);

                d = dataIn.readDouble();
                System.out.println("Reading " + d);
            }
            catch(IOException exc) {
                System.out.println("Read error.");
            }
    }
}