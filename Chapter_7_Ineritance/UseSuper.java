package Chapter_7_Ineritance;
// Using super to voercome name hiding.

/*
class A {
    int i;
}

// Create a subclass by extending class A.
class B extends A {
    int i; // this i hides the i in A

    B(int a, int b) {
        super.i = a;    // i in A   <-- Here, super.i refers to the i in A
        i = b;  // i in b
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in superclass: " + i);
    }
}

class UseSuper {
    public static void main(String args[]) {
        B subOb = new B(1, 2);

        subOb.show();
    }
}

*/