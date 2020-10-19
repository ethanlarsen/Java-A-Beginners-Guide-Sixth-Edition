package Chapter_6_A_Closer_Look_At_Methods_and_Classes;

// Display a string backwards using recursion.
class Backwards {
    String str;

    Backwards(String s) {
        str = s;
    }

    void backward(int idx) {
        if(idx != str.length() -1) backward(idx+1);

        System.out.print(str.charAt(idx));
    }
}

class BWDemo {
    public static void main(String args[]) {
        Backwards s = new Backwards("This is a test");

        s.backward(0);
    }
}