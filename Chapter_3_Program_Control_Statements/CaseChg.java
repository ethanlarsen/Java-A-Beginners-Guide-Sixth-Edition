package Chapter_3_Program_Control_Statements;

// Case change.
class CaseChg {
    public static void main(String args[])
    throws java.io.IOException {
        char ch;
        int changes = 0;

        System.out.print("Enter period to stop\n");

        do {
            ch = (char) System.in.read();
            if (ch >= 'a' & ch <= 'z') {
                ch -= 32;
                changes++;
                System.out.println(ch);
            }
            else if(ch >= 'A' & ch <= 'Z') {
                ch += 32;
                changes++;
                System.out.println(ch);
            }
        }     while (ch != '.');
        System.out.println("Case changes: " + changes);
    }
}
