package Chapter_2_Introducing_Data_Types_and_Operators;

/*
    Compute the number of cubic inches
    in 1 cubic mile.
*/
class Inched {
    public static void main(String args[]) {
        long ci;
        long im;
        
        im = 5280 * 12;
        ci = im * im * im;

        System.out.println("There are " + ci + 
        " inches in a mile.");
    }
}