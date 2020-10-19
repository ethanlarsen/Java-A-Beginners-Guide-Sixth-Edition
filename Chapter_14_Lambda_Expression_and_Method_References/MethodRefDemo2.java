package Chapter_14_Lambda_Expression_and_Method_References;

// Use a method reference to an instance method.

// A functional interface for numeric predicates that operate
// on integer values.
interface IntPredicate {
    boolean test(int n);
}

// This class stores an int value and defines the instance
// method isFactor(), which returns trye if its argument
// is a factor of the stored value.
class MyIntNum {
    private int v;

    MyIntNum(int x) { v = x; }
    int getNum() { return v; }

    // Return true if n is a factor of v.
    boolean isFactor(int n) {
        return (v % n) == 0;
    }
}

class MethodRefDemo2 {
    public static void main(String args[])
    {
        boolean result;

        MyIntNum myNum = new MyIntNum(12);
        MyIntNum myNum2 = new MyIntNum(16);

        // Here, a method reference is to isFactor on myNum is created.
        IntPredicate ip = myNum::isFactor;  //  A method reference to an instance method

        // Now, it is ued to call isFactor() via test().
        ip = myNum::isFactor;
        result = ip.test(3);
        if(result) System.out.println("3 is a factor of " + myNum.getNum());

        // This time, a method reference to isFactor on myNum2 is created
        // an dd used to call isFactor() via test().
        ip = myNum2::isFactor;
        result = ip.test(3);
        if(!result) System.out.println("3 is not a factor of " + myNum2.getNum());
    }
}

// Q: How do I specify a method reference to generic method?

/*
    interface SomeTest<T> {
        boolean test(T n, T m);
    }

    class MyClass {
        static <T> boolean myGenMeth(T x, T y) {
            boolean result = false;
            // . . .
            return result;
        }
    }

    // The following statement is valid
    SomeTest<Integer> mRef = MyClass::<Integer>myGenMeth;












*/