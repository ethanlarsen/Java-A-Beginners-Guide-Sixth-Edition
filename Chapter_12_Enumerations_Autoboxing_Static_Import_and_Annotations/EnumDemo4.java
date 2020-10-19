package Chapter_12_Enumerations_Autoboxing_Static_Import_and_Annotations;

// Demonstrate ordinal() and compareTo().

// An enumeration of Transport varieties.
enum Transport {
    CAR, TRUCK, AIRPLANE, TRAIN, BOAT
}

class EnumDemo4{
    public static void main(String args[]) {
        Transport tp, tp2, tp3;

        // Obtain all ordinal values using ordinal().
        System.out.println("Here all Transport constants" + 
                            " and their ordinal values: ");
        for(Transport t : Transport.values())
            System.out.println(t + " " + t.ordinal());  // <-- Obtain ordinal values

        tp = Transport.AIRPLANE;
        tp2 = Transport.TRAIN;
        tp3 = Transport.AIRPLANE;

        System.out.println();

        // Demonstrate compareTo();
        if(tp.compareTo(tp2) < 0)
            System.out.println(tp + " comes before " + tp2);
        
        if(tp.compareTo(tp2) > 0)
            System.out.println(tp2 + " comes before " + tp);

        if(tp.compareTo(tp3) == 0)
            System.out.println(tp + " equals " + tp3);
    }
}
