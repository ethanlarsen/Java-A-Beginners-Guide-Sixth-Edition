package Chapter_2_Introducing_Data_Types_and_Operators;

// Demonstrate casting.
class CastDemo {
    public static void main(String args[]) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;

        i = (int) (x / y); // cast double to int
        System.out.println("Integer outcome of x / y: " + i);

        i = 100;
        b = (byte) i;   // No loss of info here. A byte cannot hold the value 100
        System.out.println("Value of b: " + b);

        i = 257;
        b = (byte) i;   // Information loss this time. A byte cannot hold the value 257.
        System.out.println("Value of b: " + b);

        b = 88; // ASCII code for x
        ch = (char) b;
        System.out.println("ch: " + ch);
    }
}