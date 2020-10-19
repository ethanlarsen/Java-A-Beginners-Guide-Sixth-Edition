package Chapter_14_Lambda_Expression_and_Method_References;

// Demonstrate a Constructor reference.

// MyFun is a functional interface whose method returns
// a MyClass reference
interface MyFunc {
    MyClass func(String a);
}

class MyClass {
    private String str;

    // This constructor takes an argument.
    MyClass(String s) { str = s; }

    // This is the default constructor
    MyClass() { str = ""; }

    // ...

    String getStr() { return str; }
}

class ConstructorRefDemo {
    public static void main(String args[])
    {
        // Create a reference to the MyClass constructor.
        // Because func() in Myfunc takes an argument, new
        // refers to the parameterized constructor in MyClass,
        // not the default constructor.
        MyFunc myClassCons = MyClass::new;  // A constructor reference

        // Create an instance of MyClass via that constructor reference.
        MyClass mc = myClassCons.func("Testing");

        // Use the instance of MyClass just created.
        System.out.println("str in mc is " + mc.getStr( ));
    }
}