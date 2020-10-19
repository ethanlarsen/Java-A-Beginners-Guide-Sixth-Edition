package Chapter_12_Enumerations_Autoboxing_Static_Import_and_Annotations;

// Demonstrate autoboxing/unboxing
class AutoBox {
    public static void main(String args[]) {

        Integer iOb = 100;  // autobox an int <-- Autobox and then auto-unbox the value 100

        int i = iOb;        // auto-unbox     <-- Autobox and then auto-unobx the value 100

        System.out.println(i + " " + iOb);    // Displays 100 100
    }
}