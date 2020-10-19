package Chapter_3_Program_Control_Statements;

// A negatively running for loop.
class DecrFor {
    public static void main(String args[]) {
        int x;

        for(x=100; x > -100; x -= 5)
            System.out.println(x);
    }
}