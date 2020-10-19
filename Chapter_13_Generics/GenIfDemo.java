/*

package Chapter_13_Generics;

// A generic interface example.

// A generic containment interface.
// This interface imples  that an implementing
// class contains one or more values.
interface Containment<T> {  // <-- A generic interface
    // The contains() method tests if a 
    // specific item is contained within
    // an object that implements Containment.
    boolean contains(T o);
    }

    // Implement Containment using an array to
    // hold the values
    class MyClass<T> implements Containment<T> {    // <-- any class that implements a generic interface must itself be generic
        T[] arrayRef;

        MyClass(T[] o) {
            arrayRef = o;
        }
    
    // Implement contains()
    public boolean contains(T o) {
        for(T x : arrayRef)
            if(x.equals(o)) return true;
        return false;
    }
}


class GenIfDemo {
    public static void main(String args[]) {
        Integer x[] = { 1, 2, 3 };

        MyClass<Integer> ob = new MyClass<Integer>(x);
            if(ob.contains(2))
                System.out.println("2 is in ob");
            else
                System.out.println("2 is NOT in ob");

            if(ob.contains(5))
                System.out.println("5 is in ob");
            else    
                System.out.println("5 is NOT in ob");
            
                // The following is illegal because ob
                // is an Interger Containment and 9.25 is 
                // a Double value
            
        //  if(ob.contains(9.25))
            //  System.out.println("9.25 is in ob");
    }
}


*/