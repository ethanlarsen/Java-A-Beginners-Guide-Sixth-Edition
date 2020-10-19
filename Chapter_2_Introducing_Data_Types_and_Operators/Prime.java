package Chapter_2_Introducing_Data_Types_and_Operators;

// Find prime numbers between 2 and 100.
class Prime {
    public static void main(String args[]) {
        int i, j;
        boolean isprime;

        for(i=2; i < 100; i++) {
            isprime = true;

            //see if the number is evenly divisible
            for(j=2; j <= i/j; j++)
                // if it is, then it's not prime
                if((i&j) == 0) isprime = false;
            
            if(isprime)
                System.out.println(i + " is prime.");
        }

    }
}