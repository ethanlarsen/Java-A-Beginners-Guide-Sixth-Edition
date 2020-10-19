// Use VarArgs with standard arguments.

/*
class VarArgs {
    // Here, msg is a normal parameter and v is a 
    // varargs parameter.
    static void vaTest(String msg, int ... v) {     // <-- A "normal" and vararg parameter
        System.out.println(msg + v.length);
        System.out.println("Contents: ");

        for(int i=0; i < v.length; i++)
            System.out.println("   arg " + i + v.length);
        
        System.out.println();
    }

    public static void main(String args[])
    {
        vaTest("One varag: ", 10);
        vaTest("Three varargs: ", 1, 2, 3);
        vaTest("No varargs: ");
    }
}
*/