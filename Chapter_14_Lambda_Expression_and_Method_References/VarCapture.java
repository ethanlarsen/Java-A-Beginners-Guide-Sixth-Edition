package Chapter_14_Lambda_Expression_and_Method_References;

// An example of capturing  a local variable from the enclosing scope.

interface MyFunc {
    int func(int n);
}

class VarCapture {
    public static void main(String args[])
    {
        // A local variable that can be captured
        int num = 10;

        MyFunc myLambda = (n) -> {
            // This use of num is OK. It does not modify num
            int v = num + n;

            // However, the following is illegal because it attempts
            // to modify the value of num
        //  num++;

            return v;
        };

        // Use the lambda. This will display 18.
        System.out.print(myLambda.func(8));

        // The following line would also cause an error, because
        // it would remove the effictively final status from num.
    // num = 9;
    }
}