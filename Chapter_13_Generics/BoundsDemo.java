/*

package Chapter_13_Generics;

// In this version of NumericFns, the type argument
// for T must be either Number, or a class derived
// from Number
class NumericFns<T extends Number> {    // <-- In this case, the type argument must be either Number or a subclass of Number
    T num;

    NumericFns(T n) {
        num = n;
    }

    // Return the reciprocial
    double reciprocal() {
        return 1 / num.doubleValue();
    }

    // Return the fractional component.
    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    // ...
}

// Demonstrate NumericFns.
class BoundDemo {
    public static void main(String args[]) {

        NumericFns<Integer> iOb = new NumericFns<Integer>(5);
        System.out.println("Reciprocial of iOb is " + iOb.reciprocal());
        System.out.println("Fractional component of iOb is " + iOb.fraction());

        System.out.println();

        NumericFns<Double> dOb = new NumericFns<Double>(5.25);
        System.out.println("Reciprocial of iOb is " + dOb.reciprocal());
        System.out.println("Fractional component of iOb is " + dOb.fraction());


        // This won't compile because String is not a 
        // subclass of Number
    // NumericFns<String> strOb = new NumericFns<String>("Error");  <-- String is illegal because its is not a subclass of Number  vx
    }
}
*/
