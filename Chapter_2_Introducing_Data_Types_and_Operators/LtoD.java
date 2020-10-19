package Chapter_2_Introducing_Data_Types_and_Operators;

// Demonstrate automatic conversion from long to double.

class LtoD {
    public static void main(String args[]) {
        long L;
        double D;

        L = 100123285L;
        D = L;

        System.out.println("L and D: " + L + " " + D);


// *** This program will not compile. ***
/*
class Ltod {
    public static void main(String args[]) {
        long L;
        double D;

        D = 100123285.0;
        L = D; // Illegal!

        System.out.println("L an dD: " + L + " " + D);
    }
}
*/

    }
}
