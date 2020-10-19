package Chapter_12_Enumerations_Autoboxing_Static_Import_and_Annotations;

enum Tools{
    SCREWDRIVER, WRENCH, HAMMER, PLIERS
}

class ShowEnum{
    public static void main(String args[]) {
        for(Tools d : Tools.values())
        System.out.println(d + " has ordinal value of " + d.ordinal() + '\n');
    }
}