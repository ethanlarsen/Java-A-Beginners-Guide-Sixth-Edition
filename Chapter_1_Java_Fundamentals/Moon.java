package Chapter_1_Java_Fundamentals;

/*
    Compute your weight on the moon.

    Call this file Moon.java.
*/
class Moon {
    public static void main(String args[]) {
        double earthweight; // weight on earth
        double moonweight; // weight on moon

        earthweight = 213;
        moonweight = earthweight * 0.17;

        System.out.println(earthweight + " earth-pounds is equivalent to " + moonweight + " moon-pounds.");
    }
}