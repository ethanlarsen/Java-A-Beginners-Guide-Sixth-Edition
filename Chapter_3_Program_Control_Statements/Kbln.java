package Chapter_3_Program_Control_Statements;

// Read a character from the keyboard.
class KbIn {
    public static void main(String args[]) 
        throws java.io.IOException {
            
            char ch;

            System.out.print("Press a kay followed by ENTER: ");

            ch = (char) System.in.read(); // get a char (Read a character from the keyboard)

            System.out.println("Your key is: " + ch);
        }
    }