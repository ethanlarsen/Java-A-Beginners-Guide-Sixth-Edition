package Chapter_7_Ineritance;


/*
    Methods with differing signatures are
    overloaded not overriden.
*/
class A{
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    // display i and j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

// create a subclass by extending class A
class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // overload show()
    void show(String msg) { // <-- Because signatures differ, this show() simply oberloades show() in superclass A
        System.out.println(msg + k);
    }
}

class Overload {
    public static void main(String args[]) {
        B subOb = new B(1, 2, 3);
        subOb.show("This is k: ");   // this calls show() in B
        subOb.show();   // this calls show() in A
    }
}
