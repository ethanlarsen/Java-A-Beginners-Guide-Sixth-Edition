package Chapter_2_Introducing_Data_Types_and_Operators;

// Demonstrate lifetime of a variable.
class VarInitDemo {
    public static void main(String args[]) {
        int x;

        for (x = 0; x < 3; x++) {
            int y = -1; // y is initialized each time blck is entered
            System.out.println("y is: " + y); // this always prints -1
            y = 100;
            System.out.println("y is now: " + y);
        }
    }
}