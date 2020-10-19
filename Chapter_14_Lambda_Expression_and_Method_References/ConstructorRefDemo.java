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

/*
    If you wanted MyClass::new to use MyClass's default constructor,
    then you would need to use a functional interface that defines
    a method that has no parameter. For example, if you define 
    MyFun2, as shown here:

    interface MyFunc2 {
        MyClass func();
    }

    // Then the following line will assign to MyClassCons a reference
    // to MyClass's default (i.e. parameterless constructor:

    MyFunc2 myClassCons = MyClass::new;
    
    // In general, the constructor that will be used when ::new is specified 
    // is the one whose parameters match those specified by the functional interface.

*/

/*
    Q: Can I declare a constructor reference that creates an array?
    A: Yes. To create a constructor reference for any array, use this construct:

    type[]::new

    //Here, type specifies the type of object being created. For example, assuming the
    // form of MyClass shown in the preceding example and given the MyClassArrayCreator interface shown here:

    interface MyClassArrayCreator {
        MyClass[] func(int n);
    }

    // For example, you could create an arry of five Thread objects like this:
    MyArrayCreator<Thread> mcArrayCons = Thread[]::new;
    Thread[] thrds = mcArrayCons.func(5);

*/

/*
    In the case of creating a constructor reference for a genderic class,
    you can specify the type parameter in the normal way, after the class name.
    For examle, if MyGenClass is declared like this:
    MyGenClass<T> { //...
    
        // Then the following creates a constructor reference with type argument of Integer.
        MyGenClass<Integer>::new
*/