package Chapter_6_A_Closer_Look_At_Methods_and_Classes;

// Demonstrate method overloading.
class Overload {
    void ovlDemo() {    // <-- First version
        System.out.println("No parameters");
    }

    // Overload ovlDemo for one integer parameter
    void ovlDemo(int a) {   // <-- Second version
        System.out.println("One parameter: " + a);
    }

    // Overload ovlDemo for two integer parameters.
    int ovlDemo(int a, int b) { // <-- Third Version
        System.out.println("Two parameters: " + a + " " + b);
        return a + b;
    }

    // Overload ovlDemo for two double parameters.
    double ovlDemo(double a, double b) {   // <-- Fourth version
        System.out.println("Two double parameters: " + a + " " + b);
        return a + b;
    }
}


class OverLoadDemo {
    public static void main(String args[]) {
        Overload ob = new Overload();
        int resI;
        double resD;

        // call all versions of ovlDemo()
        ob.ovlDemo();
        System.out.println();

        ob.ovlDemo(2);
        System.out.println();

        resI = ob.ovlDemo(4, 6);
        System.out.println("Result of ob.ovlDemo(4, 6): " + resI);
        System.out.println();

        resD = ob.ovlDemo(1.1, 2.32);
        System.out.println("Result of ob.oblDemo(1.1, 2.32): " + resD);
    }
}
