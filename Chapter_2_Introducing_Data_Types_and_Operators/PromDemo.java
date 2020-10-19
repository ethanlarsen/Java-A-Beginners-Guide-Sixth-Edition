package Chapter_2_Introducing_Data_Types_and_Operators;

// A promotion surprise!
class PromDemo {
    public static void main(String args[]) {
        byte b;
        int i;

        b = 10;
        i = b * b; // OK, no case needed. No cast needed because result is already elevated to int.

        b  = 10;
        b = (byte) (b * b); // cast needed!! --> Cast is needed here to assign an int to a byte!

        System.out.println("i and b :" + i + " " + b);
    }
}