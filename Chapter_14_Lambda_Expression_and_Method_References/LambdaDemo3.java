package Chapter_14_Lambda_Expression_and_Method_References;

// A functional interface that tests two strings
interface StringTest {
    boolean test(String aStr, String bStr);
}

class LambdaDemo3 {
    public static void main(String args[])
    {
        // This lambada expression determines if one string is
        // part of another
        StringTest isIn = (a, b) -> a.indexOf(b) != -1;

        String str = "This is a test";

        System.out.println("Testing strint: " + str);

        if(isIn.test(str, "is a"))
            System.out.println("'is a' found.");
        else
            System.out.println("'is a' not found.");

        if(!isIn.test(str, "xyz"))
            System.out.println("'xyz' not found.");
        else
            System.out.println("'xyz' not found.");


    }
    
}
