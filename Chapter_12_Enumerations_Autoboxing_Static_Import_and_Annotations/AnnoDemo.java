/*

package Chapter_12_Enumerations_Autoboxing_Static_Import_and_Annotations;

// An example that uses @Deprecated.

// Deprecate a class.
@Deprecated     // <-- Mark a class as deprecated
                // A marker annotation that indicates that a declaration is obsolete and has been replaced by a newer form
myClass {
    private String msg;

    MyClass(String m) {
        msg = m;
    }

    // Deprecated= a method within a class.
    @Deprecated     // <-- Mark a mthod as deprecated
    String getMsg() {
        return msg;
    }

    // ...
}

class AnnoDemo {
    public static void main(String args[]) {
        MyClass myObj = new MyClass("test");

        System.out.println(myObj.getMsg());
    }
}

*/
