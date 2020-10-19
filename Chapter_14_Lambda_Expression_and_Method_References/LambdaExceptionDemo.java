package Chapter_14_Lambda_Expression_and_Method_References;

/*
import java.io.*;

interface MyIOAction {
    boolean ioAction(Reader rdr) throws IOException;
}

class LambdaExceptionDemo {

    public static void main(String args[])
    {
        double[] values = { 1.0, 2.0, 3.0, 4.0 };

        // This block lambda could throw an IOexception.
        // Thus, IOException must be specified in a throws
        // clasue of ioAction in MyIOAction.
        MyIOAction myIO = (rdr) -> {    // <-- This lambda might throw an exception
            int ch = rdr.read(); // could throw IOException
            // . . .
            return true;
        };
    }
}
*/