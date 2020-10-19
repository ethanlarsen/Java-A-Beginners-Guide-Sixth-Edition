package Chapter_14_Lambda_Expression_and_Method_References;

/*
// Demonstrate two simple expressions

// A functional interface.
interface MyValue {
    double getValue();
}

// Another functional interface
interface MyParamValue {
    double getValue(double v);
}


class LambdaDemo {
    public static void main(String args[]) {
        MyValue myVal;  // declare an interface reference

        // Here, the lambda expression is simply a constant expression
        // When it is assigned to myVal, a class instance is
        // constructed in which the lambda express implements
        // the getValue() method in MyValue.
        myVal = () -> 98.6; // <-- A imple lambda expression

        // Call getVAlue(), which is provided by the previously assigned
        // lambda expression.
        System.out.println("A constant value: " + myVal.getValue());

        // Now, create a parameterized lambda expression and assign it to 
        // the reciprocal of its argument
        MyParamValue myPval = (n) -> 1.0 / n;   // <-- A lambada expression that has a parameter

        // Cak getValue(v) through the myPval reference
        System.out.println("Reciprocal of 4 is " + myPval.getValue(4.0));
        System.out.println("Reciprocal of 8 is " + myPval.getValue(8.0));

        // A lambda express must be compatible with the method
        // defined by the functional interface. Therefore, these won't work:
    //  myVal = () -> "Three";  // Error! String not compatible with double!
    //  myPval = () -> Math.random();   // Error! PArmeter required!

    }
}

*/