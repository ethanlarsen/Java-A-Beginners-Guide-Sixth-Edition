package Chapter_3_Program_Control_Statements;

/* Use a for loop to generate the progresssion

    1, 2, 4, 6, 8, 16, ...
*/
class Progress {
    public static void main(String args[]) {

        for (int i = 1; i < 100; i += i) {
            System.out.print(i + " ");
        }
    }
}