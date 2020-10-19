package Chapter_1_Java_Fundamentals;

/*
    Demonstrate a block of code.

    Call this file BlockDemo.java
*/
class BlockDemo {
    public static void main(String args[]) {
        double i, j, d;

        i = 5;
        j = 10;

        // the target of this is a block

        if(i != 0) {
            System.out.println("i does not equal zero");
            d = j / i;
            System.out.println("j / i is " + d);
        }
    }
}