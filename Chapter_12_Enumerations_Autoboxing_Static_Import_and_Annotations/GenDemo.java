package Chapter_12_Enumerations_Autoboxing_Static_Import_and_Annotations;

// A simple generic class
// Here, T is a type parameter that
// will be replaced by a real type
// when an object of type Gen tis created.
class Gen<T> {  // <-- Declare a generic class. T is the generic type parameter
    T ob;   // Declare an object of type T

    // Pass th e onstructor a reference to 
    // an object of type T.
    Gen(T o) {
        ob = o;
    }

    // Return ob.
    T getOb() {
        return ob;
    }

    // Show type of T.
    void showType() {
        System.out.println("Type of T is " + ob.getClass().getName());
    }
}

// Demonstrate the generic class
class GenDemo {
    public static void main(String args[]) {
        // Create a Gen regerence for Integers
        Gen<Integer> iOb;   // <-- Create a reference to an object of type Gen<Integer>

        // Create a Gen<Integer> object and assign its
        // reference to iOb. Notice the use of autoboxing
        // to encapsulate the value 88 wihtin an Integer object
        iOb = new Gen<Integer>(88); // <-- Instantiate an onject of type Gen<Integer>

        // Show the type of data used by iOb.
        iOb.showType();

        // Get the value in iOb. Notice that
        // no cast is needed.
        int v = iOb.getOb();
        System.out.println("Value: " + v);

        System.out.println();

        // Create a Gen onject for Strings.
        Gen<String> strOb = new Gen<String>("Generics Test");   // <-- Create a reference and an object of type Gen<String>

        // Show the type of data used by strOb.
        strOb.showType();

        // Get the value of strOb. Again, notice
        // that no cast is needed.
        String str = strOb.getOb();
        System.out.println("Value: " + str);
    }
}