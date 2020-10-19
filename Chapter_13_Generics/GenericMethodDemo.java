package Chapter_13_Generics;


/*
// Demonstrate a simple generic method.
class GenericMethodDemo {

    // Determine if the contents of two arrays are the smae.
    static<T extends Comparable<T>, V extends T> boolean
        arrayEqual(T[] x, V[] y) {          // <-- A generic method
            // if array lengths differ, then the arrays differ
            if(x.length != y.length) return false;

            for(int i=0; i < x.length; i++)
                if(!x[i].equals(y[i])) return false;
            
            return true;    // contents of arrays are equivalent
    }

    public static void main(String args[]) {
        Integer nums[] = { 1, 2, 3, 4, 5 };
        Integer nums2[] = { 1, 2, 3, 4, 5 };
        Integer nums3[] = { 1, 2, 3, 4, 5 };
        Integer nums4[] = { 1, 2, 3, 4, 5, 6 };

        if(arrayEqual(nums, nums))  // <-- The type arguments for T and V are implicitly determined when the method is called.
            System.out.println("nums equals nums");

        if(arrayEqual(nums, nums2))
            System.out.println("nums equals nums2");

        if(arrayEqual(nums, nums3))
            System.out.println("nums equals nums3");

        if(arrayEqual(nums, nums4))
            System.out.println("nums equals nums4");

        // Create an array of doubles
        
        // Double dvals[] = { 1.1, 2.2, 3.3, 4.4, 5.5 };

            // This won't compile because nums and dvals
            // are not of the same type.
        //      if(arrayEqual(nums, dvals))
        //          System.out.println("nums equals dvals");
    }
}

*/