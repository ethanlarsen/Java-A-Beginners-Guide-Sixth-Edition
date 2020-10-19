package Chapter_6_A_Closer_Look_At_Methods_and_Classes;

// Varargs, overloading, and ambiguity.
//
// This program contains an error and will
// not compile!
class VarArgs4 {

    // Use an int vararg parameter.
    static void vaTest(int ... v) { // <-- An int varag
        // ...
    }

    // Use a boolean varag parameter.
    static void vaTest(boolean ... v) { // <-- A boolean varag
        // ...
    }

    public static void main(String args[])
    {
        vaTest(1, 2, 3); // OK
        vaTest(true, false, false); // OK

        // vaTest();   // Error: Ambiguous! <-- Ambiguous!
    }
}