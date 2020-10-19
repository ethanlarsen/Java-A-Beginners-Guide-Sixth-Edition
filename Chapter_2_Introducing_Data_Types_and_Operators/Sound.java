package Chapter_2_Introducing_Data_Types_and_Operators;

/*
    Try This 2-1
    Compute the distance to a lightning 
    strike whose sound takes 7.2 seconds to reach you.
*/
class Sound {
    public static void main(String args[]) {
        double dist;

        dist = 7.2 * 1100;

        System.out.println("The lightening is " + dist + " feet away.");
    }
}