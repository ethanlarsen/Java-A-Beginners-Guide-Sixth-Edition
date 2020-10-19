package Chapter_14_Lambda_Expression_and_Method_References;

// A block lambda that finds the smallest positive factor
// of an int value

interface NumericFunc {
    int func(int n);
}

class BlockLambdaDemo {
    public static void main(String args[])
    {
        // This block lambda returns the smallest positive factor of a value.
        NumericFunc smallestF = (n) -> {    // <-- A block lambda expression
            int result = 1;

            // Get absolute value of n
            n = n < 0 ? -n : n;

            for(int i=2; i <= n/i; i++)
                if((n % i) == 0) {
                    result = i;
                    break;
                }                           // <-- A block lambda expression

                return result;
        };

        System.out.println("Smallest factor of 12 is " + smallestF.func(12));
        System.out.println("Smallest factor of 11 is " + smallestF.func(11));
    
    }
}
