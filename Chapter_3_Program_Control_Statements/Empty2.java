package Chapter_3_Program_Control_Statements;

// Move more out of the for loop.
class Empty2 {
    public static void main(String args[]) {
        int i;

        i = 0; // Move initialization of of loop (The initialization expression is moved out of the loop)
        for(; i < 10; ) {
            System.out.println("Pass #" + i);
            i++; // increment loop control var
        }
    }
}