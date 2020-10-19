package Chapter_13_Generics;
/*
// Demonstrate a raw type.
class Gen<T> {
    T ob;   // declare an object of type T

    // Pass the constructor a referenct to
    // an object of type T
    Gen(T o) {
        ob = o;
    }

    // Return on.
    T getob() {
        return ob;
    }
}

// Demonstrate raw type.
class RawDemo {
    public static void main(String args[]) {
        Gen<Integer> iOb = new Gen<Integer>(88);

        // Create a Gen object for Strings
        Gen<String> strOb = new Gen<String>("Generics test");

        // Create a raw-type Gen object and give it
        // a Double value
        Gen raw = new Gen(new Double(98.6));    // <-- When no type argument is suplied, a raw type is created

        // Cast here is necessary because type is unknown
        double d = (Double) raw.getob();
        System.out.println("value: " + d);

        // The use of a raw type can lead to run-time
        // exceptions. Here are some example

        // The following cast causes a run-time error!
    //      int i (Integer) raw.getob();    // run-time error

        // This assignment overrides type safety.
        //strOb = raw;    // OK, but potentiall wrong // <-- Raw types override type safety
    //      Strint str = strOb.getob(); // run-time error

        // This assignment also overrided type safety.
    //  raw = iOb;  // OK, but potentiall wrong
    //      d = (Double) raw.getob();   // run-time rror
    }
}

*/