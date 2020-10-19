package Chapter_2_Introducing_Data_Types_and_Operators;

/*
    Use the Pythagorean theorem to 
    fine the length of the hypotenuse 
    given the lengths of two opporsing 
    sides.
*/
class Hypot {
    public static void main(String args[]) {
        double x, y, z;

        x = 3;
        y = 4;

        z = Math.sqrt(x*x + y*y);

        System.out.println("Hypotenuse is " + z);
    }
}