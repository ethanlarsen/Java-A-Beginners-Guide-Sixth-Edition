package Chapter_5_More_Data_Types_and_Operators;

// Demonstrate an array overrun
class ArrayErr {
    public static void main(String args[]) {
        int sample[] = new int[10];
        int i;

        // generate an array overrun
        for(i = 0; i < 100; i = i+1)
            sample[i] = i;
    }
}