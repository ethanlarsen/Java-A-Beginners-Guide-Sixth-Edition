package Chapter_5_More_Data_Types_and_Operators;

// Use a for-each style for loop
class ForEach {
    public static void main(String args[]) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        // Use for-each style to display and sum the values.
        for(int x : nums) {      // A for-each style for loop
            System.out.println("Value is: " + x);
            sum += x;
        }
        System.out.println("Summation: " + sum);
    }
}