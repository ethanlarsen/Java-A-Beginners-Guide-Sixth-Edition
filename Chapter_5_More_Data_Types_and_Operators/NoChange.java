package Chapter_5_More_Data_Types_and_Operators;

// The for-each loop ios essentially read-only.
class NoChange {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for(int x : nums) {
            System.out.print(x + " ");
            x = x * 10; // no effect on nums        <-- This does not change nums
        }

        System.out.println();

        for(int x : nums)
            System.out.print(x + " ");
        
            System.out.println();
    }
}