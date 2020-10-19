package Chapter_14_Lambda_Expression_and_Method_References;

// Use a generic functional interface

// A generic functional interface with two parameters
// that returns a boolean result.
interface SomeTest<T> {        // <-- A generic functional interface
    boolean test(T n, T m);
}

class GenericFunctionalInterfaceDemo {
    public static void main(String args[])
    {
        // This lambda expression determines if one integer is
        // a factor of another.
        SomeTest<Integer> isFactor = (n, d) -> (n % d) == 0;

        if(isFactor.test(10, 2))
            System.out.println("2 is a factor of 10");
        System.out.println();

        // The next lambda expression determines if one Double is
        // a factor of another.
        SomeTest<Double> isFactorD = (n, d) -> (n % d) == 0;

        if(isFactorD.test(212.0, 4.0))
            System.out.println("4.0 is a factor of 212.0");
        System.out.println();

        // This lambda expression determines if one string is 
        // part of another.
        SomeTest<String> isIn = (a, b) -> a.indexOf(b) != -1;

        String str = "Generic Functional Interface";

        System.out.println("Testing string: " + str);

        if(isIn.test(str, "face"))
            System.out.println("'face' is found.");
        else
            System.out.println("'face' is not found");
    }
}