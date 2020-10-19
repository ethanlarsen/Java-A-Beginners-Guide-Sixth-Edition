/*
package Chapter_12_Enumerations_Autoboxing_Static_Import_and_Annotations;

// Use the built-in enumeration methods.

// An enumeration of Transport varieties
enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

class EnumDemo2{
    public static void main(String args[]) {
        Transport tp;

        System.out.println("Here are all the Transport constants");

        // Use values()
        Transport allTransports[] = Transport.values(); // <-- obtain an arroy of Transport constants
        for (Transport t : allTransports)
            System.out.println(t);

        System.out.println();

        // use valueOf()
        tp = Transport.valueOf("AIRPLANE"); // <-- Obtain the constant with the name AIRPLANE
        System.out.println("tp contains " + tp);
    }
}

*/