package Chapter_7_Ineritance;

// Demonstrate dynamic method dispatch.

class Sup {
    void who() {
        System.out.println("who() in Sup");
    }
}

class Sub1 extends Sup {
    void who() {
        System.out.println("who() is Sub1");
    }
}

class Sub2 extends Sup {
    void who() {
        System.out.println("who() in Sub2");
    }
}

class DynDispDemo {
    public static void main(String args[]) {
        Sup superOb = new Sup();
        Sub1 subOb1 = new Sub1();
        Sub2 subOb2 = new Sub2();

        Sup supRef;

        supRef = superOb;
        supRef.who();   // In each case, the version of who() to call is determined at run time by the tpe of object being referred to.
    
        supRef = subOb1;
        supRef.who();   // In each case, the version of who() to call is determined at run time by the tpe of object being referred to.

        supRef = subOb2;
        supRef.who();   // In each case, the version of who() to call is determined at run time by the tpe of object being referred to.
    }
}