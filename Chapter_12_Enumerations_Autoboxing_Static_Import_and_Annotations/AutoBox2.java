package Chapter_12_Enumerations_Autoboxing_Static_Import_and_Annotations;

// Autoboxing/unboxing takes place with
// method parameters and return values

class Autobox2 {
    // This method has an Integer parameter
    static void m(Integer v) {  // <-- Receives an Integer
        System.out.println("m() received " + v);
    }

        // This method returns an int.
        static int m2() {   // <-- Returns an int
            return 10;
        }

        // This method returns an Integer
        static Integer m3() {   // <-- Returns an Integer
            return 99;  // autoboxing 99 into an Integer.
        }
    
    public static void main(String args[]) {

        // Pass an int to M().Because m() has an Integer
        // parameter, the int value passed is automatically boxed
        m(199);

        // Here, iOb receives the int value returned by m2().
        // There value is automatically boxed so that it can be
        // assigned to iOb.
        Integer iOb = m2();
        System.out.println("Return value from m3() is " + iOb);

        // Next, m3() is called. It returns an Integer value
        // which is auto-unboxed into an int
        int i = m3();
        System.out.println("Return value from m3() is " + i);

        // Next, Math.sqrt() is called wiht iOb as an argument.
        // In this case, iOb is auto-unobxed with its value promoted to
        // double, wihch is the type needed by sqrt().
        iOb = 100;
        System.out.println("Square root of iOb is " + Math.sqrt(iOb));
    }
}

