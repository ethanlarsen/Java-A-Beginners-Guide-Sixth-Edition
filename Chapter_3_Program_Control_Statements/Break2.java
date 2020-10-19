package Chapter_3_Program_Control_Statements;

// Read input until a q is received.
class Break2 {
    public static void main(String args[]) 
        throws java.io.IOException {

            char ch;

            for( ; ; ) { // This "infinite" loop is terminated by the break
                ch = (char) System.in.read(); // get a char
                if(ch == 'q') break; // This "infinite" loop is terminated by the break
            }
        System.out.println("You pressed q!");
    }
}
