package Chapter_2_Introducing_Data_Types_and_Operators;

// Demonstrate the short-circuit operators.
class SCops {
    public static void main(String args[]) {
        int n, d;

        n = 10;
        d = 2;
        if(d != 0 && (n % d) == 0) 
            System.out.println(d + " is a factor of " + n);

        d = 0;
        
        // Since d is zero, the second operand is not evaluated.
        if(d !=0 && (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
        


        /*
        Now, try same thing without short-circuit operator.
        This will cause a divide=by-zero error.
        */

        /*
        if(d !=0 & (n % d) == 0)
            System.out.println(d + " is a factor of " + n);
        */
    }
}