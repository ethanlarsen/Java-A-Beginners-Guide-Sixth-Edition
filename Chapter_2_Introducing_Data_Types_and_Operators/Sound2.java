package Chapter_2_Introducing_Data_Types_and_Operators;

/*
    Try This 2-1
    Compute the distance to a lightning 
    strike whose sound takes 7.2 seconds to reach you.
*/
class Sound2 {
    public static void main(String args[]) {
        double dist;

        dist = 7.2 * (1100/2);

        System.out.println("The echo is " + dist + " feet away.");
    }
}