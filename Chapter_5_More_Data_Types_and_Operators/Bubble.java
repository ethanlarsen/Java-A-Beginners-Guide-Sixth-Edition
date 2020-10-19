package Chapter_5_More_Data_Types_and_Operators;

/*
    Try This 5-1

    Demonstrate the Bubble sort.
*/

class Bubble {
    public static void main(String args[]) {
        int nums[] = { 99, -10, 100123, 18, -978, 
            5623, 463, -9, 287, 49 };

            int a, b, t;
            int size;   // number of elements to sort

            size = 10; // number of elements to sort

            // display original array
            System.out.print("Original array is:");
            for(int i=0; i < size; i++)
                System.out.print(" " + nums[i]);
            System.out.println();

            // This is the Bubble sort.
            for(a=1; a < size; a++)
             for(b = size-1; b >=a; b--) {
                if(nums[b-1] > nums[b]) {   // if out of order
                    t = nums[b-1];
                    nums[b-1] = nums[b];
                    nums[b] = t;
                }
            }

            // display sorted array
            System.out.print("Sorted array is:");
            for(int i=0; i < size; i++)
                System.out.print(" " + nums[i]);
            System.out.println();
    }
}